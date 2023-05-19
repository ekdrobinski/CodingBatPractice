public class SleepIn {
    //first run through. Sad when it didn't work.  tried an || operand after
//    public boolean sleepIn(boolean weekday, boolean vacation) {
//        if (weekday) { //I was thinking this would need an if statement because sleeping in depends on "if" we can
//            return false; //it's a weekday so no sleeping in
//        }
//        else if (vacation) {
//            return true; //its vacay so yaaaasss sleep innnn
//        }
//        else
//            return true; //we sleep in every day except weekday, so heck yeah.
//    }
    //second attempt lol
//    public boolean sleepIn(boolean weekday, boolean vacation) {
//        if (!vacation || weekday) {  //logic bad lol, I don't sleep in on vacation apparently
//            return true;
//        } else {
//            return false;
//        }
//    }
    //fix the logiiiiiiiccc

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation || !weekday) { // aaaand just needed to switch the not to the other word
            return true;
        } else {
            return false;
        }
    }

}
