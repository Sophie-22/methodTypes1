package homeworkn3;

public class NonReturnTypeWithParameters {
 public static void getemployeeinfo(String name, int age) {
System.out.println("the employee's name is :" + name+ "employee's age is :" + age );
 }

public void getsubtraction(int num1,int num2,int num3, int num4) {
int sub=num1-num2-num3-num4;
System.out.println("the subbtraction of these four  values is: " + sub);	
}

public static void getjobtitle(String jobName ) {
String name="anesthesia";
System.out.println("job title:" + name);	
}

public void doMultiplication(double num1,double num2) {
double Total=num1*num2;
System.out.println("the total of sum is :  " + Total);
}

public void getSlary(double monthlysalary) {
double Salary=monthlysalary*12;
System.out.println("net salary is :" + Salary);
}
	 
 
 
 public static void main(String[] args) {

 NonReturnTypeWithParameters org=new NonReturnTypeWithParameters();
 org.doMultiplication(10, 2);
 org.getSlary(80.000);
 org.getsubtraction(200, 100, 50, 25);
 NonReturnTypeWithParameters.getemployeeinfo("Paul", 35);
 NonReturnTypeWithParameters.getjobtitle("anesthesia");
	
}
}
