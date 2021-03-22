package tech.itpark.proggerhub.exception;

public class UnmetDependencyException extends RuntimeException {
    // ctrl + o -> all constructors
    public UnmetDependencyException() {
        super();
    }

    public UnmetDependencyException(String message) {
        super(message);
    }

    public UnmetDependencyException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnmetDependencyException(Throwable cause) {
        super(cause);
    }

    protected UnmetDependencyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
