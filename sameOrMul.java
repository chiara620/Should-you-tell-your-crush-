package Crush;

import java.util.Scanner;

public class sameOrMul {

	public static void SameOrMul() {
		
		System.out.println("Is it always the same person or are there multiple people?\n1) Same person\n2) Multiple People\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Is it always the same person or are there multiple people?\n1) Same person\n2) Multiple People\n0) back");
			r = s.next().charAt(0);
		}
		if (r == '0') {
			seeingSomeOne.SeeingSomeOne();
		}
		else if (r=='1'){
			situationship.Situationship();
		}
		else if (r=='2') {
			System.out.println("You should tell them but it depends what you want out of this. Your crush may not want a serious relationship at the moment, are you ok with this? Be careful! xoxo");
		}
	}
}
