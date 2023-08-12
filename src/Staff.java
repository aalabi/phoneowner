public class Staff extends Person  {
    private String name;
    public Staff(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff{" + "name='" + name + '\'' +'}';
    }
}
