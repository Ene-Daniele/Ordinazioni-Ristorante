package Ristorante.Cibi;

import java.util.ArrayList;

public class Menu {

    private static ArrayList <Alimenti> cibo;
    private static ArrayList <Alimenti> bibite;
    public Menu(){
        cibo = new ArrayList<Alimenti>();
        bibite = new ArrayList<Alimenti>();

        addFood();
    }

    private static void addFood(){
        cibo.add(new Alimenti(12.30, "Pasta"));
        cibo.add(new Alimenti(23.90, "Manzo"));
        cibo.add(new Alimenti(18.00, "Pollo"));
        cibo.add(new Alimenti(7.40, "Insalata"));


        bibite.add(new Alimenti(3.90, "Sprite"));
        bibite.add(new Alimenti(3.90, "Cola"));
        bibite.add(new Alimenti(2.30, "Acqua Frizzante"));
        bibite.add(new Alimenti(2.10, "Acqua Naturale"));
    }

    public void newFood(double price, String name){
        cibo.add(new Alimenti(price, name));
    }
    public void newDrink(double price, String name){
        bibite.add(new Alimenti(price, name));
    }

    public ArrayList<Alimenti> getBibite() {
        return bibite;
    }
    public ArrayList<Alimenti> getCibo() {
        return cibo;
    }
}
