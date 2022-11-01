package collections;

import java.util.HashMap;
import java.util.Map;

public class GameOfTheYear {

    Map<String, String> games = new HashMap<>();

    public void addGame(String name, String year) {
        games.put(name, year);
    }

    public void printAllGames() {
        for (Map.Entry<String, String> entry : games.entrySet()) {
            System.out.println("Game: " + entry.getKey() + ", Year: " + entry.getValue());
        }
    }

    public boolean hasGame(String name, String year) {
        for (Map.Entry<String, String> entry : games.entrySet()) {
            if (entry.getKey().equals(name) && entry.getValue().equals(year)) {
                return true;
            }
        }
        return false;
    }
}