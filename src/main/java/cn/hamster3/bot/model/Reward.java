package cn.hamster3.bot.model;

import java.util.List;

import lombok.Data;

/**
 * @author wangjing <wangjing16@kuaishou.com>
 * Created on 2020-05-28
 */
@Data
public class Reward {
    private List<String> items;
    private List<CountedItem> countedItems;
    private long credits;
    private String asString;
    private String itemString;
    private String thumbnail; // 奖励的图片
    private long color;

    @Data
    static class CountedItem {
        private long count;
        private String type;
    }
}
