import java.util.Scanner;
public class Main {

    
    public static int mul(int a,int n){
        if(n==0){
            return 0;
        }else{
            return a + mul(a,n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(mul(a,n));
        
    }
}