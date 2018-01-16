package com.company.Character;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wsx on 2017/9/17.
 */
public class CounterTools implements  Counter {
    private static Map<String,Integer> characterMap=new HashMap<>();
    public int get(String str){
        synchronized (characterMap){
            if(characterMap.containsKey(str)){
                return characterMap.get(str);
            }else{
                return 0;
            }
        }
    }
    public void add(String str){
        int count;
        synchronized (characterMap){
            if(characterMap.containsKey(str)){
                count=characterMap.get(str);
                count++;
                characterMap.put(str,count);
            }else{
                characterMap.put(str,1);
            }
        }
    }
}
