package DAY2;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to demonstrate nested loops
				// program to print the multiplication tables in a given range by using nested
				// for loop
				int beg=10;
				int end=20;

				for (int i = beg; i <= end; i++) {
					for (int j = 1; j <= 10; j++) {
						System.out.println(i + "*" + j + "= " + i * j);
					}
					System.out.println();

				}

			}
		
	

}
