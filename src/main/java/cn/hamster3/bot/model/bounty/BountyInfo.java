package cn.hamster3.bot.model.bounty;

import java.util.List;

import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-26
 */
@Data
public class BountyInfo {
    private int minLevel;
    private int maxLevel;
    private String sign; // 赏金任务地区标识
    private int order; // 排序
    private List<RewardInfo> rewardInfos;

}
