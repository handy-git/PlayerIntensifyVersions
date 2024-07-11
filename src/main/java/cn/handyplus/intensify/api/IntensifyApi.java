package cn.handyplus.intensify.api;

import cn.handyplus.intensify.constants.IntensifyCardEnum;
import cn.handyplus.intensify.entity.PlayerIntensifyEntity;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

/**
 * API
 *
 * @author handy
 **/
public class IntensifyApi {

    private static class SingletonHolder {
        private static final IntensifyApi INSTANCE = new IntensifyApi();
    }

    public static IntensifyApi getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 增加对应插件的玩家强化概率
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
     * 减少对应插件的玩家强化概率
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
     * 清理对应插件的玩家强化概率
     *
     * @param pluginName 插件名
     * @param playerUuid 玩家UUID
     * @return true/成功
     */
    public boolean clear(String pluginName, UUID playerUuid) {
        return true;
    }

    /**
     * 获取对应插件的玩家强化概率
     *
     * @param pluginName 插件名
     * @param playerUuid 玩家UUID
     * @return 数量
     */
    public int get(String pluginName, UUID playerUuid) {
        return 0;
    }

    /**
     * 获取玩家总强化概率
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
        return null;
    }

    /**
     * 获取高级炉岩碳
     *
     * @return 高级炉岩碳
     * @since 2.2.5
     */
    public ItemStack giveEnchantedCokes() {
        return new ItemStack(Material.AIR);
    }

    /**
     * 获取强化券
     *
     * @param level         等级
     * @param intensifyCard 类型
     * @return 强化券
     * @since 2.2.5
     */
    public ItemStack giveIntensifyCard(Integer level, IntensifyCardEnum intensifyCard) {
        return new ItemStack(Material.AIR);
    }

    /**
     * 获取强化保护符
     *
     * @return 强化保护符
     * @since 2.2.5
     */
    public ItemStack giveProtectionAmulet() {
        return new ItemStack(Material.AIR);
    }

    /**
     * 获取神圣的强化保护券
     *
     * @return 强化保护符
     * @since 2.2.5
     */
    public ItemStack giveProtectionCard() {
        return new ItemStack(Material.AIR);
    }

    /**
     * 获取炉岩碳
     *
     * @return 炉岩碳
     * @since 2.2.5
     */
    public ItemStack giveRyanCokes() {
        return new ItemStack(Material.AIR);
    }

    /**
     * 获取强化秘药
     *
     * @return 强化秘药
     * @since 2.2.5
     */
    public ItemStack giveSecretMedicines() {
        return new ItemStack(Material.AIR);
    }

}
