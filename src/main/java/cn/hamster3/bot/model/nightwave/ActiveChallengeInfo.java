package cn.hamster3.bot.model.nightwave;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-06-08
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ActiveChallengeInfo extends BaseInfo {
    private String activation;
    private String startString;
    private boolean active; // 指示该任务是否正在进行
    private boolean isDaily; // 是否为日常任务 ，若为周长任务，则不存在该字段
    private boolean isElite; // 是否为精英任务
    private String desc; // 任务描述
    private String title; // 任务标题
    private long reputation; // 该任务的声望值
}
