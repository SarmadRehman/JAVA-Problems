import java.util.Scanner;
class Meter {
double feets, meter;
public double feettoMeters(double meters) {
if (feets > 0.0)
	meter = feets * 0.3048;
else
{
feets = Math.abs(feets);
meter = feets*0.3048;
}
return meter;
}
}
public class task_01 {
public static void main(String[] args) {
Meter M = new Meter();
Scanner input = new Scanner(System.in);
System.out.println("Enter number in feet: ");
M.feets=input.nextDouble();
double Meter=M.feettoMeters(M.meter);
System.out.print("Convert Feet to meters : " + Meter +"m");  }  }