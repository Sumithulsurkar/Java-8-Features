/*
package com.threading;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentData {

    private Map<String, Integer> mapData;
    private String stdName;

    public Map<String, Integer> getMapData() {
        return mapData;
    }

    public void setMapData(Map<String, Integer> mapData) {
        this.mapData = mapData;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public static void main(String[] args) {

        Map<String, Integer> val = new HashMap<>();
        val.put("Math", 90);
        val.put("Physics", 85);
        val.put("History", 78);
        Map<String, Integer> val2 = new HashMap<>();
        val2.put("Math", 92);
        val2.put("Physics", 88);
        val2.put("History", 75);
        Map<String, Integer> val3 = new HashMap<>();
        val3.put("Math", 85);
        val3.put("Physics", 95);
        val3.put("History", 80);

        List<Map<String, Integer>> studentData = new ArrayList<>();

        studentData.add(val);
        studentData.add(val2);
        studentData.add(val3);

        studentData.stream().flatMap(map -> map.values().stream())
                .mapToInt(Integer::intValue).average()
                .ifPresent(avg -> System.out.println("Average is : " + avg));

        studentData.stream().flatMap(m -> m.values().stream())
                .collect(Collectors.groupingBy(

                }));

    }

}
*/
