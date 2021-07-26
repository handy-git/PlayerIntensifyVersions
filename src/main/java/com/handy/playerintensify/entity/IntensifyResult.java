package com.handy.playerintensify.entity;

import lombok.Data;
import org.bukkit.entity.Player;

/**
 * 强化结果
 *
 * @author handy
 **/
@Data
public class IntensifyResult {
    /**
     * 结果 -1 强化异常 0:强化成功  1: 强化失败,装备掉级 2:强化失败,装备消失 3:强化上限  4: 强化失败,但是使用了保护券
     */
    private int result;
    /**
     * 当前等级
     */
    private int level;
    /**
     * 玩家
     */
    private Player player;

    /**
     * 装备名字
     */
    private String displayName;

    /**
     * 装备材质名字
     */
    private String materialName;
}
