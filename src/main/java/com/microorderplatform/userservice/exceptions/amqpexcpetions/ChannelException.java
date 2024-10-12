package com.microorderplatform.userservice.exceptions.amqpexcpetions;

import org.springframework.amqp.AmqpException;

public class ChannelException extends AmqpException {
    public ChannelException(String message) {
        super(message);
    }

    public ChannelException(String message, Throwable cause) {
        super(message, cause);
    }
}