import java.util.*;

//The solution is the sum of all the number divide by 2.
//Reason is, if we have X1, X2, X3, X4 ...... Xn
//let S equals to the sum of all these numbers.
//Since the problem says there is a solution for every case, there exist a Xi = X1 + X2 + X3 + ... Xn (without Xi)
//Therefore 2*Xi = S  =>  Xi = S / 2

class SumOfTheOthers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String[] line = in.nextLine().split(" ");
			int sum = 0;
			for(int i = 0; i < line.length; i++)
				sum += Integer.parseInt(line[i]);

			System.out.println(sum / 2);
		}
	}
}