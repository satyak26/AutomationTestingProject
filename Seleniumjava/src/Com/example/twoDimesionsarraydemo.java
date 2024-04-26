package Com.example;

public class twoDimesionsarraydemo {

	public static void main(String[] args) {
		
	System.out.println("************** Program-1 **************");

	int [][]a = new int[3][2]; /* c[3][2] */
		a[0][0] = 5;
		a[0][1] = 10;
		a[1][0] = 15;
		a[1][1] = 20;
		a[2][0] = 25;
		a[2][1] = 30;
		System.out.println("Total no of Rows : "+a.length);
		System.out.println("the no of values/elements/coulmns in 1st row: "+a[0].length);
		System.out.println("the no of values/elements/coulmns in 2nd row: "+a[1].length);
		System.out.println("the no of values/elements/coulmns in 3rd row: "+a[2].length);
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		
	System.out.println("************** Program-2 **************");
		int [][]b = {{5,10},{15,20},{25,30}}; /* c[3][2] */
							/*a[0][0] = 5; reference of 1st program
							  a[0][1] = 10;
							  a[1][0] = 15;
							  a[1][1] = 20;
							  a[2][0] = 25;
							  a[2][1] = 30;*/
		System.out.println("Total no of Rows : "+b.length);
		System.out.println("the no of values/elements/coulmns in 1st row: "+b[0].length);
		System.out.println("the no of values/elements/coulmns in 2nd row: "+b[1].length);
		System.out.println("the no of values/elements/coulmns in 3rd row: "+b[2].length);
		System.out.print(b[0][0]+" ");
		System.out.println(b[0][1]+" ");	
		System.out.print(b[1][0]+" ");
		System.out.println(b[1][1]);
		System.out.print(b[2][0]+" ");
		System.out.println(b[2][1]);
		
		System.out.println("************** Program-3 **************");
		
		int [][]c = {{5,10,15},{20,25,30}}; /* c[2][3] */
		System.out.println("Total no of Rows : "+c.length);
		System.out.println("the no of values/elements/coulmns in 1st row: "+c[0].length);
		System.out.println("the no of values/elements/coulmns in 2nd row: "+c[1].length);
		System.out.print(c[0][0]+" ");
		System.out.print(c[0][1]+" ");
		System.out.println(c[0][2]);
		System.out.print(c[1][0]+" ");
		System.out.print(c[1][1]+" ");
		System.out.println(c[1][2]);
		
		System.out.println("************** Program-4 **************");
		
		int [][]d = {{1,2,3},{9,8}}; 
		System.out.println("Total no of Rows: "+d.length);
		System.out.println("the no of values/elements/coulmns in 1st row: "+d[0].length);
		System.out.println("the no of values/elements/coulmns in 2nd row: "+d[1].length);
		System.out.print(d[0][0]+" ");
		System.out.print(d[0][1]+" ");
		System.out.println(d[0][2]);
		System.out.print(d[1][0]+" ");
		System.out.println(d[1][1]);
		
//		int[][] b = { {1, 2, 3, 4}, {5, 6, 7} };
//		System.out.println(b[1][2]); // Outputs 7
//		
//		int[][] c = { {1, 2, 3, 4}, {5, 6, 7} };
//		c[1][2] = 9;
//		System.out.println(c[1][2]); // Outputs 9 instead of 7		
//	
	}

}
