package Crush;

import java.util.Scanner;

public class stillFeelings {

	public static void StillFeelings() {
		System.out.println("Do either of them still have feelings for each other?\n1) Yes/idk\n2) No\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Do either of them still have feelings for each other?\n1) Yes/idk\n2) No\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		
		if (r == '0') {
			fucked.Fucked();
		}
		else if (r == '1') {
			outweight.Outweight();
		}
		else if (r == '2') {
			System.out.println("...u sure?\n1) Yes\n2) No");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				System.out.println("...u sure?\n1) Yes\n2) No");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				System.out.println("Yeaaah you should tell them... as long as you are ok with the fact that getting together with your crush and/or potentially breaking up with them could change the dynamics of the friend group forever and ever break it up. What do you value more? Think about it. xoxo");
			}
			else if (r == '2') {
				outweight.Outweight();
			}
		}
	}
}
