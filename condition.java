public class condition {
    public static void main(String[] args) {
        int choose = 1;
        // switch (choose) {
        //     case 1:
        //         System.out.println("you choose 1");
        //         break;
        //     case 2:
        //         System.out.println("you choose 2");
        //         break;
        //     case 3:
        //         System.out.println("you choose 3");
        //         break;
        //     case 4:
        //         System.out.println("you choose 4");
        //         break;   
        //     default:
        //         System.out.println("Invalid");
        //         break;
        // }

        //fall_through
        switch (choose) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("you choose even num");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("you choose odd num");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        //Arrow_operator(->)
         
    }
}
