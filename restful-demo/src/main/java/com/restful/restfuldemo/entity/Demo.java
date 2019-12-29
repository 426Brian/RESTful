package com.restful.restfuldemo.entity;

import java.util.HashMap;
import java.util.HashSet;

public class Demo {

    private String name;
    private Integer seasonCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeasonCount() {
        return seasonCount;
    }

    public void setSeasonCount(Integer seasonCount) {
        this.seasonCount = seasonCount;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", seasonCount=" + seasonCount +
                '}';
    }

    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.name= "aa";
        Demo demo1 = new Demo();
        demo1.name= "aa";

        System.out.println("== "+(demo == demo1));
        System.out.println("equals "+demo.equals(demo1));
        System.out.println("demo hashcode "+demo.hashCode()+" demo1 hashcode  "+demo1.hashCode());

        HashMap<String, Demo> map = new HashMap<>();
        map.put("1", demo);
        map.put("2", demo1);
        System.out.println(map);

        HashSet<Demo> set = new HashSet<>();
        set.add(demo);
        set.add(demo1);
        System.out.println(set);
    }
}
