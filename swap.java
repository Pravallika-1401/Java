import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        
        temp= a;
        a= b;
        b=temp;
        System.err.println(a);
        System.out.println(b);
    }
}
