package cn.hamster3.bot.model.voidTrader;

import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-27
 */
@Data
public class Inventory {
    private String item; // 物品名
    private int ducats; // 杜卡德金币数
    private long credits; // 星币数
}
