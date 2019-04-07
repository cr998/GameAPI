package org.mineacademy.gameapi;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;

/**
 * Represents the editing stage of an arena
 */
public interface Setup {

	/**
	 * Gets the player currently editing it
	 *
	 * Typically we only support one editor at this time
	 *
	 * @return the editor, null if none
	 */
	public Player getEditor();

	/**
	 * Is the arena currently being edited?
	 *
	 * @return true if the arena is being edited
	 */
	public boolean isEdited();

	/**
	 * Is the arena ready to be played?
	 * Typically all the other boolean flags must be true for this to come true
	 *
	 * @return if the arena is ready
	 */
	public boolean isReady();

	/**
	 * Is the lobby point set?
	 *
	 * @return true if lobby is set
	 */
	public boolean isLobbySet();

	/**
	 * Are region points set?
	 *
	 * @return if both primary and secondary points are set
	 */
	public boolean isRegionSet();

	/**
	 * Is there at least 1 functional spawn point for players?
	 *
	 * @return true if arena can spawn players
	 */
	public boolean isPlayerSpawnpointSet();

	/**
	 * Is there at least 1 join sign ? Not mandatory.
	 *
	 * @return true if join sign exist(s)
	 */
	public boolean areJoinSignsSet();

	/**
	 * Called when a player starts editing the arena
	 *
	 * @param player the player
	 */
	public void onEnterEditMode(Player player);

	/**
	 * Called when a player stops editing the arena
	 *
	 * @param player the player
	 */
	public void onLeaveEditMode(Player player);

	/**
	 * Called when a player clicks a block during his editing
	 *
	 * Typically used to open Mob Spawner Menu when the spawner is right clicked
	 *
	 * @param player the player
	 * @param action the action
	 * @param block the clicked block
	 */
	public void onSetupClick(Player player, Action action, Block block);

}