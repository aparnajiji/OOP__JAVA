class product{
int pcode;
String pname;
float price;
product(int i,String n,float s){
pcode=i;
pname=n;
price=s;
}
void display(){
System.out.println(pcode+"\t\t"+pname+"\t\t "+price);
}
static void lowest_price(float price1,float price2,float price3){
if(price1<price2&&price1<price3)
{
System.out.println("\n product1 has lowest price");
}
else if(price2<price1&&price2<price3)
{
System.out.println("\n product2 has lowest price");
}
else{
System.out.println("\n product3 has lowest price");
}

}

public static void main(String args[]){
System.out.println("\n\n\tPRODUCT DETAILS\n\n PRODUCT CODE\tPRODUCT NAME\tPRODUCT PRICE\n");
product p[]=new product[3];
p[0]=new product(101,"watch",250);
p[1]=new product(102,"book",100);
p[2]=new product(103,"moblie",30000);
p[0].display();
p[1].display();
p[2].display();
lowest_price(p[0].price,p[1].price,p[2].price);
}


}