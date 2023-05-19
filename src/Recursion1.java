public class Recursion1 {
    //first I had to look up what recursion was again as a reminder on google
    //then I had to look up "base case" in java to remind myself of the vocab
    //base case is the condition to stop the recursion
    //this took a couple of attempts
    public int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) { //this is what a base case is
            return 1;
        }
        return n * factorial(n - 1); //the recursive part. the (n-1 is the next in the sequence, like going down,
        // and then it calls itself only to be broken by the base case above.
    }
}
