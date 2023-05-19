public class FirstLast6Arrays {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length-1] == 6 ){ //I realized that it only had to be the last or first index of the array that had to equal 6
            return true;
        }
        else {
            return false; //returns false if neither the last index or first index are a 6
        }
    }

    //1.  first attempt just to get the ||'s out of my head b/c I knew it wouldn't work but wanted to put it down anyway
//    public boolean firstLast6(int[] nums) {
//        if (nums[0] == 6 || nums[1] == 6 || nums[2] == 6){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
    //2.  SECOND ATTEMPT- couldn't visualize anything I looked at the hint, (not the solution, just the hint)
//    public boolean firstLast6(int[] nums) {
//        if (nums[nums.length-1] == 6){
//            return true;
//        }
//        else if (nums[nums.length-2] == 6) {
//            return true;
//        }
//        else if (nums[nums.length-3] == 6) {
//            return true;
//        }
//        else if (nums[0] == 6) {
//            return true;
//        }
//        else if (nums[1] == 6) {
//            return true;
//        }
//        else if (nums[2] == 6) {
//            return true;
//        }
//        else{
//            return false;
//        }
//    } //starting to think a for loop would be better.

    ///OH MY - I READ THE INSTRUCTIONS WRONG NO WONDER

}
