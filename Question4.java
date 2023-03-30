import java.util.*;
public class Question4 {
	Scanner sc = new Scanner(System.in);
void input()
{
	int n = sc.nextInt();
	int d = (n-1)/2;
	int f = (n-1) - (n-1)/2;
	int c = 0;
	int e = n-1;
	int g = n-1;
	f = f + 1;
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if((j <= c && i<(n-1)/2) || i==(n-1)/2 || i==n/2 || (j == (e) && i<(n-1)/2) || 
					j == (n-1) && i<(n-1)/2 || j>=(g) && i
					<(n)/2  )
			{
				System.out.print("*");
			}
			else
				
			{
				System.out.print(" ");
			}
			
		}
		c++;
		e--;
		g--;
		
		System.out.println();
	}
}
	public static void main(String[] args) {
		Question4 q = new Question4();
		q.input();

	}

}