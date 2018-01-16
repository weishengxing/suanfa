package com.company.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wsx on 2017/9/24.
 * 在由N个整数构成的集合S中，找出最小元素C，满足C=A-B，其中A,B都是集合S中的元素，找不到则返回-1
 */
public class FindMinC {
    public  int findC(List<Integer> list){
        Collections.sort(list);

        int length=list.size();
        int temp=-1;
        for(int i=0;i<length-2;i++){
            int left=0;
            int right=length-1;
            if(digui(left,right,list,(int)list.get(i))==-1){

            }else{
               temp=digui(left,right,list,(int)list.get(i));
               break;


            }
        }

        return temp;
    }

    public int digui(int left,int right,List<Integer> list,int target){

            int temp=(int)(list.get(right)-list.get(left));
            if(temp==target){
                return target;
            }else if(target>temp){
                return -1;

            }else{
                if(left+1!=right) {
                    digui(left + 1, right, list, target);
                }
                if(left!=right-1){
                    digui(left, right - 1, list, target);
                }
                return -1;
            }
    }

    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(10);
        list.add(6);
        list.add(8);
        FindMinC findMinC=new FindMinC();
        System.out.println(findMinC.findC(list));
    }
}
