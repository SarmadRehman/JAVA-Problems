package lab_10;


import java.util.Scanner;
abstract class Shape
{  
	abstract double perimeter();
	abstract double area();
}
class EquilateralTriangle extends Shape
{	double sides;
	EquilateralTriangle(double sides)
	{ this.sides = sides;
	}
	  double area()
	{ double areas = (1.73 * sides * sides)/4;
	  return areas;
	} 
	  double perimeter()
	{ double perimeters = 3 * sides;
	  return perimeters;
	}
}
public class task_01
{
	  public static void main(String[] args) 
	{ 
		  Scanner obj = new Scanner (System.in);
	  System.out.println("Enter side length");
	  double sides = obj.nextDouble(); 
	  Shape triangle = new EquilateralTriangle(sides);

	  System.out.println("Area is = " + triangle.area());
	  System.out.println("Perimter is = " + triangle.perimeter());	
	}
}
