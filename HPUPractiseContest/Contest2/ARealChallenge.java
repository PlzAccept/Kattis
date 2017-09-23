import java.util.*;

// The answer is four times the square root of the number.
// Note that we need to use long because of the input size.

class ARealChallenge {
    public static void main(String[] args) {
        System.out.println(4 * Math.sqrt(new Scanner(System.in).nextLong()));
    }
}