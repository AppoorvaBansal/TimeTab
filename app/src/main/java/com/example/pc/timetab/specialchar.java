import java.util.*;
class specialchar
{
	public static void main(String arg[])
	{
	
		char arr[][]=new char[10][10];
		Scanner ob=new Scanner(System.in);
		int n,i=0,j=0,s,l,c,flag=0;
		System.out.println("enter the sizr of Square matrix");
		n=ob.nextInt();
		char ch1,ch2,ch3;
		System.out.println("enter the first character");
		ch1=ob.next().charAt(0);
		System.out.println("enter the second character");
		ch2=ob.next().charAt(0);
		System.out.println("enter the third character");
		ch3=ob.next().charAt(0);
		
		
		for(i=0;i<n;i=i+n-1)
		{
			for(j=1;j<n-1;j++)
			{
				arr[i][j]=ch1;
			
			}
		}
		
		for(i=1;i<n-1;i=i+1)
		{
			for(j=0;j<n;j=j+n-1)
			{
				arr[i][j]=ch2;
			
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					arr[i][j]=ch3;
				}
			}
		}	
		
		
		
		
		
		System.out.println(" the Squar matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(arr[i][j] + " ");
			
			}
			System.out.println();
		}
	}
}	
	
		
		
		
		