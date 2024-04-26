package Com.example;

public class threearrayusingforeachdemo {

	public static void main(String[] args) {
		// create a 3d array
        int[][][] a = {{{1, 2, 3}, {4, 5, 6}}, 
            {{24, 26, 28, 30},{70},{51, 81}}};
        // for..each loop to iterate through elements of 3d array
        for (int[][] b: a) {	
            for (int[] c: b) {
                for(int d: c) {
                	  System.out.print(" " + d);
                }
                System.out.println();
            }
        }
    }
	}

