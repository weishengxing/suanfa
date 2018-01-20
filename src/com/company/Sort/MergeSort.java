package com.company.Sort;

/**
 * Created by wsx on 2018/1/19.
 * 归并排序
 */
public class MergeSort {
    //合并
    public static void merge(int[] array,int low,int middle,int height){
        int i=low;
        int j=middle+1;
        int k=0;
        int[] array2=new int[height-low+1];
        while (i<=middle&&j<=height){
            if(array[i]<array[j]){
                array2[k]=array[i];
                i++;
                k++;
            }else{
                array2[k]=array[j];
                j++;
                k++;
            }
        }
        while (i<=middle){
            array2[k]=array[i];
            i++;
            k++;
        }
        while (j<=height){
            array2[k]=array[j];
            j++;
            k++;
        }
        for (k = 0, i = low; i <= height; i++, k++) {
            array[i] = array2[k];
        }
    }
    //递归拆分
    public static void merageSort(int[] array,int low,int height){
        if(low<height){
            int middle=(low+height)/2;
            merageSort(array,low,middle);
            merageSort(array,middle+1,height);
            merge(array,low,middle,height);
        }
    }

    public static void main(String[] args){
        int item[] = { 12, 21, 13, 18, 9,11, 15, 17, 14, 16, 10, 10,1,5};
        merageSort(item,0,item.length-1);
        for(int i:item){
            System.out.print(i+" ");
        }

    }

}
