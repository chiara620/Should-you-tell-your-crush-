package Crush;

import java.util.Scanner;

public class sibling {

	public static void Sibling() {
		
		System.out.println("oh my god");
		System.out.println("Are they your friend's sibling/very close cousin/something like this?\n1) Yes\n2) Nope it's actually their parent (or this kind of relationship)\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Are they your friend's sibling/very close cousin/something like this?\n1) Yes\n2) Nope it's actually their parent (or this kind of relationship)\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			viaFriends.ViaFriends();
		}
		else if (r == '1') {
			System.out.println("oh my god");
			sib.Sib();
		}
		else if (r == '2') {
			System.out.println("You know, I'm not getting more involved in this. Good luck.");
		}
	}
}
