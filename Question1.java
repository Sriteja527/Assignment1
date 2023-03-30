import java.util.*;
public class Question1
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
void i()
{
	System.out.println("The letter is I:");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==0||i==(n-1)||j==(n-1)/2)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
	}
		System.out.println(" ");
	}
}
void n()
{
	System.out.println("The letter is N:");
	int count = 0;  
    for(int i = 0; i < n; i++) {  
        System.out.printf("*");  
        for(int j = 0; j <= n; j++) {  
            if(j == n) {  
                System.out.printf("*");  
            }else if(j == count){  
                System.out.printf("*");  
            }else {  
                System.out.printf(" ");  
            }  
        }  
        count = count + 1;  
        System.out.printf("\n");  
    }  

}
void e()
{
	System.out.println("The Character is E:");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==0||j==0||i==(n-1)/2||i==(n-1))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
void u()
{
	System.out.println("The letter is U:");
	for(int i = 0; i < n; i++) {  
        if(i != 0 && i != n - 1) {  
            System.out.printf("*");  
        }else {  
            System.out.printf(" ");  
        }  
        for(int j = 0; j < n; j++) {  
            if(((i == n - 1) && j >= 0 && j < n - 1)) {  
                System.out.printf("*");  
            }else if(j == n - 1 && i != 0 && i != n - 1){  
                System.out.printf("*");  
            }else {  
                System.out.printf(" ");  
            }  
        }  
        System.out.printf("\n");  
    }  
}
void r()
{
	System.out.println("The letter is R:");
	 int mid = n / 2;  
     
     for(int i = 0; i < n; i++) {  
         System.out.print("*");  
         for(int j = 0; j < n; j++) {  
             if((i == 0 || i == mid) && j < (n - 2)) {  
                 System.out.print("*");  
             }else if(j == (n - 2) && !(i == 0 || i == mid)){  
                 System.out.print("*");  
             }else {  
                 System.out.print(" ");  
             }  
         }  
         System.out.print("\n");  
     }  
}
void o()
{
	System.out.println("The letter is o:");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==0||j==0||i==(n-1)||j==(n-1))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
void n1()
{
	System.out.println("The letter is N:");
	int count = 0;  
    for(int i = 0; i < n; i++) {  
        System.out.printf("*");  
        for(int j = 0; j <= n; j++) {  
            if(j == n) {  
                System.out.printf("*");  
            }else if(j == count){  
                System.out.printf("*");  
            }else {  
                System.out.printf(" ");  
            }  
        }  
        count = count + 1;  
        System.out.printf("\n");  
    }  

}

public static void main(String[] args)
{
Question1 a = new Question1();
a.i();
a.n();
a.e();
a.u();
a.r();
a.o();
a.n1();
}
}