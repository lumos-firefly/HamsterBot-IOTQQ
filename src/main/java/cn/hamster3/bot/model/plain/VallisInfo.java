package cn.hamster3.bot.model.plain;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 福尔图娜信息
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class VallisInfo extends BaseInfo {
    private boolean isWarm;
    private String timeLeft;
    private String shortString;
}
