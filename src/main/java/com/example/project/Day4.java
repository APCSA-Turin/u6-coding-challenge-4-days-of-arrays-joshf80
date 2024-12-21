package com.example.project;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private int restDuration;
        private int speed;
        private int runDuration;
        private int distance;
        private int seconds;
        private boolean tired;

        private String name;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            distance = 0;
            seconds = 0;
            tired = false;
        }

        public String getName() {
            return name;
        }

        public int getDistanceTraveled(){ // this method is required
            return distance;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (seconds % runDuration == 0 && !tired) {
                tired = true;
            }
            if (seconds % runDuration != 0 && !tired || seconds == 0) {
                distance += speed;
            }
            
            if (seconds % restDuration == 0 && tired) {
                tired = false;
            }
            seconds += 1;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int distance = 0;
        String name = "";
        for (int i = 0; i < reindeers.length; i++) {
            for (int j = 0; j < time; j++) {
                reindeers[i].simulateSecond();
            }
            if(reindeers[i].getDistanceTraveled() > distance) {
                distance = reindeers[i].getDistanceTraveled();
                name = reindeers[i].getName();
            }

        }
        return name;
    }

    
    public static void main(String[] args) { // for testing purposed
        Day4.Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 70, 6, 1)
        };

        String winner = Day4.simulateRace(10, reindeers);
        System.out.println(winner);
    }

 
}



