package ramanujam;

public class OperatorsDemo {
	public static void main(String[] args) {
		int num1=20;
		int num2=3;
		
		int add=num1+num2;
		System.out.println("Addition...:"+add);
		
		int sub=num1-num2;
		System.out.println("Subtraction...:"+sub);
		
		int mul=num1*num2;
		System.out.println("Multiplication...:"+mul);
		
		int div=num1/num2;
		System.out.println("Division...:"+div);
		
		int mod=num1%num2;
		System.out.println("Mod-Reminder..:"+mod);
		
		int n=10;
		System.out.println(n++);//print the value and then increments - so it will print 10		
		System.out.println(n);//this will print 11
		
		n=10;
		System.out.println(++n);//increment the value first and then prints..- so it will print 11
		System.out.println(n);//this will also print 11
		
		n=10;
		System.out.println(n--);//print the value and then decrements - so it will print 10		
		System.out.println(n);//this will print 9
		
		n=10;
		System.out.println(--n);//decrement the value first and then prints..- so it will print 9
		System.out.println(n);//this will also print 9
		
		int m=10;
		int mm=m+10;
		System.out.println(mm);
		m+=10;// this is equivalent to m=m+10;
		System.out.println(m);//this will also print 20
		
		m=10;
		m-=5;//m=m-5;
		System.out.println(m); //this will print 5
		
		m=10;
		m*=2;//m=m*2;
		System.out.println(m);//this will print 20
		
		m=10;
		m/=5;//m=m/5;
		System.out.println(m);//this will print 2
		
		m=10;
		m%=2;//m=m%2;
		System.out.println(m);//this will print 0
		
		
		//RELATIONAL OPERATORS
		
		// RELATIONAL OPERATORS ALWAYS RETURN A BOOLEAN
		
		System.out.println(10==10);//== is comparison
		System.out.println(10!=1);//! stands for Negate/Not
		
		boolean b=(num1==num2);
		b=num1<num2;//lesser than
		System.out.println(b);
		b=num1>num2;//greater than
		System.out.println(b);
		
		b=num1>=num2;//greater than or equal to
		System.out.println(b);
		
		b=num1<=num2;//lesser than or equal to
		System.out.println(b);
		System.out.println(b);
		
		int x=10;
		int y=5;
		
		b=(x==y)&&(x>y);//if both the conditions are true then true will be written
		//if any one condition fails, it will return false
		System.out.println(b);
		
		b=(x==y)||(x>y);//even if one condition succeeds then the result will be true
		System.out.println(b);
	}
}
