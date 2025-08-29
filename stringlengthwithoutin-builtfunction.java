import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringlengthwithoutin-builtfunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
