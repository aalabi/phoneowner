public class Daughter extends Person {
    private String name;
    public Daughter(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Daughter{" + "name='" + name + '\'' +'}';
    }
}
