package dev.ilidaz.playbook.base.global.exceptions;

import dev.ilidaz.playbook.base.global.enums.ErrorCodes;
import lombok.Getter;

import java.io.Serializable;

/**
 * Represents a base exception for the Playbook application.
 */
@Getter
public class PlaybookBaseException extends RuntimeException implements Serializable {
    /**
     * The error code associated with the exception.
     */
    private final ErrorCodes errorCode;

    /**
     * Constructs a new PlaybookBaseException with the specified detail message and error code.
     *
     * @param message   the detail message.
     * @param errorCode the error code.
     */
    public PlaybookBaseException(String message, ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * Constructs a new PlaybookBaseException with the specified detail message, error code, and cause.
     *
     * @param message   the detail message.
     * @param errorCode the error code.
     * @param cause     the cause.
     */
    public PlaybookBaseException(String message, ErrorCodes errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }
}
