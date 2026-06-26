import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        for(char i = ch; i>='A'; i--){
            for(char j = 'A'; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }   
}
