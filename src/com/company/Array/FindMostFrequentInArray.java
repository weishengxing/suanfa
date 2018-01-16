package com.company.Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by wsx on 2017/8/12.
 */
//找出数组中重复元素最多的数
public class FindMostFrequentInArray {
    public static int findMostFrequentInArray(int data[]){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        if(data.length==0){
            return Integer.MAX_VALUE;
        }
        for(int i=0;i<data.length;i++){
            if(map.containsKey(data[i])){
                map.put(data[i],map.get(data[i])+1);
            }else{
                map.put(data[i],1);
            }
        }
        int max=0;
        int result=0;
        Iterator iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            int key=(Integer)entry.getKey();
            int value=(Integer)entry.getValue();
            if(value>max){
                result=key;
            }
        }
        map=null;
        return result;
    }
    public static void main(String[] args){
        int array[]={1,5,4,3,4,4,5,4,5,5};
        System.out.println("result:"+findMostFrequentInArray(array)) ;
    }
}
