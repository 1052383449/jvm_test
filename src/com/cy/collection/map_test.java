package com.cy.collection;


import java.util.*;

public class map_test {
    public static void main(String[] args) {

        Map<String,Object> hashMap = new HashMap<>();
        //hashMap在创建时并不初始化链表数组，在添加元素的时候检查数组列表是空数组时创建
        //初始容量是16，并且它的容量必须是2的幕
        hashMap.put("1","1");
        hashMap.put("2","3");
        hashMap.get("1");
        System.out.println( 2 & (16-1));
        System.out.println( 2 & (32-1));
        Map<String,Object> hashtable = new Hashtable<>();


        Map<String,Object> treeMap = new TreeMap<>();


        Map<String,Object> linkedHashMap = new LinkedHashMap();
    }
}
