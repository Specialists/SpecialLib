package me.looka.specialplugin.events;

import me.looka.specialevent.types.EventCancellable;
import me.looka.specialplugin.Plugin;


/**
 * @author lucamasira
 * This event will be fired when a plugin is being unloaded
 */
public class EventPluginUnload extends EventCancellable {
	
	/**
	 * The plugin that is being unloaded.
	 */
	private final Plugin plugin;
	
	/**
	 * The constructor which takes the plugin as an argument.
	 * @param plugin the plugin that is being unloaded
	 */
	public EventPluginUnload(final Plugin plugin) {
		this.plugin = plugin;
	}
	
	/**
	 * Get the plugin.<br>
	 * @return the plugin that is being unloaded.
	 */
	public final Plugin getPlugin() {
		return plugin;
	}

}
