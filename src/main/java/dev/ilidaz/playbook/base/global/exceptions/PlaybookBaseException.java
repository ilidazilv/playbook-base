package dev.ilidaz.playbook.base.global.exceptions;

import dev.ilidaz.playbook.base.global.enums.ErrorCodes;

import java.io.Serializable;

public class PlaybookBaseException extends RuntimeException implements Serializable {
    private final ErrorCodes errorCode;

    public PlaybookBaseException(String message, ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public PlaybookBaseException(String message, ErrorCodes errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public ErrorCodes getErrorCode() {
        return errorCode;
    }
}
