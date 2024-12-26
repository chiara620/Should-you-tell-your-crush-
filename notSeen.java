package Crush;

import java.util.Scanner;

public class notSeen {

	public static void NotSeen() {
		System.out.println("Does anyone else in your friend gruoup like your crush?\n1) Yes\n2) No\n0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Does anyone else in your friend gruoup like your crush?\n1) Yes\n2) No\n0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		
		if (r == '0') {
			frGrTo.FrGrTo();
		}
		else if (r == '1') {
			System.out.println("Is there any chance that your crush could actually like you back?\n1) Yes\n2) No");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				System.out.println("Is there any chance that your crush could actually like you back?\n1) Yes\n2) No");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				outweight.Outweight();
			}
			else if (r == '2') {
				System.out.println("I'll be honest: if I were you I wouldn't tell them. But I'm not you, and maybe you have bigger reasons we didn't disclose. In short: you can tell them if you really want to but it's unlikely it'll end well; you may ruin not one but two relationships in your life.");
			}
		}
		else if (r == '2') {
			outweight.Outweight();
		}
	}
}
