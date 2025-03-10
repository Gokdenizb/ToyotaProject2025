package com.example.tcpserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TcpServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcpServerApplication.class, args);
        new TcpServer(8081).startServer();
    }

}
