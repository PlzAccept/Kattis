import java.util.*;
import java.io.*;

//Need BufferedReader for java.

//For this problem, we need to use a data structure called HashSet.
//The reason is that HashSet can determine whether a given number/string is in constant time.
//Which makes the program run faster than search the number by going through all the numbers.

public class CD {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        for(;;) { //short cut for while(true)

            String[] line = in.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);

            //if n == 0 and m == 0
            if(n + m == 0) break;

            //Put all the CD id that Jack owned into a hash set.
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < n; i++)
                set.add(Integer.parseInt(in.readLine()));
            
            //for every CD that Jill owned, if it exist in the hash set, add one to the counter
            int count = 0;
            for(int i = 0; i < m; i++)
                if(set.contains(Integer.parseInt(in.readLine()))) count++;

            System.out.println(count);
        }
    }

}