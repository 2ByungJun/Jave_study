package chapter2;

import java.util.Scanner;

public class c2_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		var won = scanner.nextInt();
		var dal = (won/1100);
		
		System.out.println(won + "원은 $"+ (double)dal + "입니다.");
		scanner.close();
	}

}
