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

    //define 16 methods of all the personal types, use ISTJ type to show the logic
    public static void ISTJSelf() {
        //build the 'inspector' trait
        int randomChanges1 = ThreadLocalRandom.current().nextInt(0,1+1);
        setSafety(randomChanges1);
        int randomChanges2 = ThreadLocalRandom.current().nextInt(0,3+1);
        setRespect(randomChanges2);

        //build the 'aloof' trait
        int randomChanges3 = ThreadLocalRandom.current().nextInt(-10,-5+1);
        setSocial(randomChanges3);
        int randomChanges4 = ThreadLocalRandom.current().nextInt(-2,1);
        setSelfAchievement(randomChanges4);
        setOverAchievement(randomChanges1);
        int randomChanges5 = ThreadLocalRandom.current().nextInt(-5,-1+1);
        setAffection(randomChanges5);

        //build the 'devotion' trait
        int randomChanges6 = ThreadLocalRandom.current().nextInt(-1,1);
        setPhysical(randomChanges6);
        int randomChanges7 = ThreadLocalRandom.current().nextInt(-5,1);
        setSocial(randomChanges7);
        int randomChanges8 = ThreadLocalRandom.current().nextInt(-2,2+1);
        setRespect(randomChanges8);
        int randomChanges9 = ThreadLocalRandom.current().nextInt(0,2+1);
        setSelfAchievement(randomChanges9);
        int randomChanges10 = ThreadLocalRandom.current().nextInt(1,2+1);
        setOverAchievement(randomChanges10);

        //build the 'trustful' trait
        setSafety(randomChanges1);
        int randomChanges11 = ThreadLocalRandom.current().nextInt(-2,5);
        setSocial(randomChanges11);
        setRespect(randomChanges9);
        setSelfAchievement(randomChanges2);
        setOverAchievement(randomChanges1);
        setFeeling(randomChanges1);
        setAffection(randomChanges1);

        //build the 'truth wins out over tact' trait
        setSocial(randomChanges7);
        int randomChanges12 = ThreadLocalRandom.current().nextInt(-3,1+1);
        setRespect(randomChanges12);
        setSelfAchievement(randomChanges12);
        setOverAchievement(randomChanges1);
        int randomChanges13 = ThreadLocalRandom.current().nextInt(-4,1+1);
        setFeeling(randomChanges13);
        setAffection(randomChanges6);

        //build the 'keep feeling to themselves' trait
        setPhysical(randomChanges6);
        setSocial(randomChanges7);
        setSelfAchievement(randomChanges6);
        setOverAchievement(randomChanges6);
        setFeeling(randomChanges6);
        setAffection(randomChanges13);

        //build the 'traditional' trait
        int randomChanges14 = ThreadLocalRandom.current().nextInt(-1,3+1);
        setSafety(randomChanges14);
        setSelfAchievement(randomChanges1);
        int randomChanges15 = ThreadLocalRandom.current().nextInt(-1,1+1);
        setFeeling(randomChanges15);
    }

    public static void ISTJOpposite() {
        //build the 'inspector' trait
        int randomChanges1 = ThreadLocalRandom.current().nextInt(0,1+1);
        setSafety(randomChanges1);
        int randomChanges2 = ThreadLocalRandom.current().nextInt(-5,1);
        setSocial(randomChanges2);

        //build the 'aloof' trait
        int randomChanges3 = ThreadLocalRandom.current().nextInt(-10,-5+1);
        setSocial(randomChanges3);
        int randomChanges4 = ThreadLocalRandom.current().nextInt(-2,1);
        setRespect(randomChanges4);
        int randomChanges5 = ThreadLocalRandom.current().nextInt(-5,-1+1);
        setFeeling(randomChanges5);
        setAffection(randomChanges5);

        //build the 'devotion' trait
        setSocial(randomChanges2);
        int randomChanges6 = ThreadLocalRandom.current().nextInt(-2,4+1);
        setRespect(randomChanges6);

        //build the 'trustful' trait
        int randomChanges7 = ThreadLocalRandom.current().nextInt(2,5+1);
        setSafety(randomChanges7);
        int randomChanges8 = ThreadLocalRandom.current().nextInt(-1,3+1);
        setSocial(randomChanges8);
        int randomChanges9 = ThreadLocalRandom.current().nextInt(0,2+1);
        setRespect(randomChanges9);
        int randomChanges10 = ThreadLocalRandom.current().nextInt(0,3+1);
        setFeeling(randomChanges10);
        setAffection(randomChanges1);

        //build the 'truth wins out over tact' trait
        int randomChanges11 = ThreadLocalRandom.current().nextInt(-1,2);
        setSafety(randomChanges11);
        setSocial(randomChanges3);
        setRespect(randomChanges2);
        int randomChanges12 = ThreadLocalRandom.current().nextInt(-4,1+1);
        setFeeling(randomChanges12);
        int randomChanges13 = ThreadLocalRandom.current().nextInt(-1,1);
        setAffection(randomChanges13);

        //build the 'keep feeling to themselves' trait
        setSocial(randomChanges2);
        setFeeling(randomChanges13);
        setAffection(randomChanges13);

        //build the 'traditional' trait
        setRespect(randomChanges1);
        int randomChanges14 = ThreadLocalRandom.current().nextInt(-1,1+1);
        setFeeling(randomChanges14);
    }
//    //briefly build the 'INTJ' type
//    public static void INTJSelf() {
//        int randomChanges1 = ThreadLocalRandom.current().nextInt(-3,1);
//        setSafety(randomChanges1);
//        int randomChanges2 = ThreadLocalRandom.current().nextInt(-5,1);
//        setSocial(randomChanges2);
//        setRespect(randomChanges2);
//        int randomChanges3 = ThreadLocalRandom.current().nextInt(0,2+1);
//        setSelfAchievement(randomChanges3);
//        int randomChanges4 = ThreadLocalRandom.current().nextInt(0,7+1);
//        setOverAchievement(randomChanges4);
//        int randomChanges5 = ThreadLocalRandom.current().nextInt(-2,1);
//        setFeeling(randomChanges5);
//        setPhysical(randomChanges5);
//    }
//
    public static void INTJOpposite() {
        int randomChanges1 = ThreadLocalRandom.current().nextInt(-1,1);
        setSafety(randomChanges1);
        int randomChanges2 = ThreadLocalRandom.current().nextInt(-9,1);
        setSocial(randomChanges2);
        int randomChanges3 = ThreadLocalRandom.current().nextInt(-2,1);
        setRespect(randomChanges3);
        int randomChanges4 = ThreadLocalRandom.current().nextInt(0,1+1);
        setSelfAchievement(randomChanges4);
        setOverAchievement(randomChanges4);
        int randomChanges5 = ThreadLocalRandom.current().nextInt(-3,1);
        setFeeling(randomChanges5);
        setAffection(randomChanges1);
    }

    public static void INTPSelf() {
        int randomChanges1 = ThreadLocalRandom.current().nextInt(-4,1);
        setPhysical(randomChanges1);
        int randomChanges2 = ThreadLocalRandom.current().nextInt(0,1+1);
        setSafety(randomChanges2);
        int randomChanges3 = ThreadLocalRandom.current().nextInt(0,5+1);
        setSocial(randomChanges3);
        int randomChanges4 = ThreadLocalRandom.current().nextInt(0,2+1);
        setOverAchievement(randomChanges4);
        setFeeling(randomChanges4);
        setAffection(randomChanges2);
    }

    public static void INTPOpposite() {
        int randomChanges1 = ThreadLocalRandom.current().nextInt(0,4+1);
        setSafety(randomChanges1);
        int randomChanges2 = ThreadLocalRandom.current().nextInt(0,2+1);
        setSocial(randomChanges2);
        int randomChanges3 = ThreadLocalRandom.current().nextInt(0,1+1);
        setRespect(randomChanges3);
        setSelfAchievement(randomChanges3);
        setFeeling(randomChanges3);
        setAffection(randomChanges3);
    }


}
