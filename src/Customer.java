import java.util.ArrayList;

public class Customer implements HumanActivity {

    public void buyItems(ArrayList<String> items){
        System.out.println(items);
    }

    public void payForItems(double money){
        System.out.println("I just paid " + money);
    }
    @Override
    public void eat(String food){
        System.out.println("I am eating " + food + " at home");
    }
    @Override
    public void moveRround(int distance){
        System.out.println("I just move in my car for " + distance + "km");
    }
    @Override
    public void sleep(double duration){
        System.out.println("I slept for " + duration + " in my house");
    }
}
