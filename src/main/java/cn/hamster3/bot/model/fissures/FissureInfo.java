package cn.hamster3.bot.model.fissures;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FissureInfo extends BaseInfo {
    private String activation;
    private String startString;
    private boolean active;
    private String node; // 裂缝所处的节点
    private String missionType;
    private String enemy;
    private String tier; // 纪元
    private int tierNum; // 纪元的数字表示
    private boolean expired;
    private String eta;
}
