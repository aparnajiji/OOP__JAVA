import java.util.Scanner;
class arraysample{
	int[]a;
	Scanner sc=new Scanner(System.in);
	void readarray()
	{
		a=new int[5];
		
		System.out.println("enter the elements: ");
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}
	}
	void printarray()
	{
		System.out.println("Array elements are: ");
		for(int i=0;i<5;i++)
			System.out.println(a[i]);
	}
	void searcharray()
	{
		int v,t=0;
		
		System.out.println("enter the element to be searched: ");
		v=sc.nextInt();
		for(int i=0;i<5;i++){
			if(a[i]==v){
				t=1;
			}
		}
		if(t==0){
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found");
		}
	}
	
	public static void main(String[] args){
		arraysample obj=new arraysample();
		obj.readarray();
		obj.printarray();
		obj.searcharray();
	}
}
	
	