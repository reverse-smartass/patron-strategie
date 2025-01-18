import java.util.Iterator;

public class Forme extends Component{
    public Forme (String n){
        this.name = n;
    }


    @Override
    public void print(String initial, Strategy s) {
        System.out.println(initial+this.getName());
    }
}
