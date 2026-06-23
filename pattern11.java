import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = i%2;
            for(int j = 1; j<=i; j++){
                System.out.print(num);
                num = 1 - num;

            }
            System.out.println();
            
        }
    }
    
}
