package JavaLangPackage;
public class CloneMethod {
	public static void main(String []args) throws CloneNotSupportedException{

	A2 a=new A2(10,20);
	A2 a1=a.clone();//deep copy creating a duplicate variable
	A2 a2=a;//Single object Multiple reference 
	A2 a3=new A2(a.x,a.y);//deep copy by using constructor
System.out.println(" After performing deep Copy a == a1: " + (a == a1)); // false
System.out.println("a "+a);
System.out.println("a1 "+a1);
System.out.println("a2 "+a2);
System.out.println("a3 "+a3);


System.out.println(" After Performing deep copy a == a3: " + (a == a3)); // false
a2.x=50;
System.out.println("a after modifying a2 x value by 50 "+a+"a value changes(because a2 and a refer to same object)");

System.out.println("a2 after modifying a2  x value by 50 "+a2);
 
a3.x=100;
System.out.println("a after modifying a3 x value by 100 "+ a+" a value doesnot change( because a3 is deep copy of a)");
System.out.println("a3 after modifying a3 x value by 100 "+ a3);

}
}
class A2 implements Cloneable{
	int x,y;
	A2(int x,int y){
		this.x=x;
		this.y=y;
	}
	public A2 clone()throws CloneNotSupportedException{
		Object o=super.clone();
		A2 a=(A2)o;
		return a;
	}
	@Override
	public String toString() {
		return "A2 [x=" + x + ", y=" + y + "]";
	}
}
