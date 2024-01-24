package mymoo.mymoodemo.api.exception;

public class UserNotFound extends MaimuException{

    private static final String MESSAGE = "CANNOT FIND USER";

    public UserNotFound(){
        super(MESSAGE);
    }

    @Override
    public int getStatusCode() {
        return 404;
    }
}
