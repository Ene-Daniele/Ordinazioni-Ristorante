package Ristorante;

import Ristorante.Cibi.Alimenti;
import Ristorante.Cibi.Menu;

import java.util.ArrayList;

public class Tavoli {

    private Menu menu;
    private boolean coperto;

    private static int newId = 0;
    private int id;

    private ArrayList <Alimenti> ordini = new ArrayList<Alimenti>();

    public ArrayList<Alimenti> getOrdini() {
        return ordini;
    }

    public Menu getMenu() {
        return menu;
    }

    public Tavoli(){
         coperto = false;
         menu = new Menu();
         id = newId;
         newId++;
     }

    public int getId() {
        return id;
    }

    public void ordina(int foodIndex, int drinkIndex){
         coperto = true;
        ordini.add(menu.getCibo().get(foodIndex));
        ordini.add(menu.getBibite().get(drinkIndex));
    }

    public double prezzoTot(){
         double temp = 0;
         for (int i = 0; i < ordini.size(); i++){
             temp += ordini.get(i).getPrezzo();
         }
         return temp;
    }

}
