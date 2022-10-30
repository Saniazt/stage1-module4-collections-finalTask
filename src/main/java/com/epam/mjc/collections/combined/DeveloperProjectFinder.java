package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String,Set<String>> e : projects.entrySet()) {
            if(e.getValue().contains(developer)) {
                list.add(e.getKey());
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).length() > list.get(j).length()){
                    String s = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,s);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).length() == list.get(j).length() && list.get(i).charAt(0) > list.get(j).charAt(0)){
                    String s = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,s);
                }
            }
        }
        return list;
    }
}
