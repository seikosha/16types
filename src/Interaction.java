import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Interaction {

    public static void main(String[] args) throws Exception {
        influenceAdam();
        System.out.println("");
        System.out.println("After " + n + " days accompany with Eve, Adam seems like:");
        System.out.println("Physical: " + Human.physical);
        System.out.println("Safety: " + Human.safety);
        System.out.println("Social: " + Human.social);
        System.out.println("Respect: " + Human.respect);
        System.out.println("Self Achievement: " + Human.selfAchievement);
        System.out.println("Over Achievement: " + Human.overAchievement);
        System.out.println("Feeling: " + Human.feeling);
        System.out.println("Affection: " + Human.affection);
        System.out.println("=====================================");
        reset();
        influenceEve();
        System.out.println("");
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

    //declare variables for getting user input information
    private static String typeA = userInputTypesA() + "Self";
    private static String typeB = typeA.substring(0,typeA.length()-4) + "Opposite";
    private static String typeD = userInputTypesB() + "Opposite";
    private static String typeC = typeD.substring(0,typeD.length()-8) + "Self";
    public static int n = userInputDays();

    //method for getting user input days
    public static Integer userInputDays() {
        System.out.println("Please tell us how many days do you want these two people have interactions with each other?");
        Scanner days = new Scanner(System.in);
        String userInputDays = days.next();
        return Integer.parseInt(userInputDays);
    }

    //method for getting user input personal types
    public static String userInputTypesA() {
        System.out.println("There are 16 personal types below:");
        System.out.println("Sensing Types with Thinking:    Sensing Types with Feeling:    Intuitive Types with Feelings:    Intuitive Types with Thinking:");
        System.out.println("--ISTJ                          --ISFJ                         --INFJ                            --INTJ");
        System.out.println("--ISTP                          --ISFP                         --INFP                            --INTP");
        System.out.println("--ESTP                          --ESFP                         --ENFP                            --ENTP");
        System.out.println("--ESTJ                          --ESFJ                         --ENFJ                            --ENTJ");
        System.out.println("Please tell us the personal types of Adam:");
        Scanner type1 = new Scanner(System.in);
        return type1.nextLine().toLowerCase();
    }

    public static String userInputTypesB() {
        System.out.println("Please tell us the personal types of Eve:");
        Scanner type2 = new Scanner(System.in);
        return type2.nextLine().toLowerCase();
    }

    //standard influence on Adam, simulating the natural changes of the indicators
    public static void influenceAdam() throws Exception {

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
            Human.setPhysical(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
            Human.setSafety(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
            Human.setSocial(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
            Human.setRespect(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
            Human.setSelfAchievement(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-2, 2 + 1);
            Human.setOverAchievement(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
            Human.setFeeling(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
            Human.setAffection(randomNum);
        }

        int physicalBeforeInfluence = Human.physical;
        System.out.println("Before Influence: " + Human.physical);

        for (int i = 0; i < n; i++) {
            Class<types> typesClass = types.class;
            Method[] methods = typesClass.getDeclaredMethods();
            types t = new types();
            for (Method method : methods) {
                String name = method.getName();
                if (name.equals(typeA)) {
                    Method self = typesClass.getMethod(typeA);
                    self.invoke(t);
                }
            }
        }
        int physicalAfterSelf = Human.physical;
        System.out.println("After Self: " + physicalAfterSelf);

        for (int i = 0; i < n; i++) {
            Class<types> typesClass = types.class;
            Method[] methods = typesClass.getDeclaredMethods();
            types t = new types();
            for (Method method : methods) {
                String name = method.getName();
                if (name.equals(typeD)) {
                    Method opposite = typesClass.getMethod(typeD);
                    opposite.invoke(t);
                }
            }
        }
        int physicalAfterOpposite = Human.physical;
        System.out.println("After Opposite: " + physicalAfterOpposite);

        //show the results


        int ii = Math.abs(physicalAfterOpposite - physicalAfterSelf);
        System.out.println("ii = " + ii);
        int iii = Math.abs(physicalAfterSelf);
        System.out.println("iii = " + iii);
        float i = ii/iii;
        System.out.println("i = " + i);

        if (physicalAfterOpposite >= 0) {
            if (i < 0.5) {
                System.out.print("Eve unintentionally invoked Adam's physical needs, now Adam indulges himself sometimes.  ");
            } else if (i >= 0.5 && i < 1) {
                System.out.println("Eve brought obvious changes to Adam's physical needs, now Adam becomes more lustful and gluttonous. ");
            } else if (i >= 1) {
                System.out.println("Eve brought tremendous changes to Adam's physical needs, now Adam can always feel his animal desire and have unstoppable impulsive to fulfill them. ");
            }
        } else {
            if (i < 0.5) {
                System.out.println("Eve brought slightly changes to Adam's daily life, now Adam cares less about material life. ");
            } else if (i >= 0.5 && i < 1) {
                System.out.println("Eve brought obvious changes to Adam's physical needs, now Adam starts to feel tedious about chasing fancy foods, beautiful women etc. ");
            } else if (i >= 1) {
                System.out.println("Eve brought tremendous changes to Adam's physical needs, now Adam seems like stoic and show completely no interest in secular life. ");
            }
        }
    }


    //set the variables to default
    public static void reset() {
        Human.physical = 0;
        Human.safety = 0;
        Human.social = 0;
        Human.respect = 0;
        Human.selfAchievement = 0;
        Human.overAchievement = 0;
        Human.feeling = 0;
        Human.affection = 0;
    }

    public static void influenceEve() throws Exception {

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setPhysical(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setSafety(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-10,10+1);
            Human.setSocial(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setRespect(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setSelfAchievement(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-2,2+1);
            Human.setOverAchievement(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5,5+1);
            Human.setFeeling(randomNum);
        }

        for (int i = 0; i < n; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0,1+1);
            Human.setAffection(randomNum);
        }

        for (int i = 0; i < n ; i++) {
            Class<types> typesClass = types.class;
            Method[] methods = typesClass.getDeclaredMethods();
            types t = new types();
            for (Method method : methods) {
                String name = method.getName();
                if (name.equals(typeB)) {
                    Method self = typesClass.getMethod(typeB);
                    self.invoke(t);
                } else if (name.equals(typeC)) {
                    Method opposite = typesClass.getMethod(typeC);
                    opposite.invoke(t);
                }
            }
        }
    }
}
