import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area;
        area = 3.14*r*r;
        System.out.print(area);
        sc.close();
    }
}
