package lab_03_Practice_JAVA;



import java.util.Scanner;

public class lab_03
{
	public static void main(String[] args) {
		System.out.println("Hello World \n");
	/*	Triangle test = new Triangle(3,4) ; 
		System.out.println(test.getArea()) ;  */
		Date test = new Date (28,11,2022) ;
		Date test2 = new Date (28,11,2022) ;
		
	System.out.println(	test.getDay() ) ; 
	System.out.println(	test.getMonth() ) ; 
	System.out.println(	test.getYear() ) ; 
		test.displayDate()  ; 
	System.out.println(	test.equals(test2) ) ; 
	System.out.println(	test.equals(test) ) ; 
	System.out.println(	test.differenceDates(test2) ) ; 
 	}
}
/*
Task1
Write a class that represents triangle named Triangle, the class must have the following members:
○ private double height;//Height
○ private double base;//Base length
○ public Triangle(double h, double b);//Constructor
○ public void setHeight(double x);//Sets height
○ public double getHeight();//Gets height
○ public void setBase(double x);//Sets base length
○ public double getBase();//Gets base length
○ public double getArea();//Returns the area of the triangle
*/
class Triangle {
    private double height;   private double base;   
    public Triangle(double h, double b) { height=h ;  base = b ; }
    public void setHeight(double x) { height = x ; }
    public double getHeight() { return height; }  
    public void setBase(double x) { base = x ; }
    public double getBase() {return base; }
    public double getArea() { return base * height; }
}

/*
Task 2
Create a class called Date that includes three pieces of information as instance variables - a month (type int), a day (type int) and a year (type int). Your class should have a constructor that initializes the three instance variables and assumes that the values provided are correct.
1. Provide a set and a get method for each instance variable.
2. Provide a method “displayDate()” that displays the month, day and year separated by forward slashes (/).
3. Write a method “equals()” that takes a Date object, compares it with this Date, and returns a Boolean value.
4. Write a method “differenceDates()” that takes a Date object as an argument, subtracts the corresponding elements from this Date, and returns a Date object which is then displayed in the test program.
Write a test application named DateTest that demonstrates class Date’s capabilities.
*/
class Date {
    private int day, month, year ; 
    public void setMonthDayYear (int d, int m, int y) { 
        day = d;  month = m; year = y ;
}
public Date(int d, int m, int y) { day = d; month = m ; year = y ; }
  public int getDay() { return day ; }
  public int getMonth() { return month ; }
  public int getYear() { return year ; }
  public void displayDate() { System.out.println("Date: " + month + "/" + day + "/" + year ) ; }
  public Boolean equals(Date d) { return this == d ; }
  public Date differenceDates(Date o) { 
      Date result = new Date (day - o.getDay() , month - o.getMonth(), year - o.getYear() ) ;
            return result ;                              
  }
  }
 /* 
  Task 3
Write a class Employee that represents an employee of some organization, the class should contain the following members:
○ private int id;//Employee id
○ private String name;//Employee name
○ private int type;//1 = employee, 2 = manager
○ private double Salary;//Employee salary
○ public Employee(int _id, String _name);//Constructor
○ public void setID(int x);//id mutator
○ public void setName(int x);//name mutator
Lab [CS313: Object oriented Analysis and Design]
○ public int getID();//id accessor
○ public String getName();//name accessor
○ public double getSalary();
*/
class Employee { 
    private int id; private String name;              private int type; //1 = employee, 2 = manager
 private double Salary;//Employee salary
 public Employee(int _id, String _name) //Constructor 
                          { id = _id ; name = _name ; }
 public void setID(int x) //id mutator
                          { id = x ;}
  
 public void setName(String x)//name mutator
                          { name = x ; } 
 public int getID()              //id accessor
                { return id ; }
 public String getName()  //name accessor
 { return name ; }
 public double getSalary()
 { return Salary ; }

/*
To set the salary, write a method setSalary() which asks the user to enter the number of hours worked per week and hourly pay rate. 
Working 40 hours per week is the normal workload. However, if someone works more than 40 hours per week, it is considered overtime. 
The payment for overtime is 1.5 times more than the regular payment. 
In this method you have to compute the correct salary for an Employee. Moreover, for a manger, you have to add 10% in his salary 
to account for his management activities.
○ public void setSalary();//sets salary.
Create a test application EmployeeTest which creates an employee and a manager and computes their salary.
    */
 
public void setSalary() {
    Scanner obj = new Scanner(System.in) ; 
    System.out.println (" How many hours you have worked per week ? ") ;
    int hrs = obj.nextInt() ;
    if (hrs <40 ) do {
       System.out.println (" Normal hours are 40 you coould'nt be less than 40 ") ;
       hrs = obj.nextInt() ;
    }while (hrs >= 40) ; 
    
    System.out.println (" Type the hourly rate in USD ($) :  ") ;
    int hrlyRat = obj.nextInt() ; 
        System.out.println ("Choose your Working Status as : \n 1.Employee \n 2.Manager ") ;
        int type = obj.nextInt() ; 
        System.out.println("Type your name : ") ; 
        String name = obj.nextLine() ;
        System.out.println("Type your ID : ") ;
        int ID = obj.nextInt() ; 
        Employee emp2 = new Employee(ID, name); 
        if (hrs >= 40 && type == 1) { 
        double PayexTime = (hrs - 40) * 1.5 * hrlyRat; 
        emp2.Salary = (40 * hrlyRat) + PayexTime ;
            
        }
        if ( hrs >= 40 && type == 2 ) {
            double PayexTime = (hrs - 40) * 1.5 * hrlyRat;
            emp2.Salary = ((40 * hrlyRat) + PayexTime) ;
            emp2.Salary += emp2.Salary * 0.1 ; 
        }
        
    }
}






