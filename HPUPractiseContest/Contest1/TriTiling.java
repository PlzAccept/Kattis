import java.util.*;

//First thing you have to notice that is if n is a odd number, the answer is simply 0.
//There is no way you can make a 3 by odd number rectangle by 1 x 2 bricks.

//The next observation is there are 3 ways to make a 3 x 2 rectangle,
//and there are 2 ways to make a 3 x 4, 3 x 6, 3 x 8, 3 x 10, etc.
//Note that the 2 ways are the ways that cannot decompose to a smaller rectangle.

// example of 1 way to build a 3 x 4 rectangle, the other one is just upsidedown.
// _________
// |___|___|
// | |___| |
// |_|___|_|

class TriTiling {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(;;) {
			int n = in.nextInt();
			if(n == -1) break;

			if(n % 2 == 1) System.out.println("0");  //If n is an odd number
			else System.out.println(possTile(n, 0)); //If n is an even number
		}
	}

	//n - the target rectangle width we want to achieve
	//currentT - the current width of the rectangle we've made
	public static int possTile(int n, int currentT) {
		//base case, if we meet the target width, return 1
		if(n == currentT) return 1;

		//The number of ways if we attach a 3 x 2 rectangle to the current one
		int sum = 3 * possTile(n, currentT + 2);

		//adding the number of ways if we attach a 3 x 4, 3 x 6, .... 
		//until the total width equals the target width
		for(currentT += 4; currentT <= n;currentT += 2) 
			sum += 2 * possTile(n, currentT);

		//return the total ways.
		return sum;
	}
}
