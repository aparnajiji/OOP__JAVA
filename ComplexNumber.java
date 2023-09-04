class ComplexNumber {
      int real, image;
  
    public ComplexNumber(int r, int i) {
        real = r;
        image = i;
    }
  
    public void Display() {
        System.out.print(real + " +i" + image);
    }
  
    public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2) {
  
        ComplexNumber result = new ComplexNumber(0, 0);
        result.real = n1.real + n2.real;
        result.image = n1.image + n2.image;
        return result;
    }
  
    public static void main(String arg[]) {
  
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(10, 5);
          
	System.out.print("first Complex number: ");
        c1.Display();
          
        System.out.print("\nSecond Complex number: ");
        c2.Display();
  
        ComplexNumber result = add(c1, c2);
        System.out.print("\nAddition is :");
        result.Display();
    }
}