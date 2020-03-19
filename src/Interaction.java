import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Interaction {
    public static void main(String[] args) {
        influenceA();
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
    public static void influenceA() {

        int n = userInputDays();
        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-30,30+1);
            int r =Human.setPhysical(randomNum);
            System.out.println(r);
//            Human.safety += Human.setSafety(randomNum);
            if (Math.abs(Human.physical) <= 100) {
                Human.physical += r;
            } else if (Human.physical > 100)  {
                Human.physical = 100;
            } else {
                Human.physical = -100;
            }
            System.out.print("physical" + Human.physical);
        }



        System.out.println("physical" + Human.physical);
//        System.out.println("safety" + Human.safety);

//        System.out.println("==========");
//        System.out.println(Human.physical);


//        Human.setPhysical(randomNum);
//
//
//
//        Human.setSafety(randomNum);
//        Human.setSocial(randomNum);
//        Human.setRespect(randomNum);
//        Human.setSelfAchievement(randomNum);
//        Human.setOverAchievement(randomNum);
//        Human.setFeeling(randomNum);
//        Human.setAffection(randomNum);

    }



    public void influenceB() {

    }
}
