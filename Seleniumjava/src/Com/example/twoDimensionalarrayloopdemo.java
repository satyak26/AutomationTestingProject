package Com.example;

public class twoDimensionalarrayloopdemo {

	public static void main(String[] args) {
		System.out.println("************** loop Program-1 **************");

		int [][]a = new int[3][2]; /* c[3][2] */
			a[0][0] = 5;
			a[0][1] = 10;
			
			a[1][0] = 15;
			a[1][1] = 20;
			
			a[2][0] = 25;
			a[2][1] = 30;
			
			int size = 0;
			
			for (int i=0;i<a.length;i++) {
				size += a[i].length;
				for(int j=0;j<a[i].length;j++) {

					System.out.print(a[i][j]+" ");
				}
				System.out.println();
				System.out.println("Each Row Element Size: "+a[i].length);
			}
				
//			System.out.println("Total no of Rows : "+a.length);
//			System.out.println("the no of values/elements/coulmns in 1st row: "+a[0].length);
//			System.out.println("the no of values/elements/coulmns in 2nd row: "+a[1].length);
//			System.out.println("the no of values/elements/coulmns in 3rd row: "+a[2].length);


			System.out.println("Overall elements size: "+size);
	}

}


//Program 2
//int[][] arr = { { 1, 2 }, { 3, 4 } };
//
//for (int i = 0; i < 2; i++)
//    for (int j = 0; j < 2; j++)
//        System.out.println("arr[" + i + "][" + j + "] = "
//                        + arr[i][j]);

//Program 3
/*int rows = 4;
int columns = 4;

int[][] array = new int[rows][columns];

int value = 1;
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns; j++) {
        array[i][j] = value;
        value++;
    }
}

System.out.println("The 2D array is: ");
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns; j++) {
        System.out.print(array[i][j] + " ");
    }
    System.out.println();
}*/