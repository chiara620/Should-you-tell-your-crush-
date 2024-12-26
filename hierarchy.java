package Crush;

import java.util.Scanner;

public class hierarchy {

	public static void Hierarchy() {
		System.out.println("Is your crush in the same level as you in the work hierarchy?\n1) Yes\n2) No\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Is your crush in the same level as you in the work hierarchy?\n1) Yes\n2) No\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			throughWork.ThroughWork();
		}
		else if (r == '1') {
			actually.Actually();
		}
		else if (r == '2'){
			System.out.println("Be more specific.");
			System.out.println("They're my superior.");
			System.out.println("I am their superior.");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				System.out.println("They're my superior.");
				System.out.println("I am their superior.");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				System.out.println("Do you just like them because you have a weird thing for autority figues?");
				System.out.println("...");
				System.out.println("...");
				System.out.println("...");
				System.out.println("Yeah you do.");
				System.out.println("Anyway, if you tell them there's a 1% chance you'll get a promotion and a 99% chance you'll be fired immediatly. Do your own math xoxo.");
			}
			else if (r == '2') {
				chance.Chance();
			}
		}
		
	}
}
