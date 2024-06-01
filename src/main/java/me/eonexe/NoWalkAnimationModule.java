package me.eonexe;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.events.render.EventRender2D;
import org.rusherhack.client.api.events.render.EventRender3D;
import org.rusherhack.client.api.events.render.EventRenderEntity;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.client.api.render.IRenderer2D;
import org.rusherhack.client.api.render.IRenderer3D;
import org.rusherhack.client.api.render.font.IFontRenderer;
import org.rusherhack.client.api.setting.BindSetting;
import org.rusherhack.client.api.setting.ColorSetting;
import org.rusherhack.client.api.utils.ChatUtils;
import org.rusherhack.client.api.utils.WorldUtils;
import org.rusherhack.core.bind.key.NullKey;
import org.rusherhack.core.event.subscribe.Subscribe;
import org.rusherhack.core.setting.BooleanSetting;
import org.rusherhack.core.setting.NumberSetting;
import org.rusherhack.core.setting.StringSetting;
import org.rusherhack.core.utils.ColorUtils;

import java.awt.*;

/**
 * Example rusherhack module
 *
 * @author John200410
 */
public class NoWalkAnimationModule extends ToggleableModule {

    public NoWalkAnimationModule() {
        super("Anti-Player Swing", "Disables players walking animation.", ModuleCategory.CLIENT);
    }

    @Subscribe
    private void onRenderEntity(EventRenderEntity event) {
        final Entity entity = event.getEntity();
        if((entity instanceof Player player)) {
            player.walkAnimation.setSpeed(0f);
            player.walkAnimation.update(0f, event.getPartialTicks());
        }
    }
}
