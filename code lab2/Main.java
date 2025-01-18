import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Entrez le dessin à tester \n" +
                "1- Dessin avec trois niveaux\n" +
                "2- Dessin avec deux niveaux\n" +
                "3- Dessin avec un niveau (une forme seulement)");

        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();

        while (d < 1 | d > 3){
            System.out.println("Reentrez un nombre de 1 a 3");
            d = scanner.nextInt();
        }


        Dessin Dessin1 = null;
        if (d <= 3) {
            Dessin1 = new Dessin("Dessin1");
            Forme Cercle1 = new Forme("Cercle1");
            Dessin1.addComponent(Cercle1);
        }
        Dessin Dessin2 = null;
        Dessin Dessin3 = null;
        Dessin Dessin4 = null;
        if (d <= 2) {
            Dessin2 = new Dessin("Dessin2");
            Dessin1.addComponent(Dessin2);
            Dessin3 = new Dessin("Dessin3");
            Dessin4 = new Dessin("Dessin4");
            Forme Rectangle1 = new Forme("Rectangle1");
            Dessin2.addComponent(Dessin3);
            Dessin2.addComponent(Dessin4);
            Dessin2.addComponent(Rectangle1);
        }
        if (d == 1){
            Forme Cercle2 = new Forme("Cercle2");
            Forme Cercle3 = new Forme("Cercle3");
            Forme Triangle1 = new Forme("Triangle1");
            Forme Triangle2 = new Forme("Triangle2");
            Dessin3.addComponent(Cercle2);
            Dessin3.addComponent(Cercle3);
            Dessin4.addComponent(Triangle1);
            Dessin4.addComponent(Triangle2);
        }


        System.out.println("Entrez la stratégie d'affichage à utiliser \n" +
                "1- Indentation\n" +
                "2- Chemin complet\n");

        int s = scanner.nextInt();

        while (s < 1 | s > 2){
            System.out.println("Reentrez un nombre de 1 a 2");
            s = scanner.nextInt();
        }

        Strategy strategy = null;
        if (s == 1){
            strategy = new HierarchyStrategy();
        }else if(s == 2){
            strategy = new PathStrategy();
        }

        Printer printer = new Printer();

        printer.setStrategy(strategy);

        printer.print(Dessin1);
    }
}