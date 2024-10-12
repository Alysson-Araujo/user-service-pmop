package com.microorderplatform.userservice.exceptions.amqpexcpetions;

import org.springframework.amqp.AmqpException;

public class RabbitConnectionException extends AmqpException {
    public RabbitConnectionException(String message) {
        super(message);
    }
    public RabbitConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
