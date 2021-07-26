package com.handy.playerintensify.api;

import com.handy.playerintensify.entity.PlayerIntensifyEntity;

import java.util.UUID;

/**
 * api
 *
 * @author handy
 **/
public class IntensifyApi {

    private static class SingletonHolder {
        private static final IntensifyApi INSTANCE = new IntensifyApi();
    }

    public static IntensifyApi getInstance() {
        return IntensifyApi.SingletonHolder.INSTANCE;
    }

    /**
     * 加
     *
     * @param pluginName 插件名
     * @param playerUuid 玩家UUID
     * @param num        数量
     * @return true/成功
     */
    public boolean add(String pluginName, UUID playerUuid, int num) {
        return true;
    }

    /**
     * 减少
     *
     * @param pluginName 插件名
     * @param playerUuid 玩家UUID
     * @param num        数量
     * @return true/成功
     */
    public boolean sub(String pluginName, UUID playerUuid, int num) {
        return true;
    }

    /**
     * 清理
     *
     * @param pluginName 插件名
     * @param playerUuid 玩家UUID
     * @return true/成功
     */
    public boolean clear(String pluginName, UUID playerUuid) {
        return true;
    }

    /**
     * 获取
     *
     * @param pluginName 插件名
     * @param playerUuid 玩家UUID
     * @return 数量
     */
    public int get(String pluginName, UUID playerUuid) {
        return 0;
    }

    /**
     * 获取
     *
     * @param playerUuid 玩家UUID
     * @return 数量
     */
    public int get(UUID playerUuid) {
        return 0;
    }

    /**
     * 获取玩家强化记录
     *
     * @param playerUuid 玩家UUID
     * @return PlayerIntensifyEntity
     */
    public PlayerIntensifyEntity getIntensify(UUID playerUuid) {
        return new PlayerIntensifyEntity();
    }

}
