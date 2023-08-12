public class Wife  extends Person{
    private String name;
    public Wife(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wife{" + "name='" + name + '\'' +'}';
    }
}