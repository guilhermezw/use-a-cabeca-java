package simplestartupgame;

public class SimpleStartup {
   private int[] locationCells;
   private int numOfHits;
   private String result = "miss";

    public String checkYourself(int guess){
        for(int cell = 0 ; cell < locationCells.length; cell++){
            if(cell ==  guess){
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }


}
