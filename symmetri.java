import java.util.Scanner;
public class symmetri
{
public static void main(String[] args )
{
Scanner sc = new Scanner( System.in);
System.out.println( "Enter the number of rows :");
int rows = sc.nextInt();
System.out.println("Enter the number of columns :");
int cols = sc.nextInt();
int matrix[][] = new int[rows][cols];
if(rows>0 && cols>0)
{
System.out.println("Enter the elements :");
for ( int i = 0; i < rows; i++ )
{
for ( int j = 0; j < cols; j++ )
{
matrix[i][j] = sc.nextInt();
}
}
System.out.println("The input matrix is :");
for ( int i = 0; i < rows; i++ )
{
for ( int j = 0; j < cols; j++ )
{
System.out.print(matrix[i][j]+"\t");
}
System.out.println();
}


if ( rows != cols )
{
System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
}
else
{
boolean symmetri = true;
for ( int i = 0; i < rows; i++ )
{
for ( int j = 0; j < cols; j++ )
{
if ( matrix[i][j] != matrix[j][i] )
{
symmetri = false;
break;
}
}
}

System.out.println("The tranpose of matrix is :");
for ( int i = 0; i < rows; i++ )
{
for ( int j = 0; j < cols; j++ )
{
System.out.print(matrix[j][i]+"\t");
}
System.out.println();
}
if ( symmetri)
{
System.out.println("The given matrix is symmetric.");
}
else
{
System.out.println("The given matrix is not symmetric.");
}
}
}
else
{
 System.out.println("please give valid rows and columns!");
}
}
}