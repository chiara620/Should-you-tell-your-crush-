package Crush;

import java.util.Scanner;

public class online {

	public static void Online() {
		System.out.println("Did you meet them on a dating app?\n1) Yes\n2) No\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Did you meet them on a dating app?\n1) Yes\n2) No\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			seeingNoOne.SeeingNoOne();
		}
		else if (r == '1') {
			System.out.println("Yeah tell them. It's always nice to be clear about your feelings xoxo");
		}
		else if (r == '2'){
			System.out.println("Have you ever met in real life?\n1) Yes\n2) No");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				System.out.println("Have you ever met in real life?\n1) Yes\n2) No");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				System.out.println("Tell them! Lots of relationships start this way. xoxo");
			}
			else if (r == '2') {
				System.out.println("Tell them but there's a chance you won't be attracted to them in real life, therefore make sure to leave an open path to backtrack.");
			}
		}
	}
}
