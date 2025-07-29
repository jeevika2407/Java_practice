package com.oops;

class Cricket {
    String playerName;
    String teamName;

    void setData(String playerName, String teamName) {
        this.playerName = playerName;
        this.teamName = teamName;
    }

    void displayPlayer() {
        System.out.println("Player name: " + playerName);
        System.out.println("Team name: " + teamName);
    }
}

class Batsman extends Cricket {
    int score;
    float batAvg;

    void setBatsman(int score, float batAvg) {
        this.score = score;
        this.batAvg = batAvg;
    }

    void displayBatsman() {
        System.out.println("Score: " + score);
        System.out.println("Batting average: " + batAvg);
    }
}

class Bowler extends Cricket {
    int wicket;
    float bowlAvg;

    void setBowler(int wicket, float bowlAvg) {
        this.wicket = wicket;
        this.bowlAvg = bowlAvg;
    }

    void displayBowler() {
        System.out.println("Wickets: " + wicket);
        System.out.println("Bowling average: " + bowlAvg);
    }
}

public class Hierarchical {
    public static void main(String args[]) {
        Batsman b = new Batsman();
        Bowler bo = new Bowler();

        b.setData("Virat Kohli", "India");
        b.setBatsman(10000, 50.5f);
        b.displayPlayer();
        b.displayBatsman();

        bo.setData("Jasprit Bumrah", "India");
        bo.setBowler(200, 23.8f);
        bo.displayPlayer();
        bo.displayBowler();
    }
}
