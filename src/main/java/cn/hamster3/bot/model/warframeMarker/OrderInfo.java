package cn.hamster3.bot.model.warframeMarker;

import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-06-11
 */
@Data
public class OrderInfo {
    private String userName;
    private int platinum;
    private int quantity;
    private String status;
    private String itemName;
    private int mod_Level;
    private String orderType;
}
