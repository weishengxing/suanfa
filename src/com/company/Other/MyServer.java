package com.company.Other;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by wsx on 2017/9/15.
 */
public class MyServer {
    public static void main(String[] args){
        Socket socket=null;
        FileOutputStream fileOutputStream=null;
        InputStream fileInputStream=null;
        byte[] bytes=new byte[1024];
        try{
            ServerSocket serverSocket=new ServerSocket(10000);
            socket=serverSocket.accept();
            fileInputStream=socket.getInputStream();
            System.out.print("aa"+fileInputStream);
            fileOutputStream=new FileOutputStream("D:\\weicopy.txt");
            int length;
            while(fileInputStream.read(bytes,0,bytes.length)>0){
                length=fileInputStream.read(bytes,0,bytes.length);
                fileOutputStream.write(bytes,0,length);
                fileOutputStream.flush();
            }
        }catch (Exception e){

        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
                socket.close();
            }catch (Exception e){

            }

        }
    }
}
