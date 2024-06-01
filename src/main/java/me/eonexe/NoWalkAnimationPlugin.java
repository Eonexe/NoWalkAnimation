package me.eonexe;

import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.plugin.Plugin;

/**
 * Example rusherhack plugin
 *
 * @author John200410
 */
public class NoWalkAnimationPlugin extends Plugin {
	
	@Override
	public void onLoad() {
		
		//logger
		this.getLogger().info("Hello from NoWalkAnimations ");
		
		//creating and registering a new module
		RusherHackAPI.getModuleManager().registerFeature(new NoWalkAnimationModule());
	}
	
	@Override
	public void onUnload() {
		this.getLogger().info("Example plugin unloaded!");
	}
	
}