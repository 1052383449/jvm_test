package com.cy.collection;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class map_test {
    public static void main(String[] args) {

        Map<String,Object> hashMap = new HashMap<>();
        //hashMap在创建时并不初始化链表数组，在添加元素的时候检查数组列表是空数组时创建
        //初始容量是16，并且它的容量必须是2的幕
        //null的key放在数组 0 下标位置上
        //容量为2的次方数，是为了使用hash值和容量来判断数组下标
        //2的次方数二进制位有效位开头是1后面都是0，容量-1后二进制有效位都是1
        //通过移位操作符>> >>> <<和按位运算符 &、|、^来使hash值的高位数和低位数参与到运算
        //增加散列性，最后得出key的在数组中的下标
        //数组扩容要判断数组的entry对象的数量是否大于阈值（数组容量*加载因子）
        //并且根据key的hash值找到的数组下标有值的情况下才会进行扩容。
        //扩容时创建一个两倍于当前容量的数组，然后把链表倒序放入新的数组。
        //扩容时一般不会进行rehash，除非当前数组的容量超过了Integer.MAX_VALUE
        //hashmap在多线程环境下，扩容有可能会造成死循环
        hashMap.put("1","1");
        hashMap.put("2","3");
        hashMap.get("1");
        System.out.println( 2 & (16-1));
        System.out.println( 2 & (32-1));

        Map<String,Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("1","1");
        concurrentHashMap.put("2","3");
        concurrentHashMap.get("1");


        Map<String,Object> hashtable = new Hashtable<>();


        Map<String,Object> treeMap = new TreeMap<>();


        Map<String,Object> linkedHashMap = new LinkedHashMap();
    }
}
