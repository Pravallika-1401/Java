import java.util.Scanner;
public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=90 && a<100){
            System.out.println("A");
        }else if(a>=60 && a<90){
            System.out.println("B");
        }else if (a>=45 && a<60){
            System.out.println("C");
        }else{
            System.out.print("F");
        }
    }    
}
