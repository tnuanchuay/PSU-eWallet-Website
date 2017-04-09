package APIResponse;

/**
 * Created by tnuanchuay on 4/9/2017.
 */
public class BasicResponse {
    boolean status;
    String exception = "";

    public BasicResponse(boolean status) {
        this.status = status;
    }

    public BasicResponse(boolean status, String exception) {
        this.status = status;
        this.exception = exception;
    }

    public boolean isStatus() {
        return status;
    }

    public String getException() {
        return exception;
    }
}
