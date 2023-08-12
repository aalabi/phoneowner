import java.util.ArrayList;

public class Phone extends Object {
    private final String model;
    private String phonePIN = null;
    private ArrayList<String> callLog;
    private Person owner;

    public Phone(String model){
        this.model = model;
        callLog = new ArrayList<String>();
    }

    public String getModel() {
        return this.model;
    }

    public String getPhonePIN() {
        return this.phonePIN;
    }

    public void setPhonePIN(String pin) {
        this.phonePIN = pin;
    }

    public ArrayList<String> getCallLog(String pin) {
        //TODO improve the code with exception later
        ArrayList<String> log = null;
        if(this.accessLog(pin)){
            log = this.callLog;
        }
        else {
            System.out.println("Cannot access call log invalid PIN");
        }
        return log;
    }

    public void viewCallLog(String pin){
        ArrayList<String> log = getCallLog(pin);
        if(log != null){
            System.out.println(log);
        }
    }

    public void makeCall(String phoneNo, String pin){
        if(this.accessLog(pin)){
            calling(phoneNo);
        }
        else {
            System.out.println("Cannot make call invalid PIN");
        }
    }

    public void makeCall(Person dialer, String phoneNo, String pin){
        if(this.owner.equals(dialer) || owner.dialerList().contains(dialer)){
            calling(phoneNo);
        } else{
            if(this.accessLog(pin)){
                calling(phoneNo);
            }
            else {
                System.out.println("Cannot make call invalid PIN");
            }
        }
    }

    private void calling(String phoneNo){
        this.callLog.add(phoneNo);
        System.out.println("Calling... " + phoneNo);
    }

    private boolean accessLog(String pin){
        boolean grantAccess;
        if(this.phonePIN == null){
            grantAccess = true;
        }else{
            grantAccess = this.phonePIN.equals(pin);
        }
        return grantAccess;
    }

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Phone{" + "model='" + model + '\'' + ", phonePIN='****" +"'}";
    }
}
