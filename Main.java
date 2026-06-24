import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your nuber to create pattern");
        int n = sc.nextInt();
        
        System.out.println("your enter number");
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= n; j++){
                System.out.print("* ");
            }
             System.out.println();
        }
        
    }
}