package com.handy.playerintensify.entity;

import lombok.Data;

/**
 * 玩家强化信息
 *
 * @author handy
 **/
@Data
public class PlayerIntensifyEntity {
    /**
     * 主键id
     */
    private Long id;
    /**
     * 玩家名
     */
    private String playerName;
    /**
     * 玩家uuid
     */
    private String playerUuid;
    /**
     * 强化总数
     */
    private Long sum;
    /**
     * 成功次数
     */
    private Long succeedNum;
    /**
     * 成功超过10的次数
     */
    private Long tenNum;
    /**
     * 失败次数
     */
    private Long failureNum;
    /**
     * 掉级次数
     */
    private Long levelOffNum;
    /**
     * 消失次数
     */
    private Long vanishNum;
    /**
     * 最高等级
     */
    private Integer maxLevel;
    /**
     * 最高等级装备名称
     */
    private String maxLevelName;
    /**
     * 最高装备材质名字
     */
    private String materialName;
}
