import java.lang.reflect.Method;
import java.util.Enumeration;
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
        int safetyAfterSelf = Human.safety;
        int socialAfterSelf = Human.social;
        int respectAfterSelf = Human.respect;
        int selfAchievementAfterSelf = Human.selfAchievement;
        int overAchievementAfterSelf = Human.overAchievement;
        int feelingAfterSelf = Human.feeling;
        int affectionAfterSelf = Human.affection;
        System.out.println(safetyAfterSelf);


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
        int safetyAfterOpposite = Human.safety;
        int socialAfterOpposite = Human.social;
        int respectAfterOpposite = Human.respect;
        int selfAchievementAfterOpposite = Human.selfAchievement;
        int overAchievementAfterOpposite = Human.overAchievement;
        int feelingAfterOpposite = Human.feeling;
        int affectionAfterOpposite = Human.affection;
        System.out.println(safetyAfterOpposite);

        System.out.println("Adam:");
        //show the results, declare the variables to count the changes
        int pp = Math.abs(physicalAfterOpposite - physicalAfterSelf);
        int ppp = Math.abs(physicalAfterSelf);
        double p = pp * 1.0/ppp;

        //physical changes result output texts
        if (physicalAfterOpposite >= 0 && physicalAfterOpposite - physicalAfterSelf >= 0) {
            if (p < 0.5) {
                System.out.println("Eve unintentionally invokes Adam's physical needs, now Adam indulges himself sometimes." );
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Eve brings obvious changes to Adam's physical needs, now Adam becomes more lustful and gluttonous. ");
            } else if (p >= 1) {
                System.out.println("Eve brings tremendous changes to Adam's physical needs, now Adam can always feel his animal desire and have unstoppable impulsive to fulfill them. ");
            }
        } else if (physicalAfterOpposite >= 0 && physicalAfterOpposite - physicalAfterSelf < 0) {
            if (p < 0.5) {
                System.out.print("Eve does no efforts on Adams' good appetite on both food and women. ");
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Although Eve shows no her disgust on body pressure, which does not stop Adam indulging himself sometimes. ");
            } else if (p >= 1) {
                System.out.println("Eve tries so hard to turn Adam into a more spiritual lifestyle, but Adam still cannot get himself out of the sensual pressure. ");
            }
        } else if (physicalAfterOpposite < 0 && physicalAfterOpposite - physicalAfterSelf <= 0) {
            if (p < 0.5) {
                System.out.println("Eve brought slightly changes to Adam's daily life, now Adam cares less about material life. ");
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Eve brought obvious changes to Adam's physical needs, now Adam starts to feel tedious about chasing fancy foods, beautiful women etc. ");
            } else if (p >= 1) {
                System.out.println("Eve brought tremendous changes to Adam's physical needs, now Adam seems like stoic and show completely no interest in secular life. ");
            }
        } else {
            if (p < 0.5) {
                System.out.println("Eve enjoys more food and lust than Adam, who seems a little bit tedious when turning into these stuffs. ");
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Although Eve does obvious changes to Adam's physical needs, Adam still feel a little bit tedious about chasing fancy foods, beautiful women etc. ");
            } else if (p >= 1) {
                System.out.println("Eve tries so hard to seduce Adam, now Adam seems not disturbed by such sensual pressure. ");
            }
        }

        //safety changes result output texts
        int saa = Math.abs(safetyAfterOpposite - safetyAfterSelf);
        int saaa = Math.abs(safetyAfterSelf);
        double sa = saa * 1.0/saaa;

        if (safetyAfterOpposite >= 0 && safetyAfterOpposite - safetyAfterSelf >= 0) {
            if (sa < 0.5) {
                System.out.println("Sometimes Eve can calms Adam down, makes him feel a little bit warm in this cold cruel world. ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Eve's tenderness makes Adam constantly reminds of his mother. ");
            } else if (sa >= 1) {
                System.out.println("Eve's like a sun to Adam, bringing endless warmth.");
            }
        } else if (safetyAfterOpposite >= 0 && safetyAfterOpposite - safetyAfterSelf < 0) {
            if (sa < 0.5) {
                System.out.print("Eve is not so predictable which makes Adam worrying about sometimes. ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Eve always makes life more insecure, even tough guy like Adam cannot stop worrying them.");
            } else if (sa >= 1) {
                System.out.println("Adam will feel much secure about life without Eve, she is way to worrisome. ");
            }
        } else if (safetyAfterOpposite < 0 && safetyAfterOpposite - safetyAfterSelf <= 0) {
            if (sa < 0.5) {
                System.out.println("Adam feel stressed when being with Eve, who drags him into the sea of insecure. ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Adam feel the hostility of surrounding in daily life, especially when Eve breaks in. ");
            } else if (sa >= 1) {
                System.out.println("Adam can hardly breath when stay together with Eve, he acts like a paranoid. ");
            }
        } else {
            if (sa < 0.5) {
                System.out.println("Eve sometimes can release the Adam's stress that the environment give him. ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Eve tries many times to tell Adam that nobody will hurt him. Adam still cannot make himself relieved. ");
            } else if (sa >= 1) {
                System.out.println("Eve does her best to get Adam out of the vortex of insecure. It works somehow though, but still has long way to go. ");
            }
        }

        //social changes result output texts
        int soo = Math.abs(socialAfterOpposite - socialAfterSelf);
        int sooo = Math.abs(socialAfterSelf);
        double so = soo * 1.0/sooo;

        if (socialAfterOpposite >= 0 && socialAfterOpposite - socialAfterSelf >= 0) {
            if (so < 0.5) {
                System.out.println("Eve often takes Adam out for a party, and Adam seems enjoying it. ");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Eve does not hesitate to introduce Adam to all her friends that makes Adam happy indeed. ");
            } else if (so >= 1) {
                System.out.println("Party queen Eve meets her new King Adam recently with her constantly efforts of invoking Adam's desire of social.");
            }
        } else if (socialAfterOpposite >= 0 && socialAfterOpposite - socialAfterSelf < 0) {
            if (so < 0.5) {
                System.out.print("Adam hangs out quite a lot but would never calls Eve. ");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Playful Adam never can understand the aloof of Eve, but he is influenced obviously. Now he accepts a quite weekend at home sometimes. ");
            } else if (so >= 1) {
                System.out.println("Adam want to have a break and meet some new friends while Eve always try to sabotage the relationships between him adn his friends. ");
            }
        } else if (socialAfterOpposite < 0 && socialAfterOpposite - socialAfterSelf <= 0) {
            if (so < 0.5) {
                System.out.println("Adam do not want meet new people. Luckily, he meets the same quite Eve. ");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Eve constraint Adam so much, whatever, Adam now do not need social life like he used to be. ");
            } else if (so >= 1) {
                System.out.println("Adam feels meeting Eve is like walking in a silent cave: Maybe soliloquize at first, then completely mute at last because of the lack of response. ");
            }
        } else {
            if (so < 0.5) {
                System.out.println("Eve likes to inspire the speechless Adam to talks, but barely works.");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Adam always feel himself in a noisy flea market when being with Eve, which makes him hard to bear. ");
            } else if (so >= 1) {
                System.out.println("Eve makes Adam feel that he is done with social life, Eve fulfills all his social needs and makes him never want to talk to anyone else.");
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
