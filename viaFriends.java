package Crush;

import java.util.Scanner;

public class viaFriends {

	public static void ViaFriends() {
		System.out.println("Be more specific.");
		System.out.println("1) I'm friend with my crush");
		System.out.println("2) We met through friends but i would'n say we are FRIENDS");
		System.out.println("0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("1) I'm friend with my crush");
			System.out.println("2) We met through friends but i would'n say we are FRIENDS");
			System.out.println("0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		
		if (r == '0') {
			seeingNoOne.SeeingNoOne();
		}
		else if (r == '1') {
			frGrTo.FrGrTo();
		}
		else if (r == '2') {
			System.out.println("Be more specific.");
			System.out.println("1) Me and my crush have a mutual friend");
			System.out.println("2) My crush is related to a friend of mine");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2' && r != '3' && r != '4') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				System.out.println("1) Me and my crush have a mutual friend");
				System.out.println("2) My crush is related to a friend of mine");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				frGrTo.FrGrTo();
			}
			else if (r == '2') {
				sibling.Sibling();
			}
		}
	}
}
