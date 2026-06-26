import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CHARACTER");
        char ch = sc.next().charAt(0);
        for(char i = 'A'; i<=ch; i++){
            for(char j = 'A'; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        
    }  
}
