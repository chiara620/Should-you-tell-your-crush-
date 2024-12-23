package Crush;

import java.util.Scanner;

public class isSeeing {

	public static void IsSeeing() {
		
		System.out.println("Is your crush seeing someone?\n1) I don't know\n2) Yes\n3) No");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '3') {
			System.out.println("Your answer should be either 1, 2 or 3. Retry.");
			System.out.println("Is your crush seeing someone?\n1) I don't know\n2) Yes\n3) No");
			r = s.next().charAt(0);
		}
		if (r == '1') {
			System.out.println("Find out, then come back to retake the test! Good luck xoxo.");
		}
		else if (r == '2') {
			seeingSomeOne.SeeingSomeOne();
		}
		else {
			seeingNoOne.SeeingNoOne();
		}
	}
}
