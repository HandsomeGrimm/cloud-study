package grimm.study.exception;

public class CommonException extends Exception {

    public CommonException() {

    }

    public CommonException(String message) {
        super(message);
    }

    public CommonException(Exception e) {
        this(e.getMessage());
    }

}
