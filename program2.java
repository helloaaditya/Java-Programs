class student1
{
int a; //instance variable
void sum(int a,int b)
{
System.out.println("First Student Marks :");
System.out.println("---------------------------------------");
System.out.println("first subject mark is:"+a);
System.out.println("Second subject mark is:"+b);
System.out.println("---------------------------------------");
int c = a + b;
System.out.println("Sum of the two subject mark is: "+c);
System.out.println("---------------------------------------");
}
}
class student2{
    int a;
    void sum(int a,int b, int d)
{   System.out.println("Second Student Marks :");
    System.out.println("---------------------------------------");
    System.out.println("first subject mark is:"+a);
    System.out.println("second subject mark is:"+b);
    System.out.println("third subject mark is:"+d);
    int c = a + b + d;
    System.out.println("---------------------------------------");
    System.out.println("Sum of the three subject mark is: "+c);
    System.out.println("---------------------------------------");
}
}

class mainclass
{
public static void main(String ar[])
{
//creating an object of class bca
student1 ob1 = new student1();
ob1.sum(10,20);
student2 ob2 = new student2();
ob2.sum(10,20,30);
}
}

