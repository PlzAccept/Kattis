import java.util.*;

// To solve this problem, 
// we need to notice that we should always plant the tree that has the longest growing time first

// So, we first sort the trees by growing time.
// Then, the answer is the maximum of the growing time plus the day we plant the tree

class PlantingTrees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] trees = new int[n];
        for(int i = 0; i < n; i++)
            trees[i] = in.nextInt();

        //sort the trees. (This method sort by increasing order)
        Arrays.sort(trees);

        //j is the current day
        int j = 1;
        int max = 0;

        //Since the sorted array is increasing order, we need to go through it backward
        for(int i = n - 1; i >= 0; i--) {

            //the day it actually fully grown is current day + the growing time
            int day = trees[i] + j;

            //find the maximum number
            max = Math.max(max, day);

            //go to the next day
            j++;
        }
        
        System.out.println(max + 1);
    }
}