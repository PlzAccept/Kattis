import java.util.*;

//Keep adding the time until exceed the given maximum time.
//Every time you add, accumulate the counter by 1.

class Server {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), t = in.nextInt();
        
        int sum = 0, counter = 0;
        for(int i = 0; i < n; i++) {
            sum += in.nextInt();
            if(sum > t) break;
            counter++;
        }

        System.out.println(counter);
    }
    
}