import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER Alphabet");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        for(char i = 'A'; i<= ch; i++){
            for(char j = 'A'; j<=i; j++){
                System.out.print(j);

            }
            System.out.println();
        }

    }
    
}
