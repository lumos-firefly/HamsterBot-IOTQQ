package cn.hamster3.bot.model.plain;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EarthInfo extends BaseInfo {
    private boolean isDay;
    private String timeLeft;
}
