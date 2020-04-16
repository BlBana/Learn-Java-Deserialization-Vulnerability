package cc.blbana.Basic;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class FJMap {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key1", "One");
        map.put("key2", "Two");

        // 序列化
        String mapJson = JSON.toJSONString(map);
        System.out.println(mapJson);

        // 反序列化
        Object map1 = JSON.parseObject(mapJson);
        System.out.println(map1.getClass().getName());
    }
}
