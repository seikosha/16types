import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Interaction {
    public static void main(String[] args) {
        influence();
    }


    //method for getting user input days
    public static Integer userInputDays() {
        //get user input days of interaction
        Scanner days = new Scanner(System.in);
        String userInputDays = days.next();
        int n = Integer.parseInt(userInputDays);
        System.out.println(n);
        return n;

    }

    //standard influence on Adam, simulating the natural changes of the indicators
    public static void influence() {

        int n = userInputDays();

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-20,20+1);
            Human.setPhysical(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-20,20+1);
            Human.setSafety(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-20,20+1);
            Human.setSocial(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-20,20+1);
            Human.setRespect(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-20,20+1);
            Human.setSelfAchievement(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-20,20+1);
            Human.setOverAchievement(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-20,20+1);
            Human.setFeeling(randomNum);
        }

        //little difference for Affection for simulate the natural growth of human's affection
        for (int i = 0; i <= n; i++) {
            Human.setAffection(i);
        }


        System.out.println("After " + n + " days accompany, it seems like:");
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
