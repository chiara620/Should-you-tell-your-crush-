package Crush;

import java.util.Scanner;

public class seeingNoOne {
	
	public static void SeeingNoOne() {
		System.out.println("How do you know your crush?\n1) Online\n2) Through in-person circumstances\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("How do you know your crush?\n1) Online\n2) Through in-person circumstances\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			isSeeing.IsSeeing();
		}
		else if (r == '1') {
			System.out.println("Are they... a celebrity?\n1) Yes\n2) No");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2");
				System.out.println("Are they a celebrity?\n1) Yes\n2) No");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				System.out.println("Yup tell them. Have fun. They most definitely won't read it anyway.");
			}
			else if (r == '2') {
				online.Online();
			}
		}
		else if (r == '2'){
			System.out.println("Where?\n1) Via friends\n2) Through school\n3) Through work\n4) At a third space (coffee shop, bar, airport, supermarket...");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2' && r != '3' && r != '4') {
				System.out.println("Your answer should be either 1, 2, 3 or 4. Retry.");
				System.out.println("Where?\n1) Via friends\n2) Through school\n3) Through work\n4) At a third space (coffee shop, bar, airport, supermarket...");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				viaFriends.ViaFriends();
			}
			else if (r == '2') {
				throughSchool.ThroughSchool();
			}
			else if (r == '3') {
				throughWork.ThroughWork();
			}
			else if (r == '4') {
				System.out.println("Tell them!! You've quite literally nothing to lose. Good luck! xoxo");
			}
		}
	}
}
