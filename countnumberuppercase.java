import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class countnumberuppercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
           if (Character.isUpperCase(ch)) {
                count++;
            }
        }
         System.out.println(count);
    }
    }
