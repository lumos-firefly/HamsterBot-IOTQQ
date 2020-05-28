package cn.hamster3.bot.model.bounty;

import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-26
 */
@Data
public class RewardInfo {
    private long id;
    private String itemName;
    private String rarity; // 稀有度
    private float chance; // 奖励获取概率
}
