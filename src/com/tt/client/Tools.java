package com.tt.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created on 2019/11/17 2:24 下午
 *
 * @author lgt
 */
public class Tools {
    Socket socket;
    DataInputStream dis = null;
    DataOutputStream dos = null;
    {
        try {
//            socket = new Socket("192.168.0.106" , 1234);
            socket = new Socket("192.168.9.61" , 1234);
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public boolean stupwd(String  pwd) throws IOException {
  dos.write(1);
  dos.flush();
        dos.writeUTF(pwd);
        dos.flush();
    if (dis.read() == 1) {
        return true;

    } else {

        return false;
    }
}


    public void close() {
        try {
            dos.close();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}