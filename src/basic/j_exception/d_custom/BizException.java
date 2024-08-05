package basic.j_exception.d_custom;

public class BizException extends RuntimeException {
    public BizException(String message) {
        super(message);
    }

    public BizException(Exception ex) {
        super(ex);
    }
}
