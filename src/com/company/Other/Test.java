package com.company.Other;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wsx on 2017/9/17.
 */
public class Test {
    //求出n-1个数的所有排列组合
    public static  boolean flag=false;
    public static List list=new ArrayList();
    public static void allComine(int[] a,int i,int len){
        if(len==0){
            int result=1;
            for(int ll=0;ll<list.size();ll++){
                System.out.print((int)list.get(ll));
            }
            System.out.println();
            for(int K=0;K<list.size();K++){
                for(int k1=0;k1<list.size();k1++){
                    if(K!=k1) {
                        result=result&(int)list.get(k1);
                    }
                }
                if(result==(int)list.get(K)){
                    flag=true;
                }else{

                }
            }
            list.clear();

        }
        if(i==a.length){
            return;
        }
        list.add(a[i]);
        allComine(a,i+1,len-1);
        //去掉list的最后一个
        int[] tempa=new int[a.length-1];
        for(int ii=0;ii<a.length-1;ii++){
           tempa[ii]=(int)a[ii];
        }
        a=tempa;

        allComine(a,i+1,len);
    }
   public static boolean isAndEqationExits(int[] a){
        allComine(a,0,a.length-1);
        if(flag){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
       int[] test=new int[3];
        test[0]=5;
        test[1]=20;
        test[2]=4;
        for(int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }
        System.out.print(isAndEqationExits(test));
    }


}
