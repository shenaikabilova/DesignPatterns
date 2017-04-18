package com.tu.design.pattern.kivanov.behaviour.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @author Kamen on 30.04.16
 */
public class ChatRoom {

    private static final Logger logger = LoggerFactory.getLogger(ChatRoom.class);

    public static void showMessage(User user, String message) {
        logger.error("{} [{}] : {}", new Date(), user.getName(), message);
    }

}
