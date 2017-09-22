import java.util.Scanner;

//count the number of white space, lowercase letter, uppercase letter, and other characters.
//the answer is the these number over the length of the string.

public class AlphabetSpam {

    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();
        int whitespace = 0, lowercase = 0, uppercase = 0, other = 0;
        for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == '_')
                whitespace++;
            else if(Character.isUpperCase(line.charAt(i)))
                uppercase++;
            else if(Character.isLowerCase(line.charAt(i)))
                lowercase++;
            else
                other++;
        }
        
        System.out.println((double)whitespace / (double)line.length());
        System.out.println((double)lowercase  / (double)line.length());
        System.out.println((double)uppercase  / (double)line.length());
        System.out.println((double)other      / (double)line.length());
    }

}