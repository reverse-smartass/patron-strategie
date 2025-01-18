public abstract class Component {
    String name;

    public String getName(){
        return this.name;
    }

    public abstract void print(String initial, Strategy s);
}
