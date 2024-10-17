import java.util.Scanner;

public class Sum{
    public static void main(String args[]){
        System.out.println("enter two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("the sum of two numbers ="+(a+b)+"from git");

        sc.close();
    }
}
