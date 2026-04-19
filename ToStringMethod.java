package JavaLangPackage;
public class ToStringMethod {
	public static void main(String[]args) {
		B1 b=new B1();
		//getting toString from object class
		System.out.println(b);
		System.out.println(b.toString());

		//overrided toString() method
		A1 a=new A1(10,20);
		System.out.println(a.toString());	
	}
}
class A1{
	int x,y;
	A1(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "X value= " +x +", Y value= "+y ;
	}	
}
class B1{
	void m1() {
		System.out.println("Hi");
	}
	
}