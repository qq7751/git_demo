package com.nuist.map;

import com.nuist.classfile.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
//        创建map对象
        HashMap<String, Person> personHashMap = new HashMap<>();
//        创建Person对象
        Person p1 = new Person("ss",29,'M');
        Person p2 = new Person("qq",27,'F');
        Person p3 = new Person("xin",26,'M');
        Person p4 = new Person("lin",26,'F');

//        添加元素到map集合
        personHashMap.put("it0004",p1);
        personHashMap.put("it0002",p2);
        personHashMap.put("it0001",p3);
        personHashMap.put("it0003",p4);

//        删除元素remove
//        personHashMap.remove("it0001",p3);

//        判断是否包含元素
//        System.out.println(personHashMap.containsKey("it001"));
//        System.out.println(personHashMap.containsValue(new Person("helen",27,'F')));

//        遍历集合元素，方法一
//        现获取键，再找对应的值
        Set<String> key = personHashMap.keySet();
        for (String s : key) {
            Person p = personHashMap.get(s);
            System.out.println(s+" : "+p.getName()+"--"+p.getAge()+"--"+p.getSex());
        }
        System.out.println("+++++++++++++++++++");

//        方法二，利用map的新方法，创建嵌套set集合
        Set<Map.Entry<String, Person>> set = personHashMap.entrySet();
//        遍历集合
        for (Map.Entry<String, Person> map : set) {
            String keys = map.getKey();
            Person p = map.getValue();
            System.out.println(keys+" : "+p.getName()+"--"+p.getAge()+"--"+p.getSex());
        }
    }
}
/*  Hashtable与HashMap的区别：
 *  Hashtable：线程安全，不允许null键和null值
 *  HashMap：非线程安全，允许null键和null值

 * List，Set，Map等接口是否都继承自Map接口？
 * List和Set继承自Collection接口
 * Map接口本身就是顶层接口
* */
package com.nuist.map;

import com.nuist.classfile.Person;

import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {
    public static void main(String[] args) {
//        创建对象
        Hashtable<String, Person> hashtable = new Hashtable<>();
//        添加元素，键和值不能为null值，报异常NullPointerException
        hashtable.put(null, new Person("qq", 25, 'F')); //NullPointerException
        hashtable.put("it", null); // NullPointerException
        hashtable.put("hello", new Person("qq", 25, 'F'));
        hashtable.put("java", new Person("ss", 27, 'M'));

//        遍历元素
        Set<String> keySet = hashtable.keySet();
        for (String key : keySet) {
            Person p = hashtable.get(key);
            System.out.println(key+":"+p.getName()+"--"+p.getAge()+"--"+p.getSex());
        }
    }
}

