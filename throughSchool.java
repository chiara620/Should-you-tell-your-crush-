package Crush;

import java.util.Scanner;

public class throughSchool {

	public static void ThroughSchool() {
		System.out.println("Do you see your crush often?\n1) Yes (like everyday or every other day for a significant amount of time)\n2) No\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Do you see your crush often?\n1) Yes (like everyday or every other day for a significant amount of time)\n2) No\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			seeingNoOne.SeeingNoOne();
		}
		else if (r == '1') {
			actually.Actually();
		}
		else if (r == '2'){
			System.out.println("Yeah you should tell him; you've nothing to lose! xoxo");
		}

	}
}
