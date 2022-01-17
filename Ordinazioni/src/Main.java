import Ristorante.Cibi.Menu;
import Ristorante.Tavoli;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList <Tavoli> tavoli = new ArrayList<Tavoli>();

    public static void main(String[] args) {

        loadTables(10);
        Scanner in = new Scanner(System.in);

        boolean yes = true;
        while (yes) {
            System.out.println("Seleziona tavolo (0 - " + tavoli.size() + ")");
            int selected = 0;
            try {
                selected = Integer.valueOf(in.next());
                for (int i = 0; i < tavoli.get(selected).getMenu().getCibo().size(); i++) {
                    System.out.println(i + ": " + tavoli.get(selected).getMenu().getCibo().get(i).getPrezzo() + "$ " + tavoli.get(selected).getMenu().getCibo().get(i).getNome());
                }
                try {
                    tavoli.get(selected).getOrdini().add(tavoli.get(selected).getMenu().getCibo().get(Integer.valueOf(in.next())));
                } catch (Exception e){
                    System.out.println("Invalid choice! Order failed.");
                }
                for (int i = 0; i < tavoli.get(selected).getMenu().getBibite().size(); i++) {
                    System.out.println(i + ": " + tavoli.get(selected).getMenu().getBibite().get(i).getPrezzo() + "$ " + tavoli.get(selected).getMenu().getBibite().get(i).getNome());
                }
                try {
                    tavoli.get(selected).getOrdini().add(tavoli.get(selected).getMenu().getBibite().get(Integer.valueOf(in.next())));
                } catch (Exception e){
                    System.out.println("Invalid choice! Order failed.");
                }
                System.out.println(tavoli.get(selected).prezzoTot());
            } catch (Exception e) {
            }

        }

    }

    static void loadTables(int howManyTables){
        for (int i = 0; i < howManyTables; i++){
            tavoli.add(new Tavoli());
        }
    }
}
