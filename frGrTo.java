package Crush;

import java.util.Scanner;

public class frGrTo {
	
	public static void FrGrTo() {
		
		System.out.println("Are you and your crush in a friend group together?");
		System.out.println("1) No, we are friends 1 on 1");
		System.out.println("2) Yes");
		System.out.println("0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Are you and your crush in a friend group together?");
			System.out.println("1) No, we are friends 1 on 1");
			System.out.println("2) Yes");
			System.out.println("0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		
		if (r == '0') {
			viaFriends.ViaFriends();
		}
		
		else if (r == '1') {
			System.out.println("Tell them but be mentally prepared: it may ruin your friendship if he doesn't like you back. I'd say take the risk tho! xoxo");
		}
		else if (r == '2') {
			System.out.println("Was your crush ever seeing someone else in your friend group?\n1) Yes\n2) No");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				System.out.println("Was your crush ever seeing someone else in your friend group?\n1) Yes\n2) No");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				yesSeen.YesSeen();
			}
			else if (r == '2') {
				notSeen.NotSeen();
			}
		}
	}

}
