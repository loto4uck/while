package whille;

import java.util.Scanner;

public class zavd1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		while (b * b <= a){
		    System.out.println(b * b);
		    b++;
		}
	}

}
