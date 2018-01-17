package com.company.Character;

/**
 * Created by wsx on 2018/1/17.
 * 请实现一个函数，把字符串中的每个空格替换成“%20”
 */
public class ReplaceSpace {
    public static String replaceSpace(String str){
        if(str==null)
            return null;
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                stringBuffer.append("%20");
            }else{
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
    public static void main(String[] args){
        System.out.println(replaceSpace("I am Senna "));

    }
}
