package cn.hamster3.bot.model.invasion;

import java.util.List;

import cn.hamster3.bot.model.BaseInfo;
import cn.hamster3.bot.model.Reward;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InvasionInfo extends BaseInfo {
    private String activation;
    private String startString;
    private String node;
    private String desc;
    private Reward attackerReward;
    private String attackingFaction;
    private Reward defenderReward;
    private String defendingFaction;
    private boolean vsInfestation; // 是否对抗I系
    private long count;
    private long requiredRuns;
    private double completion; // 进度
    private boolean completed;
    private String eta;
    private List<String> rewardTypes;
}
