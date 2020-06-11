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
public class EventInfo extends BaseInfo {
    private String faction;
    private String description;
    private String node;
    private String health; // 任务剩余点数
}
