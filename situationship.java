package Crush;

import java.util.Scanner;

public class situationship {

	public static void Situationship() {
		System.out.println("Ok so they're in a situationship.");
		System.out.println("What's their role in the situationship?");
		System.out.println("1) They're the one who won't commit and is dragging the other person along");
		System.out.println("2) They're being dragged along by the other person who won't commit\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("What's their role in the situationship?");
			System.out.println("1) They're the one who won't commit and is dragging the other person along");
			System.out.println("2) They're being dragged along by the other person who won't commit\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			sameOrMul.SameOrMul();
		}
		else if (r=='1'){
			System.out.println("Don't tell them unless you also want to be in a situationship. YOU PROBABLY DON'T WANT TO!");
		}
		else if (r=='2') {
			System.out.println("Tell them but it's likely that they'll be too blinded by the other person to reciprocate your feelings. Maybe try to help them if you can/want.");
		}
	}
}
