package com.company.Array;

/**
 * Created by wsx on 2018/1/11.
 * 输入一个整数数组，实现一个函数来调整该函数数组中数字的顺序，使得所有奇数位于数组的前半部分，
 * 所有的数组位于数组的后半部分。
 */
public class SortArrayByEven {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        sortArrayByEven(array);
        for (int item : array)
            System.out.println(item);
    }

    public static void sortArrayByEven(int[] array) {
        if(array.length==0){
            return;
        }
        int start=0;
        int end=array.length-1;
        while (start<end){
            while (start<end&&array[start]%2!=0){
                start++;
            }
            while (start<end&&array[end]%2==0){
                end--;
            }
            if(start<end){
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
            }
        }

    }
}
