package cn.com.collection;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        //testIteratorList();
        //testIteratorSet();
        testIteratorMap();
        System.out.println("========");
        testIteratorMap2();
    }
    public static void testIteratorList() {
        List<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小红");
        list.add("小军");
        for (Iterator<String> s = list.iterator(); s.hasNext(); ) {
            String tmp = s.next();
            System.out.println(tmp);
        }
    }
    public static void testIteratorSet() {
        Set<Integer> ss = new HashSet<>();
        ss.add(1);
        ss.add(2);
        ss.add(3);
        for (Iterator<Integer> a = ss.iterator(); a.hasNext() ;) {
            Integer tmp = a.next();
            System.out.println(tmp);
        }
    }
    //遍历Map的第一种方法
    public static void testIteratorMap() {
        //map里面有entrySet()方法会返回一个Set集合，然后遍历Set集合
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"小军");
        map.put(200,"小红");
        map.put(300,"小亮");
        //System.out.println(map);
        //调用Map的entrySet()方法 返回一个Set的集合
        Set<Map.Entry<Integer,String>> aa=  map.entrySet();
        for (Iterator<Map.Entry<Integer,String>> a = aa.iterator();a.hasNext(); ) {
            Map.Entry<Integer,String> tmp = a.next();
            System.out.println(tmp);
        }
    }
    //遍历Map的第二种方法
    public static void testIteratorMap2() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"星期一");
        map.put(2,"星期二");
        map.put(3,"星期三");
        //Map里面有keySet()方法获取key值，返回一个Set的集合，然后遍历Set

        Set<Integer> aa= map.keySet();
        for (Iterator<Integer> a = aa.iterator(); a.hasNext(); ) {
            Integer tmp = a.next();
            System.out.println(tmp+"---"+map.get(tmp));
        }
    }
}
