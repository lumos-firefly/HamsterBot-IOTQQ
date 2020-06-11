package cn.hamster3.bot.model.warframeMarker;

import java.util.List;

import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-06-11
 */
@Data
public class WMResult {
    private List<OrderInfo> orders;
    private ItemInfo info;
}
