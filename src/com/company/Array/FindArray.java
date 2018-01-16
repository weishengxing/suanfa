package com.company.Array;

/**
 * Created by wsx on 2018/1/16.
 * 一个二维数组，每一行从左到右递增，每一列从上到下递增．输入一个二维数组和一个整数，
 * 判断数组中是否含有整数。
 */
public class FindArray {
    public static void findArray(int[][] array,int num){
        if(array.length==0){
            System.out.println("数组为空");
        }
        int colums=array[0].length-1;
        int rows=0;
        while (rows<array.length&&colums>=0){
            if(array[rows][colums]==num){
                System.out.println("行："+(rows+1)+" 列:"+(colums+1));
                return ;
            }else {
                if(array[rows][colums]<num){
                    rows++;
                }else{
                    colums--;
                }
            }
        }
        System.out.println("找不到数字:"+num);

    }
    public static void main(String[] args){
        int[][] testarray=new int[4][4];
        testarray[0][0]=1;
        testarray[0][1]=2;
        testarray[0][2]=8;
        testarray[0][3]=9;
        testarray[1][0]=2;
        testarray[1][1]=4;
        testarray[1][2]=9;
        testarray[1][3]=12;
        testarray[2][0]=4;
        testarray[2][1]=7;
        testarray[2][2]=10;
        testarray[2][3]=13;
        testarray[3][0]=6;
        testarray[3][1]=8;
        testarray[3][2]=11;
        testarray[3][3]=15;
        findArray(testarray,15);
    }
}
