import java.util.Scanner;
class overloading1{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);   
    System.out.println("Enter the length of rectangle:");
    int l=sc.nextInt();
    System.out.println("Enter the width of rectangle:");
    int b=sc.nextInt();
    System.out.println("area of rectangle:"+shape.area(l,b));
    System.out.println("Enter the length of cuboid:");
    int  a=sc.nextInt();
    System.out.println("Enter the width of cuboid:");
     b=sc.nextInt();
    System.out.println("Enter the height of cuboid:");
    int c=sc.nextInt();
    System.out.println("area of cube:"+shape.area(a,b,c));
    System.out.println("Enter the radius of circle:");
    int r=sc.nextInt();
    System.out.println("area of circle:"+shape.area(2));
}
}
class shape {
static int area(int a,int b){return a*b;}
static int area(int a,int b,int c){return 2*(a*b + b*c +a*c);}
static double area(double a){return a*a*3.14;}
}

