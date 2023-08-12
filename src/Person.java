import java.util.ArrayList;

public class Person {
    protected String name;
    protected Phone phone;
    public Person(String name){
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final void buyPhone(Phone phone) {
        this.phone = phone;
        this.phone.setOwner(this);
    }

    public void passwordPhone(String pin){
        this.phone.setPhonePIN(pin);
    }

    public Phone getPhone() {
        return this.phone;
    }

    public ArrayList<Person> dialerList(){
        return new ArrayList<Person>();
    }

    public ArrayList<Person> callLogViewerList(){
        return new ArrayList<Person>();
    }

    public ArrayList<Person> callLogModifierList(){
        return new ArrayList<Person>();
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +'}';
    }
}