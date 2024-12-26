package Crush;

import java.util.Scanner;

public class howSerious {
	
	public static void HowSerious() {
		System.out.println("How serious was it?");
		System.out.println("1) they went on one bad date and are not attracted to each other at all");
		System.out.println("2) they dated for a couple of weeks but didn't ever get serious");
		System.out.println("3) they dated very seriously: met each other parents, over 3 months, made future plans, maybe have a kid and/or pet together");
		System.out.println("0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r!= '3' && r != '0') {
			System.out.println("Your answer should be either 1, 2, 3 or 0. Retry.");
			System.out.println("How serious was it?");
			System.out.println("1) they went on one bad date and are not attracted to each other at all");
			System.out.println("2) they dated for a couple of weeks but didn't ever get serious");
			System.out.println("3) they dated very seriously: met each other parents, over 3 months, made future plans, maybe have a kid and/or pet together");
			System.out.println("0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		
		if (r == '0') {
			yesSeen.YesSeen();
		}
		else if (r == '1') {
			System.out.println("Yeaaah you should tell them... as long as you are ok with the fact that getting together with your crush and/or potentially breaking up with them could change the dynamics of the friend group forever and ever break it up. What do you value more? Think about it. xoxo");
		}
		else {
			fucked.Fucked();
		}
	}

}
