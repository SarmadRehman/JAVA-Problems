import java.util.Scanner;
class Rectangle {
private double length, width;
public void SetPerimeter(double length, double width) {
this.length=length;
this.width=width;
}
public double getlength() {
return this.length;
} public double getwidth() {
return this.width;
} public double Perimeter(double L, double W) {
return 2*L+2*W;
} public double Area(double L, double W) {
return L*W;
}}
public class task_02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
Rectangle r= new Rectangle();
double len, wit;
System.out.println("Enter Length = ");
len = sc.nextDouble();
System.out.println("Enter Width = ");
wit = sc.nextDouble();
r.SetPerimeter(len, wit);
System.out.print("Length of Rectangle: "+ r.getlength());
System.out.print("\nWidth of Rectangle: "+ r.getwidth());
double p=r.Perimeter(r.getlength(),r.getwidth());
System.out.print("\nPerimeter of Rectangle: "+ p);
double A=r.Area(r.getlength(),r.getwidth());
System.out.print("\nArea of Rectangle: "+ A);   }   }