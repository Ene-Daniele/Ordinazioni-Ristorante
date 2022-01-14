import Ristorante.Tavoli;

import java.beans.XMLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList <Tavoli> tavoli = new ArrayList<Tavoli>();

    public static void main(String[] args) {

        loadTables(10);

        Scanner input = new Scanner(System.in);
        boolean yes = true;

        do {
            System.out.println("1: Ordina");
            switch (Integer.valueOf(input.nextLine())){
                case 1:
                    System.out.println("Scegli un tavolo da 0 a " + (tavoli.size() - 1));
                    int temp = Integer.valueOf(input.nextLine());
                    //Show menu

                    tavoli.get(temp).getOrdini().add(tavoli.get(temp).getMenu().getCibo().get(Integer.valueOf(input.nextLine())));
                    break;
                default: System.out.println("Invalid command");
            }
        } while (yes);
    }

    static void loadTables(int howManyTables){
        for (int i = 0; i < howManyTables; i++){
            tavoli.add(new Tavoli());
        }
    }
}
