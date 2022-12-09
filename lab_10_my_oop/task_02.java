package lab_10;


import java.util.*;
class task2
{
	int i;
	int j;
	protected int a;
	protected int b;
	task2(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	double calculate()
	{
		return a + b;
	}
}	
class subtract extends task2 
{
	subtract(int a, int b)
	{
		super (a, b);
	}
	double calculate()
	{
		return a - b;
	}
}
class multiply extends task2
{
	multiply(int a, int b)
	{
		super(a, b);
	}
	double calculate()
	{
		return a * b;
	}
}
class division extends task2
{
	division(int a, int b)
	{
		super(a, b);
	}
	double calculate()
	{
		return a / b;
	}
}
class Add extends task2
{
	int c;
	Add(int a, int b, int c)
	{
		super(a, b);
		this.c = c;
	}
	double calculate()
	{
		System.out.println(super.calculate());
		double sum=a+b+c;
		return sum;
	}
}
public class task_02
{
	public static void main(String[] args)
	{
	    multiply mult=new multiply(6,9);
	    System.out.println("The multiplication of two number is "+mult.calculate());
		Add test=new Add(7,8,9);
	System.out.println(test.calculate());
	}
}
 