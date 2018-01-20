package com.company.Array;

/**
 * Created by wsx on 2017/8/12.
 */
//最大子数组之和
public class MaxSubArray {
    public static int max(int n,int m){
        return n>m?n:m;
    }

    public static int MaxSubArray(int data[],int n){
        int nstart=data[0];
        int nall=data[0];
        for(int i=1;i<n;i++){
            nstart=max(data[i],data[i]+nstart);
            nall=max(nall,nstart);
        }
        return nall;

    }
    public static void main(String[] args){
        int[] array={1,-2,4,8,-4,7,-1,3,-5,6};
        System.out.println(MaxSubArray(array,array.length));
    }
}
