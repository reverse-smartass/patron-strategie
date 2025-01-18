public class Printer {

    private Strategy strategy = new HierarchyStrategy();

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void print (Component c){
        System.out.println("Affichage du dessin:");
        c.print("", this.strategy);
    }

}
