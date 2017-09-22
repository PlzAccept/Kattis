import java.util.*;

public class YetSatisfiabilityAgain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = Integer.parseInt(in.nextLine());
        while(k-->0) {
            String[] line = in.nextLine().split(" ");
            int n = Integer.parseInt(line[0]), m = Integer.parseInt(line[1]);
            long[] disjunction = new long[m];
            for(int i = 0; i < m; i++) {
                long dis = 0;
                line = in.nextLine().split(" v ");
                for(int j = 0; j < line.length; j++) {
                    String var = line[j];
                    int v = 0;
                    if(var.charAt(0) == '~') {
                        v = n + Integer.parseInt(var.substring(2, var.length())) - 1;
                    } else {
                        v = Integer.parseInt(var.substring(1, var.length())) - 1;
                    }
                    dis |= (1L << v);
                }
                disjunction[i] = dis;
            }
            
            int max = (int)Math.pow(2, n);
            boolean isSat = false;
            for(long i = 0; i < max; i++) {
                long state = i | (~i << n);
                boolean sat = true;
                for(int j = 0; j < m && sat; j++) {
                    sat = sat && (disjunction[j] & state) > 0;
                }
                if(sat) {
                    isSat = true;
                    break;
                }
            }
            
            System.out.println(isSat ? "satisfiable" : "unsatisfiable");
        }

    }

}