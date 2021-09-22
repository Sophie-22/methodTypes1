package homeworkn3;

public class ReturnTtpeWithParameters {
	
	
	
public int countguests( int adults, int kids) {

	int Totalguests=adults+kids;
	System.out.println("the total number of gests is:" + Totalguests);
	return Totalguests;
}
//////////////////////////////////////////////////
public static String getname ( String name,int  age ) {
System.out.println("I'm :"+ age);	
System.out.println("my name is :"+name);
return name;	
}
////////////////////////////////////////////////
public static boolean isTheManagerAvailable(String managername,int managerage, char manageravailability ) {
	
String name="Paul";
int age = 40;
char available=manageravailability;
if (available=='Y') {
System.out.println("yes the manager is availbale" );}
else {
 System.out.println("the manager is not available");	
}
return	available=='Y';
}

///////////////////////////////////////////////
public int getmultiplication(int a, int b) {
int  d =a*b;
System.out.println("the mutltiplication is: " + d );

return d ;


}
///////////////////////////////////////////////////
 public static double getsub(double num1, double num2, double num3) {
double num4=num1-num2-num3;
System.out.println("sub is : " + num4);

return num4;
	 
	 
 }
//////////////////////////////////////////////////////


	public static void main(String[] args) {
		
ReturnTtpeWithParameters objct = new ReturnTtpeWithParameters();
objct.countguests(10, 15);

System.out.println("*************");
objct.getname("Paul", 35);

System.out.println("***************");

System.out.println(objct.isTheManagerAvailable("Paul", 40, 'Y'));

System.out.println("******************");
System.out.println(objct.getmultiplication(50, 2));
System.out.println("******************");
ReturnTtpeWithParameters.getsub(100, 50, 25);
	}

}
