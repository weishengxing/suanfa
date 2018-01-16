package com.company.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wsx on 2017/10/2.
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的第M到N项之和(M>2, N>2, N>M)。
 */
public class MTON {
    public static List getList(int N){
        List<Integer> list=new ArrayList();
        list.clear();
        list.add(1);
        list.add(2);
        for(int i=2;i<=N;i++){
            int temp=list.get(i-1)+list.get(i-2);
            list.add(temp);
        }
        return list;
    }
    public static float mton(int M,int N){
        List<Integer> list=getList(N);
        float sum=0;
        for(int i=M;i<=N;i++){
            sum+=(float)list.get(i)/list.get(i-1);
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("mton的和："+mton(2,6));
    }
}
