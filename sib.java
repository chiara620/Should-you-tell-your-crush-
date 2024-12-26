package Crush;

import java.util.Scanner;

public class sib {
	public static void Sib() {
		
		System.out.println("Do you think you like them just because they're your friend sibling/very close cousin/something like this?\n1) Yes\n2) No\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Do you think you like them just because they're your friend sibling/very close cousin/something like this?\n1) Yes\n2) No\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			sibling.Sibling();
		}
		else if (r == '1') {
			System.out.println("DON'T TELL THEM. Trust me, you'll outgrow it.");
		}
		else if (r == '2') {
			System.out.println("Does the prospect of being with your crush outweigh the fact that you may ruin/make awkward your relationshi with your friend?\n1) Yes\n2) No");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				System.out.println("Does the prospect of being with your crush outweigh the fact that you may ruin/make awkward your relationshi with your friend?\n1) Yes\n2) No");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				System.out.println("uuuuhhhhhhhhh tell them but uhhhhhh you know uuuuhhhh it may be a mess. You should tell them tho, just be ready.");
			}
			else if (r == '2') {
				System.out.println("Don't tell them, you clearly value your friendship more.");
			}
		}
	}
}
