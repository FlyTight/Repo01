package com.bishe.utli;

import java.util.HashMap;
import java.util.Map;

public class ResultEntity {
    private Map<String,Object> map = new HashMap<>();


    public static ResultEntity success(){
        ResultEntity entity = new ResultEntity();
        entity.map.put("statusCode",200);
        entity.map.put("message","成功");
        return entity;
    }

    public static ResultEntity error(){
        ResultEntity entity = new ResultEntity();
        entity.map.put("statusCode",500);
        entity.map.put("message","失败");
        return entity;
    }
    public ResultEntity put(String key,Object value){
       this.map.put(key,value);
        return this;
    }


    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
