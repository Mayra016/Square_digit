import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println(squareDigits(512));
    }

    public static int squareDigits(int n) {
        String result = "";
        int finalResult = 0;
        int length = String.valueOf(n).length();
        byte i = 0;
        while(i < length){
            int digit = String.valueOf(n).charAt(i) - '0';
            int square = digit * digit;
            result = result.concat(String.valueOf(square));
            i++;
        }
        finalResult = Integer.parseInt(result);
        return finalResult;
         
  }
}
