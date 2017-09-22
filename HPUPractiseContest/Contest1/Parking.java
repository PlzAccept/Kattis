import java.util.*;

// Since you have to visit the left most store and the right most sotre no matter where you park,
// the solution is just the total distance from the left most store to the right most store and times two.
// Times two is because you have to get back to the car.

class Parking {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		while(cases-->0) {
		    int n = in.nextInt();
		    int max = 0, min = 100;

		    //find out the location of left most store and the right most store
		    while(n-->0) {
		    	int x = in.nextInt();
		    	max = Integer.max(x, max);
		    	min = Integer.min(x, min);
		    }

		    //take the difference and multiply two
		    System.out.println((max - min) * 2);
		}
    }
}