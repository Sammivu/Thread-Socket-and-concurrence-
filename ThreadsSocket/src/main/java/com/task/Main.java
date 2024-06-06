package com.task;

import com.task.service.HttpServerServiceImpl;

import java.io.IOException;

import static com.task.common.SimpleHttpServer.PORT;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServerServiceImpl service = new HttpServerServiceImpl();

        service.start(PORT);
    }
}
