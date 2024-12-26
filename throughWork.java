package Crush;

import java.util.Scanner;

public class throughWork {

	public static void ThroughWork() {
		System.out.println("Do you fear being fired?\n1) Yes\n2) No\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Do you fear being fired?\n1) Yes\n2) No\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			seeingNoOne.SeeingNoOne();
		}
		else if (r == '1') {
			System.out.println("Don't tell them: there's a big chance it's against the work policy and you could get in big troubles. Better be safe if you need that job! xoxo");
		}
		else if (r == '2'){
			System.out.println("...u sure?\n1) Yeah\n2) No I actually need this job");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				System.out.println("Are you absolutely sure you don't need this job?\n1) Yep\n2) No I am not");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				hierarchy.Hierarchy();
			}
			else if (r == '2') {
				System.out.println("Don't tell them: there's a big chance it's against the work policy and you could get in big troubles. Better be safe if you need that job! xoxo");
			}
		}
	}
}
