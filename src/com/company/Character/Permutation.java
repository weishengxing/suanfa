package com.company.Character;

/**
 * Created by wsx on 2018/1/19.
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 */
public class Permutation {
    public static void permutation(char[] chars,int i){
        if(chars==null)
            return;
        if(i==chars.length-1){
            System.out.println(String.valueOf(chars));
        }else{
            for(int j=i;j<chars.length;j++){
                char temp=chars[j];
                chars[j]=chars[i];
                chars[i]=temp;
                permutation(chars,i+1);
                temp=chars[j];
                chars[j]=chars[i];
                chars[i]=temp;
            }
        }

    }
    public static void main(String[] args){
        String str="abc";
        permutation(str.toCharArray(),0);

    }
}
