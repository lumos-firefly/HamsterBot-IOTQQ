package cn.hamster3.bot.model.sortie;

import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-29
 */
@Data
public class VariantInfo {
    private String boss;
    private String planet;
    private String missionType;
    private String modifier;
    private String modifierDescription;
    private String node;
}
