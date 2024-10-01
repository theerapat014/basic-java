import java.util.Scanner;

public class hw_4 {

    public static void mul(String[][] arr, int row, int col) {
        int count = 0;
        for (int i = 0; i < row; i++) {  // วนลูปแถวก่อน
            for (int j = 0; j < col; j++) {  // วนลูปคอลัมน์ในลูปแถว
                if (arr[i][j].equals("$")) {
                    count++;
                } 
                   
                
            }
        }
        if(count > (row*col)/2) {
            for(int i=0; i<row; i++) {
                for(int j=0; j<col; j++) {
                    if(i %2 ==0||j %2 !=0){
                        System.out.print("x ");
                    }else{
                        System.out.print(arr[i][j]+ " ");
                    }
                }
                System.out.println();
            }
        }else{
            for(int i=0; i<row; i++) {
                
                for(int j=0; j<col; j++) {
                    if(j==0 || j == col-1||i==0 ||i==row-1) {
                        System.out.print("+ ");
                    }else{
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // อ่านจำนวนแถวและจำนวนคอลัมน์จากผู้ใช้
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        // สร้างอาร์เรย์โดยใช้ขนาดที่ถูกต้อง
        String[][] arr = new String[row][col];

        // รับข้อมูลจากผู้ใช้เพื่อเติมลงในอาร์เรย์
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.next();
            }
        }

        
        mul(arr, row, col);
    }
}
