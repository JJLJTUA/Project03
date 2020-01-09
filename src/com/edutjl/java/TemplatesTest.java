package com.edutjl.java;

import java.util.ArrayList;

/**
 * @author jjl
 * @data 2020/1/7 - 22:07
 */
public class TemplatesTest {
    //prsf
    private static final int id=122;
    //psf
    public static final int gid=123456;
    //psfi
    public static final int nid=456;
    //psfs
    public static final String s="你好";

    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello");
        TemplatesTest Te=new TemplatesTest();
        Te.add(12);
        int a=10;
        //soutv
        System.out.println("a = " + a);
        String[] arr=new String[]{"TOM","JERRY","HANMEIMEI"};
        //fori
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(234);
        list.add(456);
        for (Object o : list) {
            System.out.println(o.toString());
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        }
    public void add(int a){
        //模板三:soutp带形参
        System.out.println("a = [" + a + "]");
        //soutm
        System.out.println("TemplatesTest.add");
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(234);
        list.add(456);
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //ifn
        if (list == null) {

        }
        //xxx.nn//xxx.null
        if (list != null) {

        }

    }
}
