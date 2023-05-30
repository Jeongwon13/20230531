package pkg2;

import java.util.Scanner;

public class Main {


	public String solution(String str) {
		String answer = "YES";

		String tmp = new StringBuilder(str).reverse().toString();
		
		if(!str.equalsIgnoreCase(tmp)) answer = "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		
		System.out.println(T.solution(str));
	}

}
