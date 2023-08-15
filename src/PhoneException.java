public class PhoneException extends RuntimeException {
    public PhoneException(){
        super("error Phone Owner app");
    }

    public PhoneException(String message){
        super(message);
    }
}
