package com.company.Character;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by wsx on 2017/9/15.
 * 随机产生20个不重复的小写字母并倒序输出
 */
public class CharacterNotSort {
    public static void main(String[] args){
        Random random=new Random();
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<20;i++){
            int k=random.nextInt(122)%26+97;
            if(list.contains(k)){
                i--;
                continue;
            }else{
                list.add(k);
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        for(Integer i:list){
            System.out.print((char) (int)i+" ");
        }
    }
}
