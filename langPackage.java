package java8amproject;

public class langPackage {
	public static void main(String []args) {
		A a1=new A();
		A a2=new A();
		A a3=new A();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
	}
}
class A{
	
	public int hashCode() {
	System.out.println("Hi");
	return 20;
	
}
}