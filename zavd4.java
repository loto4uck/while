package whille;

import java.util.Scanner;

public class zavd4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 1;
		while (i < a) {
			i = i * 2;
		}
		if (i == a) {
			System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			}

}
