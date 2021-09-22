package homeworkn3;

public class ReturnTypeWithoutParameter {

//int data type example
	
public int countGuest() {
 int kids=10;
 int adults=5;
 int Total=kids+adults;
 System.out.println( "The total number of guest is :"+ Total);
return Total;	
	
}

//boolean data type example

public static boolean isitavailable() {
	
boolean availability =20>10;
System.out.println("yes i'm available saturday night  " +availability);
	
	
return availability;
}


// with double data type example

public double getDailySalary() {
	
	double hourlySalary =40.50;
	System.out.println("please enter the daily salary" + hourlySalary*8); 
return hourlySalary;
}

 //with string data type example
public static String getEmployeeName() {
String name="Paul";
System.out.println("Please enter the employee's name : " + name );

	return name ;

}

public int getAge() {
	
byte myage=30;

System.out.println("my age is : " + myage);
return myage;
}



public static void main(String[] args) {

	ReturnTypeWithoutParameter cgn=new ReturnTypeWithoutParameter();
	cgn.countGuest();
	//System.out.println(cgn.countGuest());
	System.out.println("******************************** ");

	ReturnTypeWithoutParameter.isitavailable();
	System.out.println("************************");

	cgn.getDailySalary();
	 System.out.println("*************************");
	 
	 ReturnTypeWithoutParameter.getEmployeeName();
	 System.out.println("***************************");
	
	cgn.getAge();
}

}
