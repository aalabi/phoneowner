import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        try {
            Wife remi = new Wife("Remi");
            Woman<Wife> houseHelp = new Woman<Wife>();
            houseHelp.setValue(remi);
            System.out.println(houseHelp);

            Daughter iyaloja = new Daughter("iyaloja");
            Woman<Daughter> maid = new Woman<Daughter>();
            maid.setValue(iyaloja);
            System.out.println(maid);


            Wife osagbokan = new Wife("Osagbokan");

            Husband alabi = new Husband("Alabi", osagbokan);

            Daughter kehinde = new Daughter("Kehinde");
            alabi.addToDaughter(kehinde);

            Phone nokia = new Phone("");

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
        catch (PhoneException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("System error");
            e.printStackTrace();
        }
    }
}