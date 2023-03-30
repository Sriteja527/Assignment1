import java.util.*;
public class Question5 {
	Scanner sc = new Scanner(System.in);
void input()
{
	int n = sc.nextInt(); // number of rows
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question5 q = new Question5();
		q.input();

	}

}
