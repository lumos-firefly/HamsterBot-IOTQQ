package cn.hamster3.bot.model.alert;

import java.util.List;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-28
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AlertInfo extends BaseInfo {
    private String activation;
    private MissionInfo mission;
    private boolean expired;
    private String eta;
    private List<String> rewardTypes;
}
