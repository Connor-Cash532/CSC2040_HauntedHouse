public class HauntedHouse {
    private boolean ghostPresent;
    private int candyCount;
    private int givesCandyCount;

    public HauntedHouse() {
        ghostPresent = true;
        candyCount = 10;
        givesCandyCount = 0;
    }

    public boolean isGhostPresent() {
        return ghostPresent;
    }

    public void scareAwayGhost() {
        ghostPresent = false;
    }

    public void refillCandyBowl(int amount) {
        if(amount >= 0)
            candyCount += amount;
    }

    public void trickOrTreat(int people){
        if(people < candyCount && people >= 0)
            candyCount = candyCount - people;
        replenishCandy();
        givesCandyCount += 1;
        Haunting();
    }
    public void replenishCandy(){
        if (candyCount == 0)
            candyCount = 10;
    }
    public int getCandyCount() {
        return candyCount;
    }

    public String spookySound() {
        return "Boo!";
    }

    public void Haunting(){
        if(givesCandyCount != 0 && givesCandyCount % 5 == 0)
            ghostPresent = true;
    }


    @Override
    public String toString() {
        String result = "The house ";

        if(isGhostPresent()) {
            result += "is haunted by a Ghost and ";
        }
        result += "has " + candyCount + " candy.";
        return result;
    }
}

