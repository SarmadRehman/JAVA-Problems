package lab_11;
import java.util.*;
interface GamePad
{
	public void attack();
	public void jump();
	public void move();
}
interface frontPanel
{
	public int powerON();
	public int powerOFF();
	public int ejectDisc();
}
class computer implements GamePad, frontPanel
{
	public void attack()
	{
		System.out.println("Attacking");
	}
	public void jump()
	{
		System.out.println("Jumping");
	}
	public void move()
	{
		System.out.println("Moving");
	}
	public int powerON()
	{
		System.out.println("Turning computer on");
		return 0;
	}
	public int powerOFF()
	{
		System.out.println("Shutting computer off");
		return 0;
	}
	public int ejectDisc()
	{
		System.out.println("Ejecting Disc");
		return 0;
	}
}
public class task_1
{
	public static void main(String[] args) 
	{
		computer program = new computer();
		program.attack();
		program.jump();
		program.move();
		program.powerON();
		program.powerOFF();
		program.ejectDisc();
	}
}
