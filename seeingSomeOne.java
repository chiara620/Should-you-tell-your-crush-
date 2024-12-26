package Crush;

import java.util.Scanner;

public class seeingSomeOne {
	
	public static void SeeingSomeOne() {
		System.out.println("What do you mean by \"seeing?\"");
		System.out.println("1) They're casually dating someone");
		System.out.println("2) They're in a relationship");
		System.out.println("3) They're hooking up with someone");
		System.out.println("0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '3' && r != '0') {
			System.out.println("Your answer should be either 1, 2, 3 or 0. Retry.");
			System.out.println("What do you mean by \"seeing?\"");
			System.out.println("1) They're casually dating someone");
			System.out.println("2) They're in a relationship");
			System.out.println("3) They're hooking up with someone");
			System.out.println("0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			isSeeing.IsSeeing();
		}
		else if (r=='1'){
			System.out.println("Is it REALLY casual?\n1) Yes\n2) No maybe not");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				sameOrMul.SameOrMul();
			}
			else if (r=='2') {
				System.out.println("Don't tell them. If things are meant to be, eventually they'll break up and then you'll have a chance... in that case come and retake this test! xoxo");
			}
			
		}
		else if (r=='2') {
			System.out.println("Don't tell them. If things are meant to be, eventually they'll break up and then you'll have a chance... in that case come and retake this test! xoxo");
		}
		else if (r=='3'){
			sameOrMul.SameOrMul();
		}
	}
}
