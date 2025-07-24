public class nestedif {
    public static void main(String[] args) {
        int a = 9;
        if (a%2==0){
            if (a>0){
                System.out.println("Even_positive");
            }else{
                System.out.println("Even_negative");
            }
        }else{
            System.out.println("Odd_num");
        }
    }
}
