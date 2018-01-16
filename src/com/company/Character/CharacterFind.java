package com.company.Character;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wsx on 2017/9/16.
 * 查找字符串中重复的字符串，并将重复字符串及对应的重复次数打印出来
 */
public class CharacterFind {
    public static void main(String[] args){
        String str = "abcdabcdab";
        CharacterFind.findTest(str);

    }
    public static void findTest(String str){
        System.out.println("str:"+str);
        Map<String,Integer> resultMap =new HashMap();
        int size=str.length();
        for(int i=0;i<size;i++){
            for(int k=0;k<size-i;k++){
                String sur= str.substring(k,k+i+1);
                Integer count=resultMap.get(sur);
                if(count!=null){
                    count++;
                    resultMap.put(sur,count);
                }else{
                    resultMap.put(sur,1);
                }
            }
        }
        for(Map.Entry entry:resultMap.entrySet()){
            if((int)entry.getValue()>1){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
