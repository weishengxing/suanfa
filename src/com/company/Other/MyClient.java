package com.company.Other;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by wsx on 2017/9/15.
 */
public class MyClient {
    public static void main(String[] args){

        Socket socket=new Socket();
        SocketAddress socketAddress= new InetSocketAddress("127.0.0.1",10000);
        InputStream fileInputStream=null;
        OutputStream outputStream=null;
        byte[] bytes=new byte[1024];
        try {
            socket.connect(socketAddress);
           outputStream=socket.getOutputStream();
           fileInputStream=new FileInputStream("D:\\wei.txt");
            System.out.print("aa"+fileInputStream);
           int length;
           while (fileInputStream.read(bytes,0,bytes.length)>0){
                length=fileInputStream.read(bytes,0,bytes.length);
                System.out.println(fileInputStream.read(bytes,0,bytes.length));
                outputStream.write(bytes,0,length);
                outputStream.flush();
           }

        }catch (Exception e){

        }finally {
            try {
                fileInputStream.close();
                outputStream.close();
                socket.close();
            }catch (Exception e){

            }

        }
    }
}
