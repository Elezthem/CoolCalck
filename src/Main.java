import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c = 20, d = 15;
        a = c++;
        b = ++d;
        
        System.out.println("a =  "+a+" , b = "+b+", c = "+c+", d = "+d);
    }
}