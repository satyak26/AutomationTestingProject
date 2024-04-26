package Com.example;

public class twodimensionalforeachdemo {

	public static void main(String[] args) {
		// create a 2d array
        int[][] a = {{10,20,30,40,50},{11,22,33,44,55},{45,55,65,75,85},{9,19,29,39,49}};
        // first for...each loop access the individual array
        // inside the 2d array
        for (int[] b: a) {	
            // second for...each loop access each element inside the row
            for (int c: b) {
          	  System.out.print(" " + c);  
            }
            System.out.println();
        }
	}
}
