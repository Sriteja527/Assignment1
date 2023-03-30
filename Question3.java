import java.util.*;
public class Question3{
Scanner sc = new Scanner(System.in);
void input()
{
int n = sc.nextInt();
	int d = (n-1)/2;
	int e = (n-2) - d; // 14 - 6 = 8
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(i==0 || (j <= d && d >= 0) || (j>=e) || (j==0 && i<=(n-1)) || (j==(n) && i<=(n-1))
					|| i==(n-1))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		d--;
		e++;
		System.out.println();
	}
}
public static void main(String[] args) {
Question3 q = new Question3();
q.input();
	}

}
