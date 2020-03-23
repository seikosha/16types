import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Interaction {

    public static void main(String[] args) throws Exception {

//        influenceAdam();
//        influenceEve();
        Class<types> typesClass = types.class;
        Method[] methods = typesClass.getDeclaredMethods();
        for (Method method : methods) {
            String name = method.getName();
//            System.out.println(name);
        }

        types t = new types();
        for (Method method : methods) {
            String name = method.getName();
            if (name.equals(typeA)) {
                Method SPEAK = typesClass.getMethod(typeA);
                SPEAK.invoke(t);
            }

        }

        System.out.println(typeA);
//        for (Method method : methods) {
//            System.out.println(method);
//        }
//        System.out.println(methods);
//        System.out.println(methods[1]);
//        methods[1].invoke(t);
//        }



    }

    private static int n = userInputDays();
    private static String typeA = userInputTypesA() + "Self";
    private static String typeB = userInputTypesB() + "Opposite";

    //method for getting user input days
    public static Integer userInputDays() {
        System.out.println("Please tell us how many days do you want these two people have interactions with each other?");
        Scanner days = new Scanner(System.in);
        String userInputDays = days.next();
        return Integer.parseInt(userInputDays);
    }

    //method for getting user input personal types
    public static String userInputTypesA() {
        System.out.println("Please tell us the personal types of Adam:");
        Scanner type1 = new Scanner(System.in);
        return type1.nextLine();
    }

    public static String userInputTypesB() {
        System.out.println("Please tell us the personal types of Eve:");
        Scanner type2 = new Scanner(System.in);
        return type2.nextLine();
    }



    //standard influence on Adam, simulating the natural changes of the indicators
    public static void influenceAdam() {

        for (int i = 0; i <= n ; i++) {
//            Class HumanClass = Human.class;
//            Method intjSelf_method = HumanClass.getMethod("intjSelf");
//            Human h = new Human();
//            intjSelf_method.invoke(h);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setPhysical(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setSafety(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-10,10+1);
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

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0,1+1);
            Human.setAffection(randomNum);
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

    public static void influenceEve() throws Exception {

        for (int i = 0; i <= n ; i++)  {
//            Class HumanClass = Human.class;
//            Method intjSelf_method = HumanClass.getMethod("intjSelf");
//            Human h = new Human();
//            intjSelf_method.invoke(h);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setPhysical(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setSafety(randomNum);
        }

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-10,10+1);
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

        for (int i = 0; i <= n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0,1+1);
            Human.setAffection(randomNum);
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
