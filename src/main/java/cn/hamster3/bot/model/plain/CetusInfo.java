package cn.hamster3.bot.model.plain;

import java.time.LocalDateTime;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CetusInfo extends BaseInfo {
    private boolean isDay; // 是否是白天
    private String timeLeft; // 剩余时间
    private boolean isCetus;
    private String shortString;
}
