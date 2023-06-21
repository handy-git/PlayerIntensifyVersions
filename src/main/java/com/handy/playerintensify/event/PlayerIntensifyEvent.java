package com.handy.playerintensify.event;

import com.handy.playerintensify.param.IntensifyResult;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * 玩家强化装备事件
 *
 * @author handy
 **/
public class PlayerIntensifyEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final IntensifyResult intensifyResult;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public PlayerIntensifyEvent(IntensifyResult intensifyResult) {
        this.intensifyResult = intensifyResult;
    }

    public IntensifyResult getIntensifyResult() {
        return intensifyResult;
    }

    public Player getPlayer() {
        return intensifyResult.getPlayer();
    }

    public int getLevel() {
        return intensifyResult.getLevel();
    }

    public int getResult() {
        return intensifyResult.getResult();
    }

    public String getDisplayName() {
        return intensifyResult.getDisplayName();
    }

}