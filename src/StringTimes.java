public class StringTimes {
    public String stringTimes(String str, int n) {
        //given string str, and int n
        //return bigger string
        //bigger string needs to be n copies of original str
        //sometimes i like to highlight and cross outstuff in the instructions(take screenshot and edit/cross off)
        String newString = ""; //originally didn't initialize with a value, added one b/c google told me I needed to, wondering why don't always need to initiate with a value
        for (int i = 0; i < n; i++) { //
            newString = newString + str; //lol forgot to add plus for a second before hitting "Go" and it gave me an "; expected"
        }
        return newString; //returns bigggg string repeated

    }
}
