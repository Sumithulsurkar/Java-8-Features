package com.db;

import java.util.*;
import java.util.stream.Collectors;

public class UpdateUtility {

    public static void main(String[] args) {
    String sql = "UPDATE ANSWERS SET COL1='val1', COL2='val2' WHERE COL1=val1 AND COL2='val2' " +
            "AND COL3=val3 AND COL4='val4' AND COL5='val5'";

    String setStr = sql.substring(sql.indexOf("SET") + 4, sql.indexOf("WHERE")).replace("\\s", "");
    String conditionStr = sql.substring(sql.indexOf("WHERE") + 6);

    List<String> setList = new ArrayList<>();
    List<String> conditionList = new ArrayList<>();
    HashMap<String, String> setHashmap = new LinkedHashMap<>();
    setList = prepareList(setStr, setList, ",");
    conditionList = prepareList(setStr, conditionList, "AND");

    }

    private static List<String> prepareList(String str, List<String> list, String splitter) {
        if(str.contains(splitter)) {
            String[] setStrArray = str.split(splitter);
            list = Arrays.stream(setStrArray).map(String::trim).collect(Collectors.toList());
        } else list.add(str);
        return list;
    }
}


