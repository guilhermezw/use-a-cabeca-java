package simplestartupgame;

import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    private String name;


    public Startup(ArrayList<String> locationCells, String name) {
        this.locationCells = locationCells;
        this.name = name;
    }

    public Startup() {
    }


    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "   : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }


    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }


    public void setName(String name) {
        this.name = name;
    }
}