public class Human {

    public static void main(String[] args) {

    }

    public Human() {
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
        return physical;
    }

    //create the "Safety" indicator
    public static int setSafety(int x) {
        return safety;
    }

    //create the "Social" indicator
    public static int setSocial(int x) {
        if (Math.abs(social) < 100) {
            social = x;
            return social;
        } else if(social >= 100) {
            social = 100;
            return social;
        } else {
            social = -100;
            return social;
        }
    }

    //create the "Respect" indicator
    public static int setRespect(int x) {
        if (Math.abs(x) < 100) {
            respect = x;
            return respect;
        } else if(respect > 100) {
            respect = 100;
            return respect;
        } else {
            respect = -100;
            return respect;
        }
    }

    //create the "Self-Achievement" indicator
    public static int setSelfAchievement(int x) {
        if (Math.abs(x) < 100) {
            selfAchievement = x;
            return selfAchievement;
        } else if(selfAchievement > 100) {
            selfAchievement = 100;
            return selfAchievement;
        } else {
            selfAchievement = -100;
            return selfAchievement;
        }
    }

    //create the "Over-Achievement" indicator
    public static int setOverAchievement(int x) {
        if (Math.abs(x) < 100) {
            overAchievement = x;
            return overAchievement;
        } else if(overAchievement > 100) {
            overAchievement = 100;
            return overAchievement;
        } else {
            overAchievement = -100;
            return overAchievement;
        }
    }

    //create the "Feeling" indicator
    public static int setFeeling(int x) {
        if (Math.abs(x) < 100) {
            feeling = x;
            return feeling;
        } else if(feeling > 100) {
            feeling = 100;
            return feeling;
        } else {
            feeling = -100;
            return feeling;
        }
    }

    //create the "Affection" indicator
    public static int setAffection(int x) {
        affection = x;
        return affection;
    }

//    //abstract method for counting indicators
//    public abstract static class physical {
//
//    }
//
//    public abstract static class safety {
//
//    }
//
//    public abstract static class social {
//
//    }
//
//    public abstract static class respect {
//
//    }
//
//    public abstract static class selfAchievement {
//
//    }
//
//    public abstract static class overAchievement {
//
//    }
//
//    public abstract static class feeling {
//
//    }
//
//    public abstract static class affection {
//
//    }
}
