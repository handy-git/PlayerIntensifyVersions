package cn.handyplus.intensify.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 强化券类型
 *
 * @author handy
 */
@Getter
@AllArgsConstructor
public enum IntensifyCardEnum {

    /**
     * 黑铁
     */
    IRON_INGOT("iron_ingot", 1),
    /**
     * 青铜
     */
    BRONZE("bronze", 5),
    /**
     * 白银
     */
    BAI_YIN("bai_yin", 10),
    /**
     * 黄金
     */
    GOLD_INGOT("gold_ingot", 30),
    /**
     * 铂金
     */
    PLATINUM("platinum", 50),
    /**
     * 翡翠
     */
    EMERALD("emerald", 70),
    /**
     * 钻石
     */
    DIAMOND("diamond", 90),
    /**
     * 强化券
     */
    INTENSIFY_CARD("intensify_card", 100),
    ;

    private final String type;
    private final Integer probability;

    /**
     * 获取提醒
     *
     * @return 全部类型
     */
    public static List<String> getTypes() {
        List<String> types = new ArrayList<>();
        for (IntensifyCardEnum value : IntensifyCardEnum.values()) {
            types.add(value.getType());
        }
        return types;
    }

    /**
     * 获取对应类型
     *
     * @param type 类型
     * @return 类型枚举
     */
    public static IntensifyCardEnum getEnum(String type) {
        for (IntensifyCardEnum intensifyCardEnum : IntensifyCardEnum.values()) {
            if (intensifyCardEnum.getType().equalsIgnoreCase(type)) {
                return intensifyCardEnum;
            }
        }
        return null;
    }

    /**
     * 获取强化券名称
     *
     * @param level 等级
     * @param type  类型
     * @return 类型描述
     * @since 2.2.5
     */
    public static String getName(Integer level, String type) {
        return "";
    }

}
