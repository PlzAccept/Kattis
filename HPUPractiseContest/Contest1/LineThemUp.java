import java.util.*;

//Our task is to determine if the string list is in increasing order or decreasing order.
//One way is to sort the list and see if the new list is the same as the old one. 
//My idea is having a variable that start at 0, then compare each two consecutive string, 
//add 1 to the variable if the latter string is greater, add -1 if the the former string is greater.
//If you get N-1 after comparing all consecutive string, then the list is in increasing order.
//If get -(N-1), then decreasing. If neither, then its neither in increasing or decreasing order.  

class LineThemUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //read the strings into an array
        String[] names = new String[n];
        for(int i = 0; i < n; i++)
            names[i] = in.next();
        

        int s = 0;
        for(int i = 1; i < n; i++) {
            // add  1 if name[i] is larger than name[i - 1]
            // add -1 if name[i] is smaller than name[i - 1]
            s += names[i].compareTo(names[i - 1]) > 0 ? 1 : -1; 
        }
        
        if(s == n - 1) System.out.println("INCREASING");
        else if(s == 1 - n) System.out.println("DECREASING");
        else System.out.println("NEITHER");
    }
}