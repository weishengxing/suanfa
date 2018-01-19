package com.company.Character;

/**
 * Created by wsx on 2018/1/19.
 * 输入一个字符串，打印出该字符串中字符的所有排列。（例如：输入abc，输出：a,b,c,ab,ac,bc,abc）
 */
public class Combine {
    public static void combine(char[] chars,int begain,int len,StringBuffer sb){
        if(len==0){
            System.out.print(sb+" ");
            return;
        }
        if(begain==chars.length){
            return;
        }
        sb.append(chars[begain]);
        combine(chars,begain+1,len-1,sb);//取该值
        //不取该值
        sb.deleteCharAt(sb.length()-1);
        combine(chars,begain+1,len,sb);
    }
    public static void main(String[] args){
        String str="abc";
        StringBuffer sb=new StringBuffer("");
        char[] c=str.toCharArray();
        for(int i=1;i<=c.length;i++) {
            combine(c, 0, i,sb);
        }
    }
}
