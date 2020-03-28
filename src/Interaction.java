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

        System.out.println("Adam:");
        //show the results, declare the variables to count the changes
        int pp = Math.abs(physicalAfterOpposite - physicalAfterSelf);
        int ppp = Math.abs(physicalAfterSelf);
        double p = pp * 1.0/ppp;

        //physical changes result output texts
        if (physicalAfterOpposite >= 0 && physicalAfterOpposite - physicalAfterSelf >= 0) {
            if (p < 0.5) {
                System.out.println("Physical needs slightly enhanced (Eve unintentionally invokes Adam's physical needs, now Adam indulges himself sometimes.)" );
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Physical needs remarkable enhanced (Eve brings obvious changes to Adam's physical needs, now Adam becomes more lustful and gluttonous.) ");
            } else if (p >= 1) {
                System.out.println("Physical needs tremendously enhanced (Eve brings tremendous changes to Adam's physical needs, now Adam can always feel his animal desire and have unstoppable impulsive to fulfill them.) ");
            }
        } else if (physicalAfterOpposite >= 0 && physicalAfterOpposite - physicalAfterSelf < 0) {
            if (p < 0.5) {
                System.out.println("Physical needs slightly weakened (Eve does no efforts on Adams' good appetite on both food and women.) ");
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Physical needs remarkable weakened (Although Eve shows no her interest on body pressure, which does not stop Adam indulging himself sometimes.) ");
            } else if (p >= 1) {
                System.out.println("Physical needs tremendously weakened (Eve tries so hard to turn Adam into a more spiritual lifestyle, but Adam still cannot get himself out of the sensual pressure.) ");
            }
        } else if (physicalAfterOpposite < 0 && physicalAfterOpposite - physicalAfterSelf <= 0) {
            if (p < 0.5) {
                System.out.println("Physical needs slightly weakened (Eve brought slightly changes to Adam's daily life, now Adam cares less about material life.) ");
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Physical needs remarkable weakened (Eve brought obvious changes to Adam's physical needs, now Adam starts to feel tedious about chasing fancy foods, beautiful women etc.) ");
            } else if (p >= 1) {
                System.out.println("Physical needs tremendously weakened (Eve brought tremendous changes to Adam's physical needs, now Adam seems like stoic and show completely no interest in secular life.) ");
            }
        } else {
            if (p < 0.5) {
                System.out.println("Physical needs slightly enhanced (Eve enjoys more food and lust than Adam, who seems a little bit tedious when turning into these stuffs.) ");
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Physical needs remarkable enhanced (Although Eve does obvious changes to Adam's physical needs, Adam still feel a little bit tedious about chasing fancy foods, beautiful women etc.) ");
            } else if (p >= 1) {
                System.out.println("Physical needs tremendously enhanced (Eve tries so hard to seduce Adam, now Adam seems not disturbed by such sensual pressure.) ");
            }
        }

        //safety changes result output texts
        int saa = Math.abs(safetyAfterOpposite - safetyAfterSelf);
        int saaa = Math.abs(safetyAfterSelf);
        double sa = saa * 1.0/saaa;

        if (safetyAfterOpposite >= 0 && safetyAfterOpposite - safetyAfterSelf >= 0) {
            if (sa < 0.5) {
                System.out.println("Sense of safety slightly enhanced (Sometimes Eve can calms Adam down, makes him feel a little bit warm in this cold cruel world.) ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Sense of safety remarkable enhanced (Eve's tenderness makes Adam constantly reminds of his mother.) ");
            } else if (sa >= 1) {
                System.out.println("Sense of safety tremendously enhanced (Eve's like a sun to Adam, bringing endless warmth.)");
            }
        } else if (safetyAfterOpposite >= 0 && safetyAfterOpposite - safetyAfterSelf < 0) {
            if (sa < 0.5) {
                System.out.println("Sense of safety slightly weakened (Eve is not so predictable which makes Adam worrying about sometimes.) ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Sense of safety remarkable weakened (Eve always makes life more insecure, even tough guy like Adam cannot stop worrying them.)");
            } else if (sa >= 1) {
                System.out.println("Sense of safety tremendously weakened (Adam feels much secure about life without Eve, she is way to worrisome.) ");
            }
        } else if (safetyAfterOpposite < 0 && safetyAfterOpposite - safetyAfterSelf <= 0) {
            if (sa < 0.5) {
                System.out.println("Sense of safety slightly weakened (Adam feel stressed when being with Eve, who drags him into the sea of insecure.) ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Sense of safety remarkable weakened (Adam feel the hostility of surrounding in daily life, especially when Eve breaks in.) ");
            } else if (sa >= 1) {
                System.out.println("Sense of safety tremendously weakened (Adam can hardly breath when stay together with Eve, he acts like a paranoid.) ");
            }
        } else {
            if (sa < 0.5) {
                System.out.println("Sense of safety slightly enhanced (Eve sometimes can release the Adam's stress that the environment give him.) ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Sense of safety remarkable enhanced (Eve tries many times to tell Adam that nobody will hurt him. Adam still cannot make himself relieved.) ");
            } else if (sa >= 1) {
                System.out.println("Sense of safety tremendously enhanced (Eve does her best to get Adam out of the vortex of insecure. It works somehow though, but still has long way to go.) ");
            }
        }

        //social changes result output texts
        int soo = Math.abs(socialAfterOpposite - socialAfterSelf);
        int sooo = Math.abs(socialAfterSelf);
        double so = soo * 1.0/sooo;

        if (socialAfterOpposite >= 0 && socialAfterOpposite - socialAfterSelf >= 0) {
            if (so < 0.5) {
                System.out.println("Social satisfaction slightly enhanced (Eve sometimes takes Adam out for a party, and Adam seems enjoying it.) ");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Social satisfaction remarkable enhanced (Eve does not hesitate to introduce Adam to all her friends that makes Adam happy indeed.) ");
            } else if (so >= 1) {
                System.out.println("Social satisfaction tremendously enhanced (Party queen Eve meets her new King Adam recently, with her constantly efforts of invoking Adam's desire of social.)");
            }
        } else if (socialAfterOpposite >= 0 && socialAfterOpposite - socialAfterSelf < 0) {
            if (so < 0.5) {
                System.out.println("Social satisfaction slightly weakened (Adam hangs out quite a lot but would never calls Eve.) ");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Social satisfaction remarkable weakened (Playful Adam never can understand the aloofness of Eve, but he is influenced obviously. Now he accepts a quite weekend at home sometimes.) ");
            } else if (so >= 1) {
                System.out.println("Social satisfaction tremendously weakened (Adam want to have a break and meet some new friends while Eve always try to sabotage the relationships between his friends and him.) ");
            }
        } else if (socialAfterOpposite < 0 && socialAfterOpposite - socialAfterSelf <= 0) {
            if (so < 0.5) {
                System.out.println("Social satisfaction slightly weakened (Adam do not want meet new people. Luckily, he meets the same quiet Eve.) ");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Social satisfaction remarkable weakened (Eve constraint Adam so much, whatever, Adam now do not need social life like he used to be.) ");
            } else if (so >= 1) {
                System.out.println("Social satisfaction tremendously weakened (Adam feels meeting Eve is like walking in a silent cave: Maybe soliloquize at first, then completely mute at last because of the lack of response.) ");
            }
        } else {
            if (so < 0.5) {
                System.out.println("Social satisfaction slightly enhanced (Eve likes to inspire the speechless Adam to talks, but barely works.)");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Social satisfaction remarkable enhanced (Adam always feel himself in a noisy flea market when being with Eve, which makes him hard to bear.) ");
            } else if (so >= 1) {
                System.out.println("Social satisfaction tremendously enhanced (Eve makes Adam feel that he is done with social life, Eve fulfills all his social needs and makes him never want to talk to anyone else.)");
            }
        }

        //respect changes result output texts
        int ree = Math.abs(respectAfterOpposite - respectAfterSelf);
        int reee = Math.abs(respectAfterSelf);
        double re = ree * 1.0/reee;

        if (respectAfterOpposite >= 0 && respectAfterOpposite - respectAfterSelf >= 0) {
            if (re < 0.5) {
                System.out.println("Sense of being respected slightly enhanced (Adam is happy with Eve's good manner.) ");
            } else if (re >= 0.5 && re < 1) {
                System.out.println("Sense of being respected remarkable enhanced (Everyone likes to mention Adam as a good guy in the neighborhood, especially Eve.) ");
            } else if (re >= 1) {
                System.out.println("Sense of being respected tremendously enhanced (Adam is renowned all over the city and Eve is the first fan.) ");
            }
        } else if (respectAfterOpposite >= 0 && respectAfterOpposite - respectAfterSelf < 0) {
            if (re < 0.5) {
                System.out.println("Sense of being respected slightly weakened (Adam not quite like Eve's provocative winks, which is her signature move.) ");
            } else if (re >= 0.5 && re < 1) {
                System.out.println("Sense of being respected remarkable weakened (Despite of his rude friend Eve, Adam is good, says everyone in town.) ");
            } else if (re >= 1) {
                System.out.println("Sense of being respected tremendously weakened (Adam have more than a dozen of times to pour his angry on Eve's disrespectful behaviors, but he holds back.) ");
            }
        } else if (respectAfterOpposite < 0 && respectAfterOpposite - respectAfterSelf <= 0) {
            if (re < 0.5) {
                System.out.println("Sense of being respected slightly weakened (Adam feels embarrassed after receiving several negative comments by Eve.) ");
            } else if (re >= 0.5 && re < 1) {
                System.out.println("Sense of being respected remarkable weakened (Adam feels severe humiliated by Eve's constant mock.) ");
            } else if (re >= 1) {
                System.out.println("Sense of being respected tremendously weakened (Adam now has a desperate attitude towards life due to Eve's daily humiliation.) ");
            }
        } else {
            if (re < 0.5) {
                System.out.println("Sense of being respected slightly enhanced (Eve's lovely smile sometimes seems heart-touching to Adam, who is the bad boy in others' eyes.) ");
            } else if (re >= 0.5 && re < 1) {
                System.out.println("Sense of being respected remarkable enhanced (Eve shows huge respect to the disrespectful Adam.) ");
            } else if (re >= 1) {
                System.out.println("Sense of being respected tremendously enhanced (No one really gets to know Adam, the bad boy who is discard by the world. The only believer is Eve.) ");
            }
        }

        //self achievement changes result output texts
        int s2 = Math.abs(selfAchievementAfterOpposite - selfAchievementAfterSelf);
        int s3 = Math.abs(selfAchievementAfterSelf);
        double s1 = s2 * 1.0/s3;

        if (selfAchievementAfterOpposite >= 0 && selfAchievementAfterOpposite - selfAchievementAfterSelf >= 0) {
            if (s1 < 0.5) {
                System.out.println("Self-fulfillment slightly enhanced (The tips from Eve is helpful on Adam's career.) ");
            } else if (s1 >= 0.5 && s1 < 1) {
                System.out.println("Self-fulfillment remarkable enhanced (Adam has a high-flying career with the help of Eve.) ");
            } else if (s1 >= 1) {
                System.out.println("Self-fulfillment tremendously enhanced (The Rome Adam has just built will collapse in a second without Eve.) ");
            }
        } else if (selfAchievementAfterOpposite >= 0 && selfAchievementAfterOpposite - selfAchievementAfterSelf < 0) {
            if (s1 < 0.5) {
                System.out.println("Self-fulfillment slightly weakened (Eve likes to call Adam out for fun when he's busy on work.) ");
            } else if (s1 >= 0.5 && s1 < 1) {
                System.out.println("Self-fulfillment remarkable weakened (Adam always feels his hard work worth nothing after Eve's contempt.) ");
            } else if (s1 >= 1) {
                System.out.println("Self-fulfillment tremendously weakened (Eve does extremely bad effects on Adams' career, luckily she does not directly destroy it.) ");
            }
        } else if (selfAchievementAfterOpposite < 0 && selfAchievementAfterOpposite - selfAchievementAfterSelf <= 0) {
            if (s1 < 0.5) {
                System.out.println("Self-fulfillment slightly weakened (Adam cannot resist the temptation that Eve brings in when at work.) ");
            } else if (s1 >= 0.5 && s1 < 1) {
                System.out.println("Self-fulfillment remarkable weakened (Adam cannot stop the thoughts of having fun with Eve when at work.) ");
            } else if (s1 >= 1) {
                System.out.println("Self-fulfillment tremendously weakened (Adam just do not want to work and only thing he want to dedicate with is Eve.) ");
            }
        } else {
            if (s1 < 0.5) {
                System.out.println("Self-fulfillment slightly enhanced (Eve reminds of Adam that he has work to do, but Adam just do not care.) ");
            } else if (s1 >= 0.5 && s1 < 1) {
                System.out.println("Self-fulfillment remarkable enhanced (Eve helps a lot on Adams' work when Adam indulge himself too much.) ");
            } else if (s1 >= 1) {
                System.out.println("Self-fulfillment tremendously enhanced (Even though Eve does her best to help, Adam just do not care to prove himself as a qualified adults and will not to bear any responsibility.)");
            }
        }

        //over achievement changes result output texts
        int oaa = Math.abs(overAchievementAfterOpposite - overAchievementAfterSelf);
        int oaaa = Math.abs(overAchievementAfterSelf);
        double oa = oaa * 1.0/oaaa;

        if (overAchievementAfterOpposite >= 0 && overAchievementAfterOpposite - overAchievementAfterSelf >= 0) {
            if (oa < 0.5) {
                System.out.println("Intrinsic value slightly enhanced (Eve give some advices to Adam to help him find his inherent peace.) ");
            } else if (oa >= 0.5 && oa < 1) {
                System.out.println("Intrinsic value remarkable enhanced (Eve tutors Adam on how to find his calling.) ");
            } else if (oa >= 1) {
                System.out.println("Intrinsic value tremendously enhanced (Eve invokes Adam as his guru.) ");
            }
        } else if (overAchievementAfterOpposite >= 0 && overAchievementAfterOpposite - overAchievementAfterSelf < 0) {
            if (oa < 0.5) {
                System.out.println("Intrinsic value slightly weakened (Adam likes to think more about the meaning of life while Eve does not care at all.) ");
            } else if (oa >= 0.5 && oa < 1) {
                System.out.println("Intrinsic value remarkable weakened (Adam is more like to devote himself into something he really interested in while Eve has strong interested in gain social identity.) ");
            } else if (oa >= 1) {
                System.out.println("Intrinsic value tremendously weakened (Eve thinks that only psycho like Adam will spend so much time on those useless thing. However, Adam thinks that he is doing something for the human being, not for himself only.)  ");
            }
        } else if (overAchievementAfterOpposite < 0 && overAchievementAfterOpposite - overAchievementAfterSelf <= 0) {
            if (oa < 0.5) {
                System.out.println("Intrinsic value slightly weakened (Adam pay less attention to his soul than social identity, so does Eve.) ");
            } else if (oa >= 0.5 && oa < 1) {
                System.out.println("Intrinsic value remarkable weakened (Adam and Eve have consensus on the correctness of utilitarianism.) ");
            } else if (oa >= 1) {
                System.out.println("Intrinsic value tremendously weakened (Eve persuade Adam to abandon the final piece of thought about his calling. Now Adam's life meaning has become completely utilitarianism.) ");
            }
        } else {
            if (oa < 0.5) {
                System.out.println("Intrinsic value slightly enhanced (Adam dislike Eve's cliches about the well being of human, he just want to enjoy his life, now!) ");
            } else if (oa >= 0.5 && oa < 1) {
                System.out.println("Intrinsic value remarkable enhanced (Eve leaves some unapparent marks on Adam about awaking, but all be washed away by Adam's ambition on self-fulfillment.) ");
            } else if (oa >= 1) {
                System.out.println("Intrinsic value tremendously enhanced (Adam go through the whole process of self-awakening lead by Eve, but he still think the secular fulfillment is the most important thing in life.)");
            }
        }

        //feeling changes result output texts
        int ff = Math.abs(feelingAfterOpposite - feelingAfterSelf);
        int fff = Math.abs(feelingAfterSelf);
        double f = ff * 1.0/fff;

        if (feelingAfterOpposite >= 0 && feelingAfterOpposite - feelingAfterSelf >= 0) {
            if (f < 0.5) {
                System.out.println("Affection slightly enhanced (Adam feels the eyes of Eve on himself, and he knows it's special.) ");
            } else if (f >= 0.5 && f < 1) {
                System.out.println("Affection remarkable enhanced (Eve likes Adam a lot. She starts to miss him when he is not around.) ");
            } else if (f >= 1) {
                System.out.println("Affection tremendously enhanced (They are definitely in the vortex of love.) ");
            }
        } else if (feelingAfterOpposite >= 0 && feelingAfterOpposite - feelingAfterSelf < 0) {
            if (f < 0.5) {
                System.out.println("Affection slightly weakened (Adam knows all Eve's get-attraction tricks, but he pretends to be like nothing happens.) ");
            } else if (f >= 0.5 && f < 1) {
                System.out.println("Affection remarkable weakened (Adam is the beloved one in the relationship.) ");
            } else if (f >= 1) {
                System.out.println("Affection tremendously weakened (Now Eve is getting more and more crazy about Adam.) ");
            }
        } else if (feelingAfterOpposite < 0 && feelingAfterOpposite - feelingAfterSelf <= 0) {
            if (f < 0.5) {
                System.out.println("Affection slightly weakened (Adam knows he just an ordinary guy with an ordinary love life, beauties like Eve barely pays attention to him.) ");
            } else if (f >= 0.5 && f < 1) {
                System.out.println("Affection remarkable weakened (Everybody is not fond of our dirty little Adam, not mention of Eve.) ");
            } else if (f >= 1) {
                System.out.println("Affection tremendously weakened (Adam is disgusting in others' eyes. They even give him a nickname called 'roach'.) ");
            }
        } else {
            if (f < 0.5) {
                System.out.println("Affection slightly enhanced (Adam and Eve barely knows each other.) ");
            } else if (f >= 0.5 && f < 1) {
                System.out.println("Affection remarkable enhanced (Don't get these two guys in one room, they will fight, I mean it.) ");
            } else if (f >= 1) {
                System.out.println("Affection tremendously enhanced (They are like bitter rivals after these days accompany.)");
            }
        }

        //affection changes result output texts
        int aa = Math.abs(affectionAfterOpposite - affectionAfterSelf);
        int aaa = Math.abs(affectionAfterSelf);
        double a = aa * 1.0/aaa;

        if (affectionAfterOpposite >= 0 && affectionAfterOpposite - affectionAfterSelf >= 0) {
            if (a < 0.5) {
                System.out.println("Bond between two people slightly enhanced (The connection between these two grows steadily.) ");
            } else if (a >= 0.5 && a < 1) {
                System.out.println("Bond between two people remarkable enhanced (The connection between these two grows fast.) ");
            } else if (a >= 1) {
                System.out.println("Bond between two people tremendously enhanced (They can even bear one day without each other.) ");
            }
        } else if (affectionAfterOpposite >= 0 && affectionAfterOpposite - affectionAfterSelf < 0) {
            if (a < 0.5) {
                System.out.println("Bond between two people slightly weakened (Adam feels that the connection between he and Eve grows gradually, but Eve does not think in that way.) ");
            } else if (a >= 0.5 && a < 1) {
                System.out.println("Bond between two people remarkable weakened (Adam feels that every time he tries to get closer to Eve, Eve pull back a little bit accordingly.) ");
            } else if (a >= 1) {
                System.out.println("Bond between two people tremendously weakened (Adam knows Eve is hard to open her heart to others, but there is a little space for Adam, just a little.) ");
            }
        } else if (affectionAfterOpposite < 0 && affectionAfterOpposite - affectionAfterSelf <= 0) {
            if (a < 0.5) {
                System.out.println("Bond between two people slightly weakened (These two cannot get alone so well, though not so bad.) ");
            } else if (a >= 0.5 && a < 1) {
                System.out.println("Bond between two people remarkable weakened (They just cannot accept each other as true friend.) ");
            } else if (a >= 1) {
                System.out.println("Bond between two people tremendously weakened (Every second they are with each other is killing both of them.) ");
            }
        } else {
            if (a < 0.5) {
                System.out.println("Bond between two people slightly enhanced (Adam responses nothing to Eve's friendship.) ");
            } else if (a >= 0.5 && a < 1) {
                System.out.println("Bond between two people remarkable enhanced (Eve tries so hard to get alone with Adam, but Adam really just do not feel a thing about Eve.) ");
            } else if (a >= 1) {
                System.out.println("Bond between two people tremendously enhanced (Eve likes every minute being with Adam, while Adam intentionally keeps the distance between each other. God, it's a really long long distance.)");
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

        int physicalAfterSelf = Human.physical;
        int safetyAfterSelf = Human.safety;
        int socialAfterSelf = Human.social;
        int respectAfterSelf = Human.respect;
        int selfAchievementAfterSelf = Human.selfAchievement;
        int overAchievementAfterSelf = Human.overAchievement;
        int feelingAfterSelf = Human.feeling;
        int affectionAfterSelf = Human.affection;

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

        int physicalAfterOpposite = Human.physical;
        int safetyAfterOpposite = Human.safety;
        int socialAfterOpposite = Human.social;
        int respectAfterOpposite = Human.respect;
        int selfAchievementAfterOpposite = Human.selfAchievement;
        int overAchievementAfterOpposite = Human.overAchievement;
        int feelingAfterOpposite = Human.feeling;
        int affectionAfterOpposite = Human.affection;

        System.out.println("Eve:");
        //show the results, declare the variables to count the changes
        int pp = Math.abs(physicalAfterOpposite - physicalAfterSelf);
        int ppp = Math.abs(physicalAfterSelf);
        double p = pp * 1.0/ppp;

        //physical changes result output texts
        if (physicalAfterOpposite >= 0 && physicalAfterOpposite - physicalAfterSelf >= 0) {
            if (p < 0.5) {
                System.out.println("Physical needs slightly enhanced (Adam unintentionally invokes Eve's physical needs, now Eve indulges herself sometimes.)" );
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Physical needs remarkable enhanced (Adam brings obvious changes to Eve's physical needs, now Eve becomes more lustful and gluttonous.) ");
            } else if (p >= 1) {
                System.out.println("Physical needs tremendously enhanced (Adam brings tremendous changes to Eve's physical needs, now Eve can always feel her animal desire and have unstoppable impulsive to fulfill them.) ");
            }
        } else if (physicalAfterOpposite >= 0 && physicalAfterOpposite - physicalAfterSelf < 0) {
            if (p < 0.5) {
                System.out.println("Physical needs slightly weakened (Adam does no efforts on Eves' good appetite on both food and men.) ");
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Physical needs remarkable weakened (Although Adam shows no his interest on body pressure, which does not stop Eve indulging herself sometimes.) ");
            } else if (p >= 1) {
                System.out.println("Physical needs tremendously weakened (Adam tries so hard to turn Eve into a more spiritual lifestyle, but Eve still cannot get herself out of the sensual pressure.) ");
            }
        } else if (physicalAfterOpposite < 0 && physicalAfterOpposite - physicalAfterSelf <= 0) {
            if (p < 0.5) {
                System.out.println("Physical needs slightly weakened (Adam brought slightly changes to Eve's daily life, now Eve cares less about material life.) ");
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Physical needs remarkable weakened (Adam brought obvious changes to Eve's physical needs, now Eve starts to feel tedious about chasing fancy foods, handsome men etc.) ");
            } else if (p >= 1) {
                System.out.println("Physical needs tremendously weakened (Adam brought tremendous changes to Eve's physical needs, now Eve seems like stoic and show completely no interest in secular life.) ");
            }
        } else {
            if (p < 0.5) {
                System.out.println("Physical needs slightly enhanced (Adam enjoys more food and lust than Eve, who seems a little bit tedious when turning into these stuffs.) ");
            } else if (p >= 0.5 && p < 1) {
                System.out.println("Physical needs remarkable enhanced (Although Adam does obvious changes to Eve's physical needs, Eve still feel a little bit tedious about chasing fancy foods, handsome men etc.) ");
            } else if (p >= 1) {
                System.out.println("Physical needs tremendously enhanced (Adam tries so hard to seduce Eve, now Eve seems not disturbed by such sensual pressure.) ");
            }
        }

        //safety changes result output texts
        int saa = Math.abs(safetyAfterOpposite - safetyAfterSelf);
        int saaa = Math.abs(safetyAfterSelf);
        double sa = saa * 1.0/saaa;

        if (safetyAfterOpposite >= 0 && safetyAfterOpposite - safetyAfterSelf >= 0) {
            if (sa < 0.5) {
                System.out.println("Sense of safety slightly enhanced (Sometimes Adam can calms Eve down, makes her feel a little bit warm in this cold cruel world.) ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Sense of safety remarkable enhanced (Adam's tenderness makes Eve constantly reminds of her mother.) ");
            } else if (sa >= 1) {
                System.out.println("Sense of safety tremendously enhanced (Adam's like a sun to Eve, bringing endless warmth.)");
            }
        } else if (safetyAfterOpposite >= 0 && safetyAfterOpposite - safetyAfterSelf < 0) {
            if (sa < 0.5) {
                System.out.println("Sense of safety slightly weakened (Adam is not so predictable which makes Eve worrying about sometimes.) ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Sense of safety remarkable weakened (Adam always makes life more insecure, even tough girl like Eve cannot stop worrying them.)");
            } else if (sa >= 1) {
                System.out.println("Sense of safety tremendously weakened (Eve feels much secure about life without Adam, he is way to worrisome.) ");
            }
        } else if (safetyAfterOpposite < 0 && safetyAfterOpposite - safetyAfterSelf <= 0) {
            if (sa < 0.5) {
                System.out.println("Sense of safety slightly weakened (Eve feel stressed when being with Adam, who drags her into the sea of insecure.) ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Sense of safety remarkable weakened (Eve feel the hostility of surrounding in daily life, especially when Adam breaks in.) ");
            } else if (sa >= 1) {
                System.out.println("Sense of safety tremendously weakened (Eve can hardly breath when stay together with Adam, she acts like a paranoid.) ");
            }
        } else {
            if (sa < 0.5) {
                System.out.println("Sense of safety slightly enhanced (Adam sometimes can release the Eve's stress that the environment give her.) ");
            } else if (sa >= 0.5 && sa < 1) {
                System.out.println("Sense of safety remarkable enhanced (Adam tries many times to tell Eve that nobody will hurt her. Eve still cannot make herself relieved.) ");
            } else if (sa >= 1) {
                System.out.println("Sense of safety tremendously enhanced (Adam does his best to get Eve out of the vortex of insecure. It works somehow though, but still has long way to go.) ");
            }
        }

        //social changes result output texts
        int soo = Math.abs(socialAfterOpposite - socialAfterSelf);
        int sooo = Math.abs(socialAfterSelf);
        double so = soo * 1.0/sooo;

        if (socialAfterOpposite >= 0 && socialAfterOpposite - socialAfterSelf >= 0) {
            if (so < 0.5) {
                System.out.println("Social satisfaction slightly enhanced (Adam sometimes takes Eve out for a party, and Eve seems enjoying it.) ");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Social satisfaction remarkable enhanced (Adam does not hesitate to introduce Eve to all his friends that makes Eve happy indeed.) ");
            } else if (so >= 1) {
                System.out.println("Social satisfaction tremendously enhanced (Social butterfly Adam meets his new partner Eve recently, with his constantly efforts of invoking Eve's desire of social.)");
            }
        } else if (socialAfterOpposite >= 0 && socialAfterOpposite - socialAfterSelf < 0) {
            if (so < 0.5) {
                System.out.println("Social satisfaction slightly weakened (Eve hangs out quite a lot but would never calls Adam.) ");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Social satisfaction remarkable weakened (Playful Eve never can understand the aloofness of Adam, but she is influenced obviously. Now she accepts a quite weekend at home sometimes.) ");
            } else if (so >= 1) {
                System.out.println("Social satisfaction tremendously weakened (Eve want to have a break and meet some new friends while Adam always try to sabotage the relationships between her friends and her.) ");
            }
        } else if (socialAfterOpposite < 0 && socialAfterOpposite - socialAfterSelf <= 0) {
            if (so < 0.5) {
                System.out.println("Social satisfaction slightly weakened (Eve do not want meet new people. Luckily, she meets the same quiet Adam.) ");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Social satisfaction remarkable weakened (Adam constraint Eve so much, whatever, Eve now do not need social life like she used to be.) ");
            } else if (so >= 1) {
                System.out.println("Social satisfaction tremendously weakened (Eve feels meeting Adam is like walking in a silent cave: Maybe soliloquize at first, then completely mute at last because of the lack of response.) ");
            }
        } else {
            if (so < 0.5) {
                System.out.println("Social satisfaction slightly enhanced (Adam likes to inspire the speechless Eve to talks, but barely works.)");
            } else if (so >= 0.5 && so < 1) {
                System.out.println("Social satisfaction remarkable enhanced (Eve always feel herself in a noisy flea market when being with Adam, which makes her hard to bear.) ");
            } else if (so >= 1) {
                System.out.println("Social satisfaction tremendously enhanced (Adam makes Eve feel that she is done with social life, Adam fulfills all her social needs and makes she never want to talk to anyone else.)");
            }
        }

        //respect changes result output texts
        int ree = Math.abs(respectAfterOpposite - respectAfterSelf);
        int reee = Math.abs(respectAfterSelf);
        double re = ree * 1.0/reee;

        if (respectAfterOpposite >= 0 && respectAfterOpposite - respectAfterSelf >= 0) {
            if (re < 0.5) {
                System.out.println("Sense of being respected slightly enhanced (Eve is happy with Adam's good manner.) ");
            } else if (re >= 0.5 && re < 1) {
                System.out.println("Sense of being respected remarkable enhanced (Everyone likes to mention Eve as a good guy in the neighborhood, especially Adam.) ");
            } else if (re >= 1) {
                System.out.println("Sense of being respected tremendously enhanced (Eve is renowned all over the city and Adam is the first fan.) ");
            }
        } else if (respectAfterOpposite >= 0 && respectAfterOpposite - respectAfterSelf < 0) {
            if (re < 0.5) {
                System.out.println("Sense of being respected slightly weakened (Eve not quite like Adam's provocative winks, which is his signature move.) ");
            } else if (re >= 0.5 && re < 1) {
                System.out.println("Sense of being respected remarkable weakened (Despite of her rude friend Adam, Eve is good, says everyone in town.) ");
            } else if (re >= 1) {
                System.out.println("Sense of being respected tremendously weakened (Eve have more than a dozen of times to pour her angry on Adam's disrespectful behaviors, but she holds back.) ");
            }
        } else if (respectAfterOpposite < 0 && respectAfterOpposite - respectAfterSelf <= 0) {
            if (re < 0.5) {
                System.out.println("Sense of being respected slightly weakened (Eve feels embarrassed after receiving several negative comments by Adam.) ");
            } else if (re >= 0.5 && re < 1) {
                System.out.println("Sense of being respected remarkable weakened (Eve feels severe humiliated by Adam's constant mock.) ");
            } else if (re >= 1) {
                System.out.println("Sense of being respected tremendously weakened (Eve now has a desperate attitude towards life due to Adam's daily humiliation.) ");
            }
        } else {
            if (re < 0.5) {
                System.out.println("Sense of being respected slightly enhanced (Adam's lovely smile sometimes seems heart-touching to Eve, who is the bad girl in others' eyes.) ");
            } else if (re >= 0.5 && re < 1) {
                System.out.println("Sense of being respected remarkable enhanced (Adam shows huge respect to the disrespectful Eve.) ");
            } else if (re >= 1) {
                System.out.println("Sense of being respected tremendously enhanced (No one really gets to know Eve, the bad girl who is discard by the world. The only believer is Adam.) ");
            }
        }

        //self achievement changes result output texts
        int s2 = Math.abs(selfAchievementAfterOpposite - selfAchievementAfterSelf);
        int s3 = Math.abs(selfAchievementAfterSelf);
        double s1 = s2 * 1.0/s3;

        if (selfAchievementAfterOpposite >= 0 && selfAchievementAfterOpposite - selfAchievementAfterSelf >= 0) {
            if (s1 < 0.5) {
                System.out.println("Self-fulfillment slightly enhanced (The tips from Adam is helpful on Eve's career.) ");
            } else if (s1 >= 0.5 && s1 < 1) {
                System.out.println("Self-fulfillment remarkable enhanced (Eve has a high-flying career with the help of Adam.) ");
            } else if (s1 >= 1) {
                System.out.println("Self-fulfillment tremendously enhanced (The Rome Eve has just built will collapse in a second without Adam.) ");
            }
        } else if (selfAchievementAfterOpposite >= 0 && selfAchievementAfterOpposite - selfAchievementAfterSelf < 0) {
            if (s1 < 0.5) {
                System.out.println("Self-fulfillment slightly weakened (Adam likes to call Eve out for fun when she's busy on work.) ");
            } else if (s1 >= 0.5 && s1 < 1) {
                System.out.println("Self-fulfillment remarkable weakened (Eve always feels her hard work worth nothing after Adam's contempt.) ");
            } else if (s1 >= 1) {
                System.out.println("Self-fulfillment tremendously weakened (Adam does extremely bad effects on Eves' career, luckily he does not directly destroy it.) ");
            }
        } else if (selfAchievementAfterOpposite < 0 && selfAchievementAfterOpposite - selfAchievementAfterSelf <= 0) {
            if (s1 < 0.5) {
                System.out.println("Self-fulfillment slightly weakened (Eve cannot resist the temptation that Adam brings in when at work.) ");
            } else if (s1 >= 0.5 && s1 < 1) {
                System.out.println("Self-fulfillment remarkable weakened (Eve cannot stop the thoughts of having fun with Adam when at work.) ");
            } else if (s1 >= 1) {
                System.out.println("Self-fulfillment tremendously weakened (Eve just do not want to work and only thing she want to dedicate with is Adam.) ");
            }
        } else {
            if (s1 < 0.5) {
                System.out.println("Self-fulfillment slightly enhanced (Adam reminds of Eve that she has work to do, but Eve just do not care.) ");
            } else if (s1 >= 0.5 && s1 < 1) {
                System.out.println("Self-fulfillment remarkable enhanced (Adam helps a lot on Eves' work when Eve indulge herself too much.) ");
            } else if (s1 >= 1) {
                System.out.println("Self-fulfillment tremendously enhanced (Even though Adam does his best to help, Eve just do not care to prove herself as a qualified adults and will not to bear any responsibility.)");
            }
        }

        //over achievement changes result output texts
        int oaa = Math.abs(overAchievementAfterOpposite - overAchievementAfterSelf);
        int oaaa = Math.abs(overAchievementAfterSelf);
        double oa = oaa * 1.0/oaaa;

        if (overAchievementAfterOpposite >= 0 && overAchievementAfterOpposite - overAchievementAfterSelf >= 0) {
            if (oa < 0.5) {
                System.out.println("Intrinsic value slightly enhanced (Adam give some advices to Eve to help her find her inherent peace.) ");
            } else if (oa >= 0.5 && oa < 1) {
                System.out.println("Intrinsic value remarkable enhanced (Adam tutors Eve on how to find her calling.) ");
            } else if (oa >= 1) {
                System.out.println("Intrinsic value tremendously enhanced (Adam invokes Eve as his guru.) ");
            }
        } else if (overAchievementAfterOpposite >= 0 && overAchievementAfterOpposite - overAchievementAfterSelf < 0) {
            if (oa < 0.5) {
                System.out.println("Intrinsic value slightly weakened (Eve likes to think more about the meaning of life while Adam does not care at all.) ");
            } else if (oa >= 0.5 && oa < 1) {
                System.out.println("Intrinsic value remarkable weakened (Eve is more like to devote herself into something she really interested in while Adam has strong interested in gain social identity.) ");
            } else if (oa >= 1) {
                System.out.println("Intrinsic value tremendously weakened (Adam thinks that only psycho like Eve will spend so much time on those useless thing. However, Eve thinks that she is doing something for the human being, not for herself only.)  ");
            }
        } else if (overAchievementAfterOpposite < 0 && overAchievementAfterOpposite - overAchievementAfterSelf <= 0) {
            if (oa < 0.5) {
                System.out.println("Intrinsic value slightly weakened (Eve pay less attention to her soul than social identity, so does Adam.) ");
            } else if (oa >= 0.5 && oa < 1) {
                System.out.println("Intrinsic value remarkable weakened (Adam and Eve have consensus on the correctness of utilitarianism.) ");
            } else if (oa >= 1) {
                System.out.println("Intrinsic value tremendously weakened (Adam persuade Eve to abandon the final piece of thought about her calling. Now Eve's life meaning has become completely utilitarianism.) ");
            }
        } else {
            if (oa < 0.5) {
                System.out.println("Intrinsic value slightly enhanced (Eve dislike Adam's cliches about the well being of human, she just want to enjoy her life, now!) ");
            } else if (oa >= 0.5 && oa < 1) {
                System.out.println("Intrinsic value remarkable enhanced (Adam leaves some unapparent marks on Eve about awaking, but all be washed away by Eve's ambition on self-fulfillment.) ");
            } else if (oa >= 1) {
                System.out.println("Intrinsic value tremendously enhanced (Eve go through the whole process of self-awakening lead by Adam, but she still think the secular fulfillment is the most important thing in life.)");
            }
        }

        //feeling changes result output texts
        int ff = Math.abs(feelingAfterOpposite - feelingAfterSelf);
        int fff = Math.abs(feelingAfterSelf);
        double f = ff * 1.0/fff;

        if (feelingAfterOpposite >= 0 && feelingAfterOpposite - feelingAfterSelf >= 0) {
            if (f < 0.5) {
                System.out.println("Affection slightly enhanced (Eve feels the eyes of Eve on herself, and she knows it's special.) ");
            } else if (f >= 0.5 && f < 1) {
                System.out.println("Affection remarkable enhanced (Adam likes Eve a lot. He starts to miss her when she is not around.) ");
            } else if (f >= 1) {
                System.out.println("Affection tremendously enhanced (They are definitely in the vortex of love.) ");
            }
        } else if (feelingAfterOpposite >= 0 && feelingAfterOpposite - feelingAfterSelf < 0) {
            if (f < 0.5) {
                System.out.println("Affection slightly weakened (Eve knows all Adam's get-attraction tricks, but she pretends to be like nothing happens.) ");
            } else if (f >= 0.5 && f < 1) {
                System.out.println("Affection remarkable weakened (Eve is the beloved one in the relationship.) ");
            } else if (f >= 1) {
                System.out.println("Affection tremendously weakened (Now Adam is getting more and more crazy about Eve.) ");
            }
        } else if (feelingAfterOpposite < 0 && feelingAfterOpposite - feelingAfterSelf <= 0) {
            if (f < 0.5) {
                System.out.println("Affection slightly weakened (Eve knows she just an ordinary guy with an ordinary love life, beauties like Adam barely pays attention to her.) ");
            } else if (f >= 0.5 && f < 1) {
                System.out.println("Affection remarkable weakened (Everybody is not fond of our dirty little Eve, not mention of Adam.) ");
            } else if (f >= 1) {
                System.out.println("Affection tremendously weakened (Eve is disgusting in others' eyes. They even give her a nickname called 'roach'.) ");
            }
        } else {
            if (f < 0.5) {
                System.out.println("Affection slightly enhanced (Adam and Eve barely knows each other.) ");
            } else if (f >= 0.5 && f < 1) {
                System.out.println("Affection remarkable enhanced (Don't get these two guys in one room, they will fight, I mean it.) ");
            } else if (f >= 1) {
                System.out.println("Affection tremendously enhanced (They are like bitter rivals after these days accompany.)");
            }
        }

        //affection changes result output texts
        int aa = Math.abs(affectionAfterOpposite - affectionAfterSelf);
        int aaa = Math.abs(affectionAfterSelf);
        double a = aa * 1.0/aaa;

        if (affectionAfterOpposite >= 0 && affectionAfterOpposite - affectionAfterSelf >= 0) {
            if (a < 0.5) {
                System.out.println("Bond between two people slightly enhanced (The connection between these two grows steadily.) ");
            } else if (a >= 0.5 && a < 1) {
                System.out.println("Bond between two people remarkable enhanced (The connection between these two grows fast.) ");
            } else if (a >= 1) {
                System.out.println("Bond between two people tremendously enhanced (They can even bear one day without each other.) ");
            }
        } else if (affectionAfterOpposite >= 0 && affectionAfterOpposite - affectionAfterSelf < 0) {
            if (a < 0.5) {
                System.out.println("Bond between two people slightly weakened (Eve feels that the connection between Adam and her grows gradually, but Adam does not think in that way.) ");
            } else if (a >= 0.5 && a < 1) {
                System.out.println("Bond between two people remarkable weakened (Eve feels that every time she tries to get closer to Adam, Adam pull back a little bit accordingly.) ");
            } else if (a >= 1) {
                System.out.println("Bond between two people tremendously weakened (Eve knows Adam is hard to open his heart to others, but there is a little space for Eve, just a little.) ");
            }
        } else if (affectionAfterOpposite < 0 && affectionAfterOpposite - affectionAfterSelf <= 0) {
            if (a < 0.5) {
                System.out.println("Bond between two people slightly weakened (These two cannot get alone so well, though not so bad.) ");
            } else if (a >= 0.5 && a < 1) {
                System.out.println("Bond between two people remarkable weakened (They just cannot accept each other as true friend.) ");
            } else if (a >= 1) {
                System.out.println("Bond between two people tremendously weakened (Every second they are with each other is killing both of them.) ");
            }
        } else {
            if (a < 0.5) {
                System.out.println("Bond between two people slightly enhanced (Eve responses nothing to Adam's friendship.) ");
            } else if (a >= 0.5 && a < 1) {
                System.out.println("Bond between two people remarkable enhanced (Adam tries so hard to get alone with Eve, but Eve really just do not feel a thing about Adam.) ");
            } else if (a >= 1) {
                System.out.println("Bond between two people tremendously enhanced (Adam likes every minute being with Eve, while Eve intentionally keeps the distance between each other. God, it's a really long long distance.)");
            }
        }
    }
}
