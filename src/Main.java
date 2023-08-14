import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wife osagbokan = new Wife("Osagbokan");

        Husband alabi = new Husband("Alabi", osagbokan);

        Daughter kehinde = new Daughter("Kehinde");
        alabi.addToDaughter(kehinde);

        Phone nokia = new Phone("");
        System.out.println(validateObject(()-> nokia.getModel().isEmpty()));

        alabi.buyPhone(nokia);
        System.out.println(alabi);

        Phone alabiPhone = alabi.getPhone();
        alabiPhone.setPhonePIN("0000");

        alabiPhone.makeCall(alabi,"0100alabi0nalabi", null);
        alabiPhone.viewCallLog(null);

        alabiPhone.makeCall(osagbokan, "0100osa0nalabi", null);
        alabiPhone.viewCallLog(null);

        alabiPhone.makeCall(kehinde, "0100kehinde0nalabi", null);
        alabiPhone.viewCallLog(null);

        Staff tinubu = new Staff("tinubu");
        alabiPhone.makeCall(tinubu, "0100tinub0nalabi", "0000");

        Son tunde = new Son("tunde");
        alabiPhone.makeCall(tunde, "0100tunde0nalabi", null);

        osagbokan.buyPhone(new Phone("iphone 14 pro max"));
        Phone osasPhone = osagbokan.getPhone();
        osasPhone.setPhonePIN("1000");
        osasPhone.makeCall(tinubu, "0200tinubu0nosa", "1001");

    }

    public static String validateObject(Checkable anObject){
        String status = "valid object";
        if(anObject.check()){
            status = "invalid object";
        }
        return status;
    }
}