package whille;

import java.util.Scanner;

public class zavd2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 2;
		while (a % b != 0 ) {
			b++;
		}
		System.out.println(b);
	}

}
