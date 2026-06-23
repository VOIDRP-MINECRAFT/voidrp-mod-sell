package ru.voidrp.modsell.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Fired when a player successfully sells modded items via /modsell or /msellall.
 */
public final class PlayerModSellEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final String playerName;
    private final String modId;
    private final int amount;
    private final double totalMoney;

    public PlayerModSellEvent(String playerName, String modId, int amount, double totalMoney) {
        this.playerName  = playerName;
        this.modId       = modId;
        this.amount      = amount;
        this.totalMoney  = totalMoney;
    }

    public String getPlayerName()  { return playerName; }
    public String getModId()       { return modId; }
    public int    getAmount()      { return amount; }
    public double getTotalMoney()  { return totalMoney; }

    @Override public HandlerList getHandlers()      { return HANDLERS; }
    public static HandlerList    getHandlerList()   { return HANDLERS; }
}
