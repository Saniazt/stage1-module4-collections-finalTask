package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer , Set<String>> map = new TreeMap<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            if (!map.containsKey(e.getKey().length()))
                map.put(e.getKey().length(), Set.of(e.getKey()));
            else {
                Set<String> set = new HashSet<>();
                set.addAll(map.get(e.getKey().length()));
                set.add(e.getKey());
                map.put(e.getKey().length(), set);
            }
        }
        return map;
    }
}
