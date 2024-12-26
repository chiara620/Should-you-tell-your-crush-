package Crush;

import java.util.Scanner;

public class outweight {
	
	public static void Outweight() {
		System.out.println("Does the potential of getting together with your crush and/or potentially breaking up outweigh the risk of potentially changing the dynamic of the friend group forever?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		System.out.println("0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Does the potential of getting together with your crush and/or potentially breaking up outweigh the risk of potentially changing the dynamic of the friend group forever?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			System.out.println("0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		
		if (r == '0') {
			stillFeelings.StillFeelings();
		}
		else if (r == '2') {
			System.out.println("Don't tell them. Based on your replies, it seems like the best thing to do. Stay strong xoxo");
		}
		else if (r == '1') {
			System.out.println("Tell them. I really hope everything goes well! xoxo");
		}
	}
}
