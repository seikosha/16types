import java.util.concurrent.ThreadLocalRandom;

public class Human {

    public static void main(String[] args) {

    }

    public static int physical;
    public static int safety;
    public static int social;
    public static int respect;
    public static int selfAchievement;
    public static int overAchievement;
    public static int feeling;
    public static int affection;

    //getter of all indicators
    public static int getPhysical() {
        return physical;
    }

    public static int getSafety() {
        return safety;
    }

    public static int getSocial() {
        return social;
    }

    public static int getRespect() {
        return respect;
    }

    public static int getSelfAchievement() {
        return selfAchievement;
    }

    public static int getOverAchievement() {
        return overAchievement;
    }

    public static int getFeeling() {
        return feeling;
    }

    public static int getAffection() {
        return affection;
    }

    //create the "Physical" indicator
    public static int setPhysical(int x) {
        if (Math.abs(physical) <= 100) {
            physical += x;
        } else if(physical > 100) {
            physical = 100;
        } else {
            physical = -100;
        }
        return physical;
    }

    //create the "Safety" indicator
    public static int setSafety(int x) {
        if (Math.abs(safety) <= 100) {
            safety += x;
        } else if(safety > 100) {
            safety = 100;
        } else {
            safety = -100;
        }
        return safety;
    }

    //create the "Social" indicator
    public static int setSocial(int x) {
        if (Math.abs(social) <= 100) {
            social += x;
        } else if(social > 100) {
            social = 100;
        } else {
            social = -100;
        }
        return social;
    }

    //create the "Respect" indicator
    public static int setRespect(int x) {
        if (Math.abs(respect) <= 100) {
            respect += x;
        } else if(respect > 100) {
            respect = 100;
        } else {
            respect = -100;
        }
        return respect;
    }

    //create the "Self-Achievement" indicator
    public static int setSelfAchievement(int x) {
        if (Math.abs(selfAchievement) <= 100) {
            selfAchievement += x;
        } else if(selfAchievement > 100) {
            selfAchievement = 100;
        } else {
            selfAchievement = -100;
        }
        return selfAchievement;
    }

    //create the "Over-Achievement" indicator
    public static int setOverAchievement(int x) {
        if (Math.abs(overAchievement) <= 100) {
            overAchievement += x;
        } else if(overAchievement > 100) {
            overAchievement = 100;
        } else {
            overAchievement = -100;
        }
        return overAchievement;
    }

    //create the "Feeling" indicator
    public static int setFeeling(int x) {
        if (Math.abs(feeling) <= 100) {
            feeling += x;
        } else if(feeling > 100) {
            feeling = 100;
        } else {
            feeling = -100;
        }
        return feeling;
    }

    //create the "Affection" indicator
    public static int setAffection(int x) {
        affection = x;
        return affection;
    }

    //define 16 methods of all the personal types
    public static void ISTJ() {

    }


}
