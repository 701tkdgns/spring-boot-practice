package com.psh.spring_practice.service;

import com.psh.spring_practice.controller.WebSocketController;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketService implements WebSocketConfigurer {
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry){
        registry.addHandler(new WebSocketController(), "/ws/chat").setAllowedOrigins("*");
    }
}
