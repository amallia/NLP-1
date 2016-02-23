package HMM;


import java.util.HashMap;
import java.util.Map;

public class WordTag {
    private Map<String, Integer> tagMap;

    public WordTag () {
        this.tagMap = new HashMap<>();
    }
    public void setTagMap (String tag) {
        if (tagMap.containsKey(tag)) {
            Integer count = tagMap.get(tag);
            tagMap.put(tag, count + 1);
        } else {
            tagMap.put(tag, 1);
        }
    }
}