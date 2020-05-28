package cn.hamster3.bot.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-28
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DarvoInfo extends BaseInfo {
    private String item; // 特价物品名
    private int originalPrice; // 初始价格
    private int salePrice; // 打折后的价格
    private int total; // 全部数量
    private int sold; // 已售出
    private String eta;
    private int discount; // 折扣
}
