import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0){
            System.err.println("a is even");
        }else{
            System.err.println("a is odd");
        }

    }    
}
