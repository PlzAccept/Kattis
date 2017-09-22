import java.util.*;

class CharacterDevelopment {
    public static void main(String[] args) {
        int k = new Scanner(System.in).nextInt();
        System.out.println((int)Math.pow(2, k) - k - 1);
    }
}