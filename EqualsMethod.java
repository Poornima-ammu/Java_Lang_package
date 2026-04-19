package JavaLangPackage;

public class EqualsMethod {
	public static void main(String[]args) {
		String s1=new String("Poornima");
		String s2=new String("Poornima");
		System.out.println("In String == is refernce comparison so s1==s2 is "+ (s1==s2));
		System.out.println("In String equals() is content comparison Because the equals() method is overriden in string class .so s1.equals(s2) is "+ (s1.equals(s2)));

		A a1=new A(10);
		A a2=new A(10);
		A a3=a1;
		System.out.println("The value of a1 ==a2 is " +( a1==a2));
		System.out.println(" Inside the object class equals() method internally calls the == .So a1.equals(a2) is "+(a1.equals(a2)));
		System.out.println("The value of a1 ==a3 is " +( a1==a3));
		System.out.println("a1.equals(a3) is "+(a1.equals(a3)));
	
		// To Make content comparision of equals method
			B b1=new B(10,"Poornima");
			B b2=new B(10,"Poornima");
			System.out.println("The value of b1 ==b2 is " +( b1==b2));
			System.out.println("The value of b1.equals(b2) [Content comparision ] is " +( b1.equals(b2)));
	}
}
class A{
	int val;
	A(int val){
		this.val=val;
	}
	void m1() {
		System.out.println("hi");
	}
}
class B{
	int id;
	String name;
	B(int id,String name){
		this.id=id;	
		this.name=name;
	}@Override
	public boolean equals(Object obj) {
	    int bid=this.id;
	    String bname=this.name;
	    B b2=(B)obj;
	    int b2id=b2.id;
	    String b2name=b2.name;
	    if((bid==b2id) && bname==b2name) {
	    	return true;
	    }
	    return false;
	}

}
