package Com.example;

public class Jaggerydimesionalloopdemo {

	public static void main(String[] args) {
		int [][]a = {{1,2,3},{9,8},{8,8,6,4,6}}; 
		
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {

				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			System.out.println("Each Row Element Size: "+a[i].length);
		}
	}

}
