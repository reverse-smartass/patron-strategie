import java.util.ArrayList;
import java.util.Iterator;


public class Dessin extends Component{
    private ArrayList<Component> components = new ArrayList<>();


    public Dessin(String n){
        this.name = n;
    }

    public void addComponent(Component c){
        this.components.add(c);
    }

    public Component getComponent(int i){
        return this.components.get(i);
    }

    public ArrayList<Component> getComponents(){
        return this.components;
    }

    @Override
    public void print(String initial, Strategy s) {
        System.out.println(initial+this.getName());

        initial = initial += s.getIndent(this);

        Iterator<Component> iterator = this.getComponents().listIterator();

        while(iterator.hasNext()){
            iterator.next().print(initial, s);
        }

    }
}
