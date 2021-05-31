package com.cy.collection;

import java.io.*;
import java.util.*;

public class list_test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Integer> arrayList = new ArrayList<>();
        //初始容量测试,jdk1.8以前为10,1.8以后为0
        //添加元素时进行扩容，默认为10
        arrayList.add(1);
        for (int i=0;i<100;i++){
            //每次扩容都是当前容量的1.5倍
            arrayList.add(i);
        }

        //可预知list大小的时候要指定容量大小
        //验证clone和toArray方法,都是浅拷贝
        ArrayList<Map<String,String>> mapList = new ArrayList<>(5);
        Map<String,String> map = new HashMap<>();
        map.put("ss","33");
        Map<String,String> map2 = new HashMap<>();
        map.put("ss2","332");
        mapList.add(map);
        mapList.add(map2);

        ArrayList<Map<String,String>> mapList1 = new ArrayList<>();
        Map<String,String>[] maps = new Map[1];
        Map<String,String>[] mapList2 =  mapList.toArray(maps);

       /* map.put("ss","22");
        System.out.println(mapList1.get(0).toString());
        System.out.println(mapList2[0].toString());*/

        //remove和set方法测试,都是通过System.arraycopy()来移动元素，移除掉的元素，置为空
        arrayList.remove(10);
        mapList1.add(map);
        mapList.removeAll(mapList1);

        //序列化
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("D://out.text"));
        oos.writeObject(mapList);

        //反序列化
        File file = new File("D://out.text");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ArrayList<Map<String,String>> arrayList2 = (ArrayList<Map<String,String>>)ois.readObject();
        System.out.println(arrayList2.toString());
        List<Integer> linkedList = new LinkedList<>();



    }
}
