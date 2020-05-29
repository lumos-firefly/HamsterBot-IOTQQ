package cn.hamster3.bot.model.sortie;

import java.util.List;

import cn.hamster3.bot.model.BaseInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SortieInfo extends BaseInfo {
    private String activation;
    private String startString;
    private boolean active;
    private String rewardPool;
    private List<VariantInfo> variants;
    private String boss;
    private String faction; // 阵营
    private boolean expired;
    private String eta;
}
