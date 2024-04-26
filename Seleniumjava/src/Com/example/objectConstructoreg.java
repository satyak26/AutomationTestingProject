package Com.example;

public class objectConstructoreg {
		int i;
		int j;
	public objectConstructoreg() {
		i=10;
		j=20;
	}
	public objectConstructoreg(int i, int j) {
		this.i=i;
		this.j=j;
	}
	public static void main(String[] args) {
//		objectConstructoreg t1  = new objectConstructoreg();
//		objectConstructoreg t2  = new objectConstructoreg();
//		objectConstructoreg t3  = new objectConstructoreg();
//		System.out.println(t1.hashCode());
//		System.out.println(t2.hashCode());
//		System.out.println(t3.hashCode());
		objectConstructoreg t1  = new objectConstructoreg();
		objectConstructoreg t2  = new objectConstructoreg(15,25);
		objectConstructoreg t3  = new objectConstructoreg(80,35);
		System.out.println(t1.add());
		System.out.println(t2.add());
		System.out.println(t3.add());
	}
public int add() {
	return i+j;
}
		
	}

