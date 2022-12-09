package lab_11_decorator_pattern;




abstract class Coffe {
	String description = "A basic Coffe";
	String getDescription(){
		return description;
	}
	abstract double cost();
}

class espresso extends	Coffe{
	espresso(){
		System.out.println("An Espresso");
	}
	double cost(){
		return 5.0;
	}
}
class darkroast extends	Coffe{
	darkroast(){
		System.out.println("A DarkrRast");
	}
	double cost(){
		return 6.0;
	}
}
class houseblend extends Coffe{
	houseblend(){
		System.out.println("A HouseBlend");
	}
	double cost(){
		return 7.0;
	}
}
// creating decorators

abstract class condiments extends Coffe{
	Coffe coffe;
	public abstract String getDescription();
}


class mocha extends	condiments{
	mocha(Coffe coffe){
		this.coffe = coffe;
	}
	public String getDescription(){
		return coffe.getDescription() + ", Mocha";
	}
	double cost(){
		return coffe.cost() + .70;
	}
}
class mochaAndWhip extends	condiments{
	mochaAndWhip(Coffe coffe)
	{
		this.coffe = coffe;
	}
	public String getDescription(){
		return	coffe.getDescription() + ", Mocha and Whip";
	}
	double cost(){
		return coffe.cost() + 0.90;
	}
}
class soy extends	condiments{
	soy(Coffe coffe)
	{
		this.coffe = coffe;
	}
	public String getDescription(){
		return	coffe.getDescription() + ", soy";
	}
	double cost(){
		return coffe.cost() + 1.0;
	}
}
public class dec{
	public static void main(String[] args) {
			Coffe coffe = new espresso();
			// for a simple espresso
			System.out.println(coffe.getDescription() + " $" + coffe.cost() + "\n"); // printing 
			// for a darkroast
			Coffe coffe1 = new darkroast(); // coffe
			Coffe mocha = new mocha(coffe1); // tooping
			Coffe maw = new mochaAndWhip(mocha);
			System.out.println(maw.getDescription() + " $" + maw.cost() + "\n");
			// for a houseblend
			Coffe coffe2 = new houseblend();
			Coffe soy = new soy(coffe2);
			Coffe maw1 = new mochaAndWhip(soy);
			System.out.println(maw1.getDescription() + " $" + maw1.cost() + "\n");
	}
}