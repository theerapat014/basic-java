import java.util.Scanner;
public class ExamChecker {
    public static void chek(int n,Scanner kw){
        int []answerkey ={1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
        int []scores = new int[n];
        for (int i = 0; i < n; i++) {
            int score = 0;  
            for (int j = 0; j < 10; j++) {
                int answer = kw.nextInt();
                if (answer == answerkey[j]) {
                    score++;  
                }
                
            }
            scores[i] = score;  
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println(scores[i]);
        }

    }
    public static void main(String[] args) {
        Scanner kw = new Scanner(System.in);
        int n = kw.nextInt();
        chek(n,kw);

        
    }
}
