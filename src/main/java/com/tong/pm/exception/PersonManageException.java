package com.tong.pm.exception;

public class PersonManageException extends RuntimeException {

    private static final long serialVersionUID = -7054135867814564323L;

    private String code;

    public PersonManageException() {
        super();
    }

    public PersonManageException(String message) {
        super(message);
    }

    public PersonManageException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonManageException(Throwable cause) {
        super(cause);
    }

    public PersonManageException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
