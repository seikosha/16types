public class Human {

    public static int physical;
    public static int safety;
    public static int social;
    public static int respect;
    public static int selfAchievement;
    public static int overAchievement;

    //set the initial values for the indicators
    public static void main(String[] args) {
        setPhysical(0);
        setSafety(-37);
        setSocial(25);
        setRespect(-200);
        setSelfAchievement(-20);
        setOverAchievement(-80);
    }
    //create the "Physical" indicator
    public static void setPhysical(int x) {
        if (Math.abs(x) < 100) {
            physical = x;
        } else if(x > 100) {
            physical = 100;
        } else {
            physical = -100;
        }
    }

    //create the "Safety" indicator
    public static void setSafety(int x) {
        if (Math.abs(x) < 100) {
            safety = x;
        } else if(x > 100) {
            safety = 100;
        } else {
            safety = -100;
        }
    }

    //create the "Social" indicator
    public static void setSocial(int x) {
        if (Math.abs(x) < 100) {
            social = x;
        } else if(x > 100) {
            social = 100;
        } else {
            social = -100;
        }
    }

    //create the "Respect" indicator
    public static void setRespect(int x) {
        if (Math.abs(x) < 100) {
            respect = x;
        } else if(x > 100) {
            respect = 100;
        } else {
            respect = -100;
        }
    }

    //create the "Self-Achievement" indicator
    public static void setSelfAchievement(int x) {
        if (Math.abs(x) < 100) {
            selfAchievement = x;
        } else if(x > 100) {
            selfAchievement = 100;
        } else {
            selfAchievement = -100;
        }
    }

    //create the "Over-Achievement" indicator
    public static void setOverAchievement(int x) {
        if (Math.abs(x) < 100) {
            overAchievement = x;
        } else if(x > 100) {
            overAchievement = 100;
        } else {
            overAchievement = -100;
        }
    }

    //abstract method for counting indicators
    public abstract static class physical {

    }

    public abstract static class safety {

    }

    public abstract static class social {

    }

    public abstract static class respect {

    }

    public abstract static class selfAchievement {

    }

    public abstract static class overAchievement {

    }

}
