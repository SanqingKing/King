package com.ziweiking.utils;


import org.apache.commons.lang3.ObjectUtils;

import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KingFor {
    private static KingFor kingFor=null;
    public static KingFor getKingFor(){
        if(kingFor==null) {
            synchronized (KingFor.class){
                kingFor = new KingFor();
            }
        }
        return kingFor;
    }
    /**
     * 数组获取指定索引元素
     * */
    public Object kingArrayIndex(Object obj,int index) {
        return Array.get(obj,index);
    }
    /**
     * 遍历打印到控制台
     * */
    public void kingForPrint(Object obj){
        if(ObjectUtils.isEmpty(obj)){
            System.out.println("null not print！");
        }else {
            if (obj instanceof Set){
                for (Object o: (Set)obj) {
                    System.out.println(o);
                }
            }else if (obj instanceof Map){
                Map map = (Map)obj;
                Set set = map.entrySet();
                for (Object en : set) {
                    Map.Entry entry = (Map.Entry) en;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    System.out.println("key:"+key+"+value:"+value+";");
                }
            }else if (obj instanceof List){
                List list=(List)obj;
                for (Object o : list) {
                    System.out.println(o);
                }
            }
        }
    }
    /**
     * 遍历打印到控制台
     * */
    public void kingForPrint(Object obj, OutputStream outputStream){
        if(ObjectUtils.isEmpty(obj)){
            System.out.println("null not print！");
        }else {
            if (obj instanceof Set){
                for (Object o: (Set)obj) {
//                        outputStream.write((kingIsObjectClass(o).getClass())o);

                }
            }else if (obj instanceof Map){
                Map map = (Map)obj;
                Set set = map.entrySet();
                for (Object en : set) {
                    Map.Entry entry = (Map.Entry) en;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    System.out.println("key:"+key+"+value:"+value+";");
                }
            }else if (obj instanceof List){
                List list=(List)obj;
                for (Object o : list) {
                    System.out.println(o);
                }
            }
        }
    }



    /**
     * 获取对象的类型,返回类型名称
     * */
    public Object kingIsObject(Object obj) {
        if(ObjectUtils.isEmpty(obj)){
            return "null";
        }else {
            if (obj.getClass().equals(java.lang.String.class)) {
                return "String";
            }else if (obj instanceof Array){
                return "Array";
            }else if (obj instanceof List){
                return "List";
            }else if (obj instanceof Set){
                return "Set";
            }else if (obj instanceof Map){
                return "Map";
            }else if (obj.getClass().isAnnotation()){
                return "Annotation";
            }else if (obj.getClass().isEnum()){
                return "Enum";
            } else if (obj.getClass().isInterface()){
                return "Interface";
            } else if (obj.getClass().equals(java.lang.String.class)) {
                return "String";
            }else if (obj.getClass().equals(java.lang.Boolean.class)) {
                return "Boolean";
            }else if (obj.getClass().equals(java.lang.Integer.class)) {
                return "Integer";
            }else if (obj.getClass().equals(java.lang.Character.class)) {
                return "Character";
            }else if (obj.getClass().equals(java.lang.Long.class)) {
                return "Long";
            }else if (obj.getClass().equals(java.lang.Float.class)) {
                return "Float";
            }else if (obj.getClass().equals(java.lang.Double.class)) {
                return "Double";
            }else if (obj.getClass().equals(java.lang.Thread.class)) {
                return "Thread";
            }else if (obj.getClass().equals(java.lang.Exception.class)) {
                return "Exception";
            }else if (obj.getClass().equals(java.lang.System.class)) {
                return "System";
            }else {
                return "do not know temporarily!";
            }
        }
    }

    /**
     *
     * */
    public Class kingIsObjectClass(Object obj) {
        if(ObjectUtils.isEmpty(obj)){
            return null;
        }else {
            if (obj.getClass().equals(java.lang.String.class)) {
                return String.class;
            }else if (obj instanceof Array){
                return Array.class;
            }else if (obj instanceof List){
                return List.class;
            }else if (obj instanceof Set){
                return Set.class;
            }else if (obj instanceof Map){
                return Map.class;
            }else if (obj.getClass().isAnnotation()){
                return Annotation.class;
            }else if (obj.getClass().isEnum()){
                return Enum.class;
            } else if (obj.getClass().equals(java.lang.String.class)) {
                return String.class;
            }else if (obj.getClass().equals(java.lang.Boolean.class)) {
                return Boolean.class;
            }else if (obj.getClass().equals(java.lang.Integer.class)) {
                return Integer.class;
            }else if (obj.getClass().equals(java.lang.Character.class)) {
                return Character.class;
            }else if (obj.getClass().equals(java.lang.Long.class)) {
                return Long.class;
            }else if (obj.getClass().equals(java.lang.Float.class)) {
                return Float.class;
            }else if (obj.getClass().equals(java.lang.Double.class)) {
                return Double.class;
            }else if (obj.getClass().equals(java.lang.Thread.class)) {
                return Thread.class;
            }else if (obj.getClass().equals(java.lang.Exception.class)) {
                return Exception.class;
            }else if (obj.getClass().equals(java.lang.System.class)) {
                return System.class;
            }else {
                return Class.class;
            }
        }
    }


}
