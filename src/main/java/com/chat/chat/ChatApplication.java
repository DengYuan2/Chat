package com.chat.chat;

import com.chat.chat.netty.WSServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


//扫描mybatis mapper的包路径
@MapperScan("com.chat.chat.mapper")
@SpringBootApplication
public class ChatApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
        try {
            new WSServer(8888).start();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}
