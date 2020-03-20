import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Interaction {




    public static void main(String[] args) {
        userInputTypesA();
        userInputTypesB();
        influenceAdam();
        influenceEve();
//        String typeName = Interaction.userInputTypes();
    }

    //method for getting user input days
    public static Integer userInputDays() {
        System.out.println("Please tell us how many days you want these two people have interactions with each other?");
        Scanner days = new Scanner(System.in);
        String userInputDays = days.next();
        return Integer.parseInt(userInputDays);
    }

    //method for getting user input personal types
    public static String userInputTypesA() {
        System.out.println("Please tell us the personal types of Adam:");
        Scanner type1 = new Scanner(System.in);
        String typeA = type1.nextLine();
        System.out.println(typeA);
        return typeA;
    }

    public static String userInputTypesB() {
        System.out.println("Please tell us the personal types of Eve:");
        Scanner type2 = new Scanner(System.in);
        String typeB = type2.nextLine();
        System.out.println(typeB);
        return typeB;
    }

    //standard influence on Adam, simulating the natural changes of the indicators
    private static int n = userInputDays();;
    public static void influenceAdam() {

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setPhysical(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setSafety(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-20,20+1);
            Human.setSocial(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setRespect(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setSelfAchievement(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-2,2+1);
            Human.setOverAchievement(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setFeeling(randomNum);
        }

        //little difference for Affection for simulate the natural growth of human's affection
        for (int i = 0; i <= n; i++) {
            Human.setAffection(i);
        }

        System.out.println("After " + n + " days accompany with Eve, Adam seems like:");
        System.out.println("Physical: " + Human.physical);
        System.out.println("Safety: " + Human.safety);
        System.out.println("Social: " + Human.social);
        System.out.println("Respect: " + Human.respect);
        System.out.println("Self Achievement: " + Human.selfAchievement);
        System.out.println("Over Achievement: " + Human.overAchievement);
        System.out.println("Feeling: " + Human.feeling);
        System.out.println("Affection: " + Human.affection);
        System.out.println("=============================");
    }

    public static void influenceEve() {

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setPhysical(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setSafety(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-20,20+1);
            Human.setSocial(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setRespect(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setSelfAchievement(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-2,2+1);
            Human.setOverAchievement(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setFeeling(randomNum);
        }

        //little difference for Affection for simulate the natural growth of human's affection
        for (int i = 0; i <= n; i++) {
            Human.setAffection(i);
        }

        System.out.println("After " + n + " days accompany with Adam, Eve seems like:");
        System.out.println("Physical: " + Human.physical);
        System.out.println("Safety: " + Human.safety);
        System.out.println("Social: " + Human.social);
        System.out.println("Respect: " + Human.respect);
        System.out.println("Self Achievement: " + Human.selfAchievement);
        System.out.println("Over Achievement: " + Human.overAchievement);
        System.out.println("Feeling: " + Human.feeling);
        System.out.println("Affection: " + Human.affection);
    }
}
