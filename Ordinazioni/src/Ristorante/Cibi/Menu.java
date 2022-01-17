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

    public ArrayList<Alimenti> getBibite() {
        return bibite;
    }
    public ArrayList<Alimenti> getCibo() {
        return cibo;
    }

    public static void addMoreFood(double price, String food, int type){

        switch (type){
            case 1:
                cibo.add(new Alimenti(price, food));
                break;
            case 0:
                bibite.add(new Alimenti(price, food));
                break;
            default:
                System.out.println("Invalid food type!");
                break;
        }
    }
}
