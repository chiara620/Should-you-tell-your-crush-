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
			r = s.next().charAt(0);
		}
		if (r == '0') {
			isSeeing.IsSeeing();
		}
		else if (r == '1') {
			//
		}
		else if (r == '2'){
			System.out.println("Where?\n1) Via friends\n2) Through school\n3) Through work\n4) At a third space (coffee shop, bar, airport, supermarket...");
			r = s.next().charAt(0);
			while (r != '1' && r != '2' && r != '3' && r != '4') {
				System.out.println("Your answer should be either 1, 2, 3 or 4. Retry.");
				System.out.println("Where?\n1) Via friends\n2) Through school\n3) Through work\n4) At a third space (coffee shop, bar, airport, supermarket...");
				r = s.next().charAt(0);
			}
			if (r == '1') {
				viaFriends.ViaFriends();
			}
			else if (r == '2') {
				//
			}
			else if (r == '3') {
				//
			}
			else if (r == '4') {
				//
			}
		}
	}
}
