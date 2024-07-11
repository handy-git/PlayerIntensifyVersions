package cn.handyplus.intensify.entity;

import lombok.Data;

/**
 * 强化记录
 *
 * @author handy
 **/
@Data
public class PlayerIntensifyEntity {

    /**
     * ID
     */
    private Integer id;

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
    private Integer sum;

    /**
     * 成功次数
     */
    private Integer succeedNum;

    /**
     * 成功超过10的次数
     */
    private Integer tenNum;

    /**
     * 失败次数
     */
    private Integer failureNum;

    /**
     * 掉级次数
     */
    private Integer levelOffNum;

    /**
     * 消失次数
     */
    private Integer vanishNum;

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
