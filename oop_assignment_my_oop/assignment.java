package oop_assignment;
import java.util.*;
abstract class SuperHero
{
	String name;
	String realName;
	String occupation;
	String Description;
	int age; 
	boolean canFly;
	boolean isInjured;
	SuperHero(String name,String realName, String occupation,  String Description, int age, boolean canFly)
	{
	 this.name = name;
		this.realName = realName;
		this.occupation = occupation;
		this.Description = Description;
		this.age = age;
		this.canFly = canFly;}
	SuperHero()
	{
		this.name = "Not Defined";
		realName = "Not Defined";
		occupation = "Not Defined";
		Description = "Not Defined";
		age = 0;
		canFly = false;
		}
	   abstract void attack(String attackName, int value);
	   abstract void attack(String attackName);
	   abstract void attack();
	   abstract void rest(int dura);
	   public abstract String toString();
	   public int choseAttack(int len)
	{
	 	Random random = new Random();
	 	return random.nextInt(len);
	}

}
class physicalHero extends SuperHero
{
	int maxStrenght ,strength;
	physicalHero(String name,String realName, String occupation,  String Description, int age, boolean canFly, int strength, int maxStrenght) // OVERLOADED
	{
		super(name, realName, occupation, Description, age, canFly); // APPRAOCHING  SUPERCLASS
		this.strength = strength;
		this.maxStrenght = maxStrenght;
	}
	physicalHero() // SUBCLASSS
	{
		super();
		this.maxStrenght = 0;
		this.strength = 0;
	}
	void attack(String attackNames)
	{
		System.out.println("\n");
		int tempStorage = strength - 50;
		if(strength <= 0)
		{
			System.out.println("Insufficient strength");
		}
		else
		{
			System.out.println(this.name + " performed " + attackNames);
			this.strength = tempStorage;
			this.updateResult();
		}
	}
	void attack(String attackNames, int value)
	{
		System.out.println("\n");
		int tempStorage = strength - value;
		if(strength <= 0)
		{
			System.out.println("Insufficient strength");
		}
		else
		{
			System.out.println(this.name + " performed " + attackNames);
			this.strength = tempStorage;
			this.updateResult();
		}
	}
	void attack()
	{
		System.out.println("\n");
		String[] attacks = {"Kick", "Punch", "Meteor Push", "Fire Force"};
		int index = super.choseAttack(attacks.length);
		int[] strengthConsumption = {2, 5, 30, 35};
		int tempStorage = this.strength - strengthConsumption[index]; 
		if(tempStorage <= 0)
			System.out.println("Insufficient strength");
		else
		{
			System.out.println(this.name + " performed " + attacks[index]);
			this.strength = tempStorage;
			this.updateResult();
		}
	}
	void updateResult()
	{
		System.out.println("Physical Strenght Decreased.");
		System.out.println("Remaining Physical Strenght is " + this.strength);
		System.out.println("\n");
	}
	void rest(int duration)
	{
		System.out.println("\n");
		for(int i = 0; i < duration; i++){
			if(this.strength != this.maxStrenght)
				this.strength++;
			else
				break;
		}
		System.out.println("Resting Done, strength restored.");
		System.out.println("\n");
	}
	void rest(char command)
	{
		System.out.println("\n");
		if(command == 'f')
			this.strength = this.maxStrenght;
		else if(command == 'h')
			this.strength = this.maxStrenght / 2;
		System.out.println("Resting Done, strength restored.");	
		System.out.println("\n");
	}
	public String toString()
	{
		String retMessage = "Name: " + name + 
	    "\nReal Name: " + realName + 
		"\nOccupation: " + occupation + 
		"\nAge: " + age + " Years"+  
		"\nCan Fly: " + canFly + 
		"\nStrength: " + strength + " RM"; 
		return retMessage;
	}}
class mageHero extends SuperHero
{
	int mana, maxMana;
	mageHero(String name,String realName, String occupation,  String heroDescription, int age, boolean canFly, int mana, int maxMana)
	{
		super(name, realName, occupation, heroDescription, age, canFly);
		this.mana = mana;
		this.maxMana = maxMana;
	}
	mageHero()
	{
		super();
		this.maxMana = 0;
		this.mana = 0;
	}
	void attack(String attackNames)
	{
		System.out.println("\n");
		int tempStorage = mana - 50;
		if(mana <= 0)
		{
			System.out.println("Insufficient mana");
		}
		else
		{
			System.out.println(this.name + " casted " + attackNames);
			this.mana = tempStorage;
			this.updateResult();
		}
	}
	void attack(String attackNames, int value)
	{
		System.out.println("\n");
		int tempStorage = mana - value;
		if(mana <= 0)
		{
			System.out.println("Insufficient mana");
		}
		else
		{
			System.out.println(this.name + " casted " + attackNames);
			this.mana = tempStorage;
			this.updateResult();
		}
	}
	void attack()
	{
		System.out.println("\n");
		String[] attacks = {"Mind Assault", "Shadow Orb", "Fury of Heat", "Chaos Burst"};
		int index = super.choseAttack(attacks.length);
		int[] manaConsumption = {2, 5, 30, 35};
		int tempStorage = this.mana - manaConsumption[index]; 
		if(tempStorage <= 0)
		{
			System.out.println("Insufficient mana");
		}
		else
		{
			System.out.println(this.name + " casted " + attacks[index]);
			this.mana = tempStorage;
			this.updateResult();
		}
	}
	void updateResult()
	{
		System.out.println("Mana Decreased.");
		System.out.println("Remaining mana is " + this.mana);
		System.out.println("\n");
	}
	void rest(int duration)
	{
		System.out.println("\n");
		for(int i = 0; i < duration; i++){
			if(mana != maxMana)
				mana++;
			else
				break;
		}
		System.out.println("Resting Done, mana restored.");
		System.out.println("\n");
	}
	void rest(char command)
	{
		System.out.println("\n");
		if(command == 'f')
			this.mana = this.maxMana;
		else if(command == 'h')
			this.mana = this.maxMana / 2;
		System.out.println("Resting Done, mana restored.");	
		System.out.println("\n");
	}
	public String toString()
	{
		String retMessage = "Name: " + name + 
	    "\nReal Name: " + realName + 
		"\nOccupation: " + occupation + 
		"\nAge: " + age + " Years"+ 
		"\nCan Fly: " + canFly + 
		"\nMana: " + mana + " magic units"; 
		return retMessage;
	}}
class vigilante extends SuperHero
{
	String uniqueWeapon;
	vigilante(String name,String realName, String occupation,  String heroDescription, int age, boolean canFly, String uniqueWeapon)
	{
		super(name, realName, occupation, heroDescription, age, canFly);
		this.uniqueWeapon = uniqueWeapon;
	}
	vigilante()
	{
		super();
		this.uniqueWeapon = "Not Defined";
	}
	void attack()
	{
		System.out.println("\n");
		System.out.println(this.name + " used Weapon: " + this.uniqueWeapon);
		System.out.println("\n");
	}
	void attack(String attackName, int value)
	{
		System.out.println("\n");
1		for(int i = 0; i < value; i++)
		{
		System.out.println(this.name + " used Weapon: " + this.uniqueWeapon);		
		}
		System.out.println("\n");	
	}
	void attack(String attackName)
	{
		System.out.println("\n");
		System.out.println(this.name + " used secondary Weapon: " + attackName);
		System.out.println("\n");
	}
	void rest(int duration)
	{
		System.out.println("\n");
		System.out.println(this.name + " rested for " + duration + " days.");
		System.out.println("Resting Done, mana restored.");
	}
	void rest(char command)
	{
		System.out.println("\n");
		if(command == 'f')
			System.out.println(this.name + " rested for " + 2 + " days.");
		else if(command == 'h')
			System.out.println(this.name + " rested for " + 4 + " days.");
		System.out.println("Resting Done, mana restored.");	
	}
	public String toString()
	{
		String retMessage = "Name: " + name + 
	    "\nReal Name: " + realName + 
		"\nOccupation: " + occupation + 
		"\nAge: " + age + " Years"+ 
		"\nCan Fly: " + canFly + 
		"\nUnique Weapon: " + this.uniqueWeapon; 
		return retMessage;
	}}
class speedster extends physicalHero
{
	int topSpeed, calorieIntake;
	speedster(String name,String realName, String occupation,  String heroDescription, int age, boolean canFly, int strength, int maxStrenght, int topSpeed, int calorieIntake)
	{
		super(name, realName, occupation, heroDescription, age, canFly, strength, maxStrenght);
		this.topSpeed = topSpeed;
		this.calorieIntake = calorieIntake;
	}
	speedster()
	{
		super();
		this.topSpeed = 0;
		this.calorieIntake = 0;
	}
	void attack()
	{
		System.out.println("\n");
		String[] attacks = {"Falcon Kick", "Sonic Punch", "Crystal Flash", "One Hit KO"};
		int index = super.choseAttack(attacks.length);
		int[] strengthConsumption = {2, 5, 30, 35};
		int tempStorage = this.strength - strengthConsumption[index]; 
		if(tempStorage <= 0) 
			System.out.println("Insufficient physical strength");
		else
		{
			System.out.println(this.name + " performed " + attacks[index]);
			this.strength = tempStorage;
			super.updateResult();
		}
	}
	void attack(String attackName)
	{
		super.attack(attackName);
	}
	void attack(String attackName, int value)
	{
		super.attack(attackName, value);
	}
	void rest(int duration)
	{
		super.rest(duration);
	}
	void rest(char command)
	{
		super.rest(command);
	}
	public String toString()
	{
		String retMessage = "Name: " + name + 
	    "\nReal Name: " + realName + 
		"\nOccupation: " + occupation + 
		"\nAge: " + age + " Years" +
		"\nCan Fly: " + canFly + 
		"\nStrength: " + strength + " RM" + 
		"\nTop Speed: " + topSpeed + "km/h"+
		"\nDaily Calorie Intake: " + calorieIntake + " kcal"; 
		return retMessage;
	}
}
public class assignment
{
	public static void demoAttack(physicalHero s1, physicalHero s2, mageHero m1, mageHero m2, vigilante v1, vigilante v2, speedster s3, speedster s4)
	{
		Random random = new Random();
		int value = random.nextInt(4);
		if(value == 0)
		{
			s1.attack("Punch");
			s2.attack("Head Butt");
			m1.attack("Annihilation");
			m2.attack("Frost Nova");
			v1.attack("Brass Knuckle");
			v2.attack("Bat");
			s3.attack("Sonic Boom");
			s4.attack("Sonic Charge");
		}
		else if(value == 1)
		{
			s1.attack();
			s2.attack();
			m1.attack();
			m2.attack();
			v1.attack();
			v2.attack();
			s3.attack();
			s4.attack();
		}
		else
		{
			s1.attack("Punch", 10);
			s2.attack("Head Butt", 15);
			m1.attack("Annihilation", 25);
			m2.attack("Frost Nova", 30);
			v1.attack("Brass Knuckle", 2);
			v2.attack("Bat", 3);
			s3.attack("Sonic Boom", 50);
			s4.attack("Sonic Charge", 35);
		}
	}
	public static void restDemo(physicalHero s1, physicalHero s2, mageHero m1, mageHero m2, vigilante v1, vigilante v2, speedster s3, speedster s4)
	{
		Random random = new Random();
		int value = random.nextInt(4);
		switch(value)
		{
			case 0:
				s1.rest(25);
				s2.rest(22);
				m1.rest(30);
				m2.rest(35);
				v1.rest(50);
				v2.rest(52);
				s3.rest(60);
				s4.rest(25);
				break;
			case 1:
				s1.rest('f');
				s2.rest('f');
				m1.rest('h');
				m2.rest('f');
				v1.rest('f');
				v2.rest('h');
				s3.rest('h');
				s4.rest('f');
				break;
			default:
				s1.rest('f');
				s2.rest('f');
				m1.rest('h');
				m2.rest('f');
				v1.rest('f');
				v2.rest('h');
				s3.rest('h');
				s4.rest('f');
				break;
		}
	}
	public static void main(String[] args) 
	{
		int choice;
		boolean contt = true;
		physicalHero ps1 = new physicalHero("Super Man", "Clark Kent", "Journalist", "Strong", 40, true, 900, 900);
		physicalHero ps2 = new physicalHero("Iron Man","Tony Stark", "Actor", "Robot", 54, true, 500, 500);
		mageHero m1 = new mageHero("Harry Poter", "Arsalan Niazi", "Student", "No one likes him!", 20, false, 200, 200);
		mageHero m2 = new mageHero("Docter Strange", "Zohaib", "Unemployed", "Always hungry", 19, false, 300, 300);
		vigilante v1 = new vigilante("BatMan", "Bruce wayne", "Writer", "Love to help people", 60, false, "Ak-47");
		vigilante v2 = new vigilante("Mr Bean", "Danyal Khan Niazi", "Eating", "Always stay happy", 150, false, "Burger");
		speedster sts = new speedster("Flash", "Wijdan", "Web developer", "ALways available for help", 21, false, 400, 400, 1200, 5000);
		speedster sts1 = new speedster("Bruce lee", "Sarmad Rehman", "Unemployed", "Very strict", 23, false, 500, 500, 2000, 7000);
		Scanner scanner =  new Scanner(System.in);
		try
	{	 
		do
		{
			System.out.println("1. Show Hero Data.");
			System.out.println("2. Demonstrate Attakcs.");
			System.out.println("3. Demonstrate Resting.");
			System.out.println("4. Exit.");
			System.out.print("Your Choice: ");
			choice = scanner.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("\n");
					System.out.println(ps1);
					System.out.println("\n");
					System.out.println(ps2);
					System.out.println("\n");
					System.out.println(m1);
					System.out.println("\n");
					System.out.println(m2);
					System.out.println("\n");
					System.out.println(v1);
					System.out.println("\n");
					System.out.println(v2);
					System.out.println("\n");
					System.out.println(sts);
					System.out.println("\n");
					System.out.println(sts1);
					System.out.println("\n");
					break;
				case 2:
					demoAttack(ps1, ps2, m1, m2, v1, v2, sts, sts1);
					break;
				case 3:
					restDemo(ps1, ps2, m1, m2, v1, v2, sts, sts1);
					break;
				case 4:
					contt = false;
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
		while(contt);
	}
		catch(InputMismatchException exceptions)
		{
			System.out.println("Invalid Value, Exiting");
		}	
	}
}