public class Woman <T>{
    private T value;

    public T getValue() {
        return this.value;
    }

    public void setValue(T value){
       this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
