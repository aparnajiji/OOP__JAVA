import java.util.Scanner;
public class Employee{ 
public static void main(String[] args) {
  
  System.out.println("Enter the no. of employees");
Scanner sc = new Scanner(System.in);   
int n=sc.nextInt();
  Employee1 e[] = new Employee1[n];
        for (int i = 0; i < n; i++) {
        	e[i] = new Employee1();
	
  	e[i].getInput();
    }
  System.out.println("********************************");
    System.out.println("**** Data Entered as below ****");
  
    for(int i=0; i<n; i++) {
   
   	e[i].display();
    }
    System.out.println("Enter the Employee No to Search:");
    int id = sc.nextInt();
    int chk=0;
     for(int i=0; i<n; i++) {
    chk = e[i].search(id);
    if(chk != 0){
        break;
    }
    }
    if(chk == 0){
        System.out.println("****Employee Not Found****");
    }
 }
}
class Employee1 {
 int eNo;
 String eName="";
 float eSalary;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the Employee No :: ");
  eNo = in.nextInt();
  System.out.print("Enter the Employee name :: ");
  eName = in.next();
  System.out.print("Enter the salary :: ");
  eSalary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee No = " + eNo);
  System.out.println("Employee name = " + eName);
  System.out.println("Employee salary = " + eSalary);
 }
 public int search(int id){
     if(id == eNo){
         System.out.println("****Employee Found****");
         display();
         return(1);
     }else{
         return(0);
     }
 }
}