import java.util.*;

public class SwitchStatement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int button=sc.nextInt();
            switch(button){
                case 1:
                    System.out.println("burger");
                    break;
                case 2:
                    System.out.println("samosha");
                    break;
                case 3:
                    System.out.println("milk Shake");
                    break;
                case 4:
                    System.out.println("cococola");
                    break;
                case 5:
                    System.out.println("chicken fry");
                    break;
                case 6:
                    System.out.println("sprite");
                    break;
                case 7:
                    System.out.println("coffee");
                    break;
                case 8:
                    System.out.println("Tea");
                    break;
                case 9:
                    System.out.println("orage juice");
                    break;
                default:
                    System.out.println("You are press the wrong key");
            }
        }
    }
}
