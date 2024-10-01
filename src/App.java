
import java.util.Scanner;


public class App {

    public static double average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;

    }
    
    public static void printOnlyGreaterValue(int[] arr, double value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > value){
                System.out.print(arr[i]+ " ");
            }
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner kw = new Scanner(System.in);
        int num = kw.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = kw.nextInt();
        }
        average(arr);
        printOnlyGreaterValue(arr,  average(arr));
        
    }
}
