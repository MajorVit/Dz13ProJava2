package Collections;

import java.util.ArrayList;

public class FIlmVNalichii {
    ArrayList<String> films = new ArrayList<>();

    public void addFilm(String name){
        films.add(name);
    }
    public void findFilm(String name) {
        for (String film:films) {
            if (film.equals(name)) {
                System.out.println("Фильм " + name + " есть в наличии");
            } else {
                System.out.println("Фильм " + name + " нет в наличии");
            }
        }
    }

}
