import Ristorante.Tavoli;

import java.beans.XMLEncoder;
import java.util.ArrayList;

public class Main {

    static ArrayList <Tavoli> tavoli = new ArrayList<Tavoli>();

    public static void main(String[] args) {

        loadTables(10);

        System.out.println(tavoli.get(0).getMenu().getCibo().get(2).getPrezzo());
        System.out.println(tavoli.get(0).getMenu().getBibite().get(3).getPrezzo());

        tavoli.get(0).ordina(2, 3);
        System.out.println(tavoli.get(0).prezzoTot());
    }

    static void loadTables(int howManyTables){
        for (int i = 0; i < howManyTables; i++){
            tavoli.add(new Tavoli());
        }
    }
}
