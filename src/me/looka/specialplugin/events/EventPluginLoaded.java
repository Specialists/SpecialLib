package me.looka.specialplugin.events;

import me.looka.specialevent.types.Event;
import me.looka.specialplugin.Plugin;


/**
 * @author lucamasira
 * This event will be fired when a plugin is fully loaded.
 */
public class EventPluginLoaded extends Event {
	
	/**
	 * The plugin that is loaded.
	 */
	private final Plugin plugin;
	
	/**
	 * The constructor which takes the plugin as an argument.
	 * @param plugin the plugin that is loaded
	 */
	public EventPluginLoaded(final Plugin plugin) {
		this.plugin = plugin;
	}
	
	/**
	 * Get the plugin.<br>
	 * @return the plugin that is loaded.
	 */
	public final Plugin getPlugin() {
		return plugin;
	}

}
