package strategy_pattern;

interface Operation{
	public int operations (int num1, int num2);
}
class addition implements Operation{
	public int operations(int num1, int num2){
		return num1 + num2;
	}
}
class substraction implements Operation
{
	public int operations(int num1, int num2){
		return num1 - num2;
	}
}
class multiplication implements Operation{
	public int operations(int num1, int num2){
		return num1 * num2;
	}
}
class division implements Operation{
	public int operations(int num1, int num2){
		return num1 / num2;
	}
}
class mainOperation{
	Operation operationType;
	mainOperation (Operation operationType){
		this.operationType = operationType;
	}
	int doOperation(int num1, int num2){
		return operationType.operations(num1, num2);
	}
	void changeOperation(Operation operationType){
		this.operationType = operationType;
	}
}

public class strategy_patt
{
	public static void main(String[] args)
	{
		mainOperation mp = new mainOperation(new addition());
		System.out.println("Additon: " + mp.doOperation(2, 3));
		mp.changeOperation(new substraction());
		System.out.println("Substraction: " + mp.doOperation(2, 3));
		mp.changeOperation(new multiplication());
		System.out.println("Multiplication: " + mp.doOperation(2, 3));
		mp.changeOperation(new division());
		System.out.println("Division: " + mp.doOperation(10, 2));
	}
}