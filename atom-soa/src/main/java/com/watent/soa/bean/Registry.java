package com.watent.soa.bean;

import com.watent.soa.registry.BaseRegistry;
import com.watent.soa.registry.RedisRegistry;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 注册
 *
 * @author Atom
 */
@Data
public class Registry implements Serializable {

    private String protocol;

    private String address;

    private static Map<String, BaseRegistry> registryMap = new HashMap<>();

    static {
        registryMap.put("redis", new RedisRegistry());
    }

    public Map<String, BaseRegistry> getRegistryMap() {
        return registryMap;
    }
}
