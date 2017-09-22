import java.util.*;

// The answer is XOR of all the numbers.

// XOR in java is ^
// There are few things you need to know:
// any number XOR it self is 0. e.g. 345 ^ 345 = 0
// any number XOR 0 is the number itself. e.g. 345 ^ 0 = 345
// a ^ b is the same as b ^ a

// Knowing these, if the numbers are 3, 4, 5, 4, 3
// all we need to do is 3 ^ 4 ^ 5 ^ 4 ^ 3, and because 3 ^ 3 = 0, 4 ^ 4 = 0, we left with 0 ^ 0 ^ 5 = 5


class OddManOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int caseN = 1; caseN <= n; caseN++) {
            int g = in.nextInt();

            int single = 0;
            while(g-->0) //run the loop for g times
                single ^= in.nextInt();

            System.out.printf("Case #%d: %d\n", caseN, single);
        }
    }
}