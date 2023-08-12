public class Son extends Person  {
    private String name;
    public Son(String name){
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Son{" + "name='" + name + '\'' +'}';
    }
}
