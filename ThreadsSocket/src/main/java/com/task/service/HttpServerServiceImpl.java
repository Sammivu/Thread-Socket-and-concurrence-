package com.task.service;

import com.task.utils.HttpHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static com.task.common.SimpleHttpServer.PORT;

public class HttpServerServiceImpl  {


    public void start(int port) throws IOException {

        //Try(resource)
        // Creating a server using the server socket
        try(ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.println("Server started on port " + port);

            //Accepting the connection for the client
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("New Connection Established");

                new HttpHandler(socket).start();

            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
