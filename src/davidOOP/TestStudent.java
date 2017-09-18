package davidOOP;
import java.util.Scanner;
public class TestStudent extends Student {
	public static  int x = 0;
	public static  String Output = "";
	public static int student = 1;
	public static void main(String[] args){
	Start();	
	}
	public static void Start() {
	    Scanner in = new Scanner(System.in);
	    System.out.print("\nStudent Record\n 1) Add \n 2) View \n 3) Exit: \n\nChoose: ");
	    int choice = in.nextInt();
	    
	    switch(choice) {
	       case 1 :
	          AddStudent();
	          break;
	       case 2 :
	   		  viewStudents();
	   		  
	    	   break;
	       case 3 :
	    	  System.out.print("Program terminated");
	    	  System.exit(0);

	          break;
	       default :
	    	   
	          System.out.println("Invalid grade");
	    }
	}
	public static void AddStudent()
	{
		
		Student[] a = new Student[student];
		Scanner sc = new Scanner (System.in);
		
		a[x] = new Student();
		
		System.out.print("Student Name: ");
		String strStudName = sc.nextLine();
		a[x].setName(strStudName);
	
		System.out.print("Student Age: ");
		int intStudAge = sc.nextInt();
		a[x].setAge(intStudAge);
	
		System.out.print("Student Allowance: ");
		float strStudAllowance = sc.nextFloat();
		a[x].setAllowance(strStudAllowance);		
		Output=Output +"\n\n\n#"+(student)+" Student Name: "+ a[x].getName()+"\nStudent Age: "+ a[x].getAge()+ "\n Allowance: " +a[x].getAllowance()+"\n";		
		student++;
		viewStudents();
		Start();
	}
	
	public static void viewStudents()
	{
		System.out.print(Output);
		Start();
	}
}


