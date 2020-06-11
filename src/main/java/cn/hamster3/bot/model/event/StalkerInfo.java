package cn.hamster3.bot.model.event;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-06-08
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StalkerInfo extends BaseInfo {
    private String agentType; // 小小黑名字
    private String locationTag;
    private int rank;
    private double healthPercent; // 血量，乘100为百分比
    private long fleeDamage;
    private String lastDiscoveredTime; // 最近发现时间
    private String lastDiscoveredAt; // 最近一次发现地点
    private boolean isDiscovered; //是否出现
    private boolean isUsingTicketing;
    private String pid;
}
