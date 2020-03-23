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
        physical += x;
        return physical;
    }

    //create the "Safety" indicator
    public static int setSafety(int x) {
        safety += x;
        return safety;
    }

    //create the "Social" indicator
    public static int setSocial(int x) {
        social += x;
        return social;
    }

    //create the "Respect" indicator
    public static int setRespect(int x) {
        respect += x;
        return respect;
    }

    //create the "Self-Achievement" indicator
    public static int setSelfAchievement(int x) {
        selfAchievement += x;
        return selfAchievement;
    }

    //create the "Over-Achievement" indicator
    public static int setOverAchievement(int x) {
        overAchievement += x;
        return overAchievement;
    }

    //create the "Feeling" indicator
    public static int setFeeling(int x) {
        feeling += x;
        return feeling;
    }

    //create the "Affection" indicator
    public static int setAffection(int x) {
        affection += x;
        return affection;
    }


}
