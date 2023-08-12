import java.util.ArrayList;

public class Husband extends Person {
    private String name;
    private Wife wife;
    private ArrayList<Daughter> daughters;

    public Husband(String name, Wife wife){
        super(name);
        this.name = name;
        this.wife = wife;
        this.daughters = new ArrayList<Daughter>();
    }

    public Wife getWife() {
        return wife;
    }

    public void addToDaughter(Daughter daughter) {
        this.daughters.add(daughter);
    }

    public ArrayList<Daughter> getDaughters() {
        return daughters;
    }

    @Override
    public ArrayList<Person> dialerList(){
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(this.wife);
        list.addAll(this.daughters);
        return list;
    }

    @Override
    public ArrayList<Person> callLogViewerList(){
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(this.wife);
        list.addAll(this.daughters);
        return list;
    }

    @Override
    public ArrayList<Person> callLogModifierList(){
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(this.wife);
        return list;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", wife=" + wife +
                ", daughters=" + daughters +
                '}';
    }
}
