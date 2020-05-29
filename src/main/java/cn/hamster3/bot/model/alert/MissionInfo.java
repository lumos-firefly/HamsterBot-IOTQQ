package cn.hamster3.bot.model.alert;

import cn.hamster3.bot.model.Reward;
import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-28
 */
@Data
public class MissionInfo {
    private String node; // 警报所处的节点
    private String type; // 任务类型
    private String faction; // 阵营
    private Reward reward; //  警报的奖励
    private int minEnemyLevel;
    private int maxEnemyLevel;
    private int maxWaveNum;
    private boolean nightmare; //是否为噩梦任务
    private boolean archwingRequired; // 空战任务
}
