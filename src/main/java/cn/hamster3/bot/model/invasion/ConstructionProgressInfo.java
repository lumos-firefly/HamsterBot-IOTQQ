package cn.hamster3.bot.model.invasion;

import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-27
 */
@Data
public class ConstructionProgressInfo {
    private String id;
    private String fomorianProgress; //巨人战舰建造进度
    private String razorbackProgress; // 利刃豺狼建造进度
    private String unknownProgress;
}
