//I heard fizzbuzz is popular so I wanted to try something simple but related to be one with the culture
public class CigarParty {
    public static void main(String[] args) {
        public boolean cigarParty(int cigars, boolean isWeekend) {
            //success=num of cigars entre 40 and 60 inclusive
            //if wknd, no upper bound of cigars
            //return true if values are successful, false else

            //first check if it's weekend
            if (isWeekend && cigars >=40) { //if it's the weekend and there's enough cigars it's all good
                return true;
            }
            else if (cigars >= 40 && cigars <= 60) { //if it's not weekend and there's the right amount of cigars
                return true;
            }
            else { //if it's not weekend and not the right amount of cigars
                return false;
            }
        }

    }
}