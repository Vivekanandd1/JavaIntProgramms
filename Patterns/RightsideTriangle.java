package Patterns;

public class RightsideTriangle {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");// for every star on single line
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");// for every star on single line
			}
			System.out.println();
		}
	}

}
