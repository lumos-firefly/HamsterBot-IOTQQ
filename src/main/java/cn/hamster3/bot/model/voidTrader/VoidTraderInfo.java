package cn.hamster3.bot.model.voidTrader;

import java.util.List;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-27
 */
@Data
public class VoidTraderInfo extends BaseInfo {
    private String activation; // 当前状态的起始时间
    private String startString;
    private boolean active; // 用以标志当前虚空商人是否抵达中继站
    private String character;
    private String location; // 虚空商人即将或已经抵达的中继站
    private List<Inventory> inventory; // 虚空商人的货物列表
    private String psId;
    private String endString;
}
