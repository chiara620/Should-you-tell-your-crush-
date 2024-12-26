package Crush;

import java.util.Scanner;

public class yesSeen {
	
	public static void YesSeen() {
		
		System.out.println("Define \"Seeing\".");
		System.out.println("1) Your crush was casually hooking up with someone else in the friend group");
		System.out.println("2) Your crush was dating someone else in the friend group");
		System.out.println("0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Define \"Seeing\".");
			System.out.println("1) Your crush was casually hooking up with someone else in the friend group");
			System.out.println("2) Your crush was dating someone else in the friend group");
			System.out.println("0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		
		if (r == '0') {
			frGrTo.FrGrTo();
		}
		else if (r == '1') {
			System.out.println("Yeaaah you should tell them... as long as you are ok with the fact that getting together with your crush and/or potentially breaking up with them could change the dynamics of the friend group forever and ever break it up. What do you value more? Think about it. xoxo");
		}
		else if (r == '2') {
			howSerious.HowSerious();
		}
	}

}
