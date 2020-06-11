package cn.hamster3.bot.model.nightwave;

import java.util.List;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-06-08
 */
@Data
public class NightWaveInfo extends BaseInfo {
    private String activation;
    private String startString;
    private boolean active;
    private int season;
    private String tag;
    private int phase;
    private Param params;
    private List<ActiveChallengeInfo> possibleChallenges;
    private List<ActiveChallengeInfo> activeChallenges; // 当前的电波任务
    private List<String> rewardTypes;


    @Data
    class Param{
        private int wgsc;
        private double wsr;
    }
}
