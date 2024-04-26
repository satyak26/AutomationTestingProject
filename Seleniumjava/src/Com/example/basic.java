package Com.example;

public class basic {
	
	public basic() {
		System.out.println("object created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println(i);
		basic d = new basic();
		System.out.println(d.add(i, 20));

	}
	 public int add(int a, int b) {
		int c = a+b;
	 return c;
	 }
}
