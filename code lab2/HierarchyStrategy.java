import java.util.Iterator;

public class HierarchyStrategy implements Strategy{


    /*@Override
    public void print(String initial, Component c) {
        System.out.println(initial);
        c.print();
        initial = initial += "    ";

        if(c instanceof Dessin){
            Iterator<Component> iterator = ((Dessin) c).getComponents().listIterator();


            while(iterator.hasNext()){
                print(initial, iterator.next());
            }
        }
    }*/

    @Override
    public String getIndent(Component c) {
        return "    ";
    }
}
