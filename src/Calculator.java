import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	int num1;
	int num2;
	String operation = new String();
	int result = 0;
	Operator op = new Operator();
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter Number1");
	num1 = sc.nextInt();
	System.out.println("Enter Number2");
	num2= sc.nextInt();
	
	System.out.println("Enter operation to be performed: addition: +, subtraction: - , Multiplication: *, division: /");
	
	operation = sc.next();
	
	if(operation.equals("+"))
	{
		result = op.add(num1, num2);
	}
	else if(operation.equals("-"))
	{
		result = op.sub(num1,num2);
	}
	else if(operation.equals("*"))
	{
		result = op.mul(num1, num2);
	}
	else if(operation.equals("/"))
	{
		result = op.div(num1, num2);
		if ( -1 == result)
		{
			System.out.println("Div by 0 error");
		}
	}
	else
	{
		System.out.println("Wrong choic entered\n");
	}
	
	System.out.println("Result = " +result);
}

}
