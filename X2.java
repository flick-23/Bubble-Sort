import java.io.*;
import java.lang.*;
class X2
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int n,m,i,j,lcm1=1,lcm2=1,flag=1,flag1=0;
		
		System.out.println("\nEnter two Values for their HCF & LCM :");
		m=Integer.parseInt(venki.readLine()); 
		n=Integer.parseInt(venki.readLine());
		
		for(i=1;i<=m;i++)
		{
			lcm1=n*i;
			for(j=1;j<=n;j++)
			{
				lcm2=m*j;
				if(lcm1==lcm2)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		
		System.out.println("\n LCM : "+lcm1);
		
		for(i=2;i<=n;i++)
		{
			if(n%i==0 && m%i==0)
			{
				flag1=1;
			}
			if(flag1==1)
				break;
		}
		if(flag1==1)
		{
			System.out.println("\n HCF : "+i);
		}
		else 
			System.out.println("\n HCF :  1");
	}
}