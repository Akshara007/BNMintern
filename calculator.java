import java.util.*;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2,res=0;
		int ch;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter choice\n1.Addition\n2.Subtraction\n3.multiplication\n4.division\n5.exit");
		ch=sc.nextInt();
		if(ch!=5)
		{
		System.out.println("Enter the n1:");
		
		
		n1=sc.nextInt();
		System.out.println("Enter the n2:");
		n2=sc.nextInt();
		switch(ch)
		{
		case 1: res=n1+n2;
		break;
		case 2:res=n1-n2;
		break;
		case 3: res=n1*n2;
		break;
		case 4:if(n2==0)
			System.out.println("Cannot divide by 0");
		else
			res=n1/n2;
		break;
		default: System.out.println("Wrong choice");
		}
		System.out.println("The result is "+res);
		}
		}while(ch!=5);
	}

}
