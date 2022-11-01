package Collections;

public class Osnova {
    public static void main(String[] args) {
        BuyProducts products = new BuyProducts();
        products.addProduct("Хлеб");
        products.addProduct("Молоко");
        products.addProduct("Молоко");
        products.addProduct("Пельмени");
        products.showAllProducts();

        String name = "LOTR";
        FIlmVNalichii fIlmVNalichii = new FIlmVNalichii();
        fIlmVNalichii.addFilm(name);
        fIlmVNalichii.findFilm(name);

        GameOfTheYear games = new GameOfTheYear();
        games.addGame("SEKIRO", "2019");
        games.addGame("GOW", "2018");
        games.printAllGames();

        boolean res = games.hasGame("SEKIRO", "2019");
        System.out.println(res);

    }
}