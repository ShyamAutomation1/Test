package Test1;

public class Tets {

	public static void main(String[] args) {

		double a[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		if (a.length == a[0].length) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		double b[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

		if (b.length == b[0].length) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}

//		System.out.print(a[0][0] + " ");
//		System.out.print(a[0][1] + " ");
//		System.out.print(a[0][2] + " ");
//		System.out.println(a[0][3] + " ");
//
//		System.out.print(a[1][0] + " ");
//		System.out.print(a[1][1] + " ");
//		System.out.print(a[1][2] + " ");
//		System.out.print(a[1][3] + " ");
//		
//		System.out.print(a[2][0] + " ");
//		System.out.print(a[2][1] + " ");
//		System.out.print(a[2][2] + " ");
//		System.out.print(a[2][3] + " ");

//		double sum = 0;
//		int count = 0;
//
//		for (int i = 0; i < a.length; i++) {   // 0 1 2
//
//			for (int j = 0; j <= a.length; j++) {
////				System.out.print(a[i][j] + " ");
//				sum = sum + a[i][j];
//
//			}
//			System.out.println();
//
//			count = count + 1; // 1 2 3
//
//			if (count == 3) {
//
//				System.out.println(sum);
//				sum = 0;
//			}

//		}
