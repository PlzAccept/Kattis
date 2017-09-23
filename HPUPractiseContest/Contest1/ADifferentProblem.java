import java.util.*;

//Since the inputs are numbers that from 0 to 10^15,
//we need to use long instead of int to store the number.
//This is the only tricky part.

class ADifferentProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //read until EOF
        while(in.hasNext()) {

            //read two long  
            long a = in.nextLong(); 
            long b = in.nextLong();

            //take the absolute different
            long diff = (long)Math.abs(a - b);

            //print the number out
            System.out.println(diff);
        }
    }
}