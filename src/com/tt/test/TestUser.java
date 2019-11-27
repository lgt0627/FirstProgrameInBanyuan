package com.tt.test;

import com.tt.controller.UserController;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author tt
 */
public class TestUser {

    public static void main(String[] args) throws IOException {
        UserController uc = null;
        ServerSocket serverSocket = new ServerSocket(1234);
        while (true) {
            uc = new UserController();
            Socket socket = serverSocket.accept();
            new Tools(socket, uc).start();
        }
        }
    }


