package Crush;

import java.util.Scanner;

public class chance {

	public static void Chance() {
		System.out.println("Is there any chance at all that your crush actually likes you or is this just some sick power play that will make your crush incredibly uncomfortable for the rest of their limited time working there before they inevitably resign?");
		System.out.println("1) Yeah I think they fancy me");
		System.out.println("2) Nope it's not mutual I fear");
		System.out.println("0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Is there any chance at all that your crush actually likes you or is this just some sick power play that will make your crush incredibly uncomfortable for the rest of their limited time working there before they inevitably resign?");
			System.out.println("1) Yeah I think they fancy me");
			System.out.println("2) Nope it's not mutual I fear");
			System.out.println("0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		
		if (r == '0') {
			hierarchy.Hierarchy();
		}
		else if (r == '1') {
			System.out.println("HR will definitely know about this and you risk your position buttttt you do you I guess.");
		}
		else if (r == '2'){
			System.out.println("Don't tell them. Have them moved if you can and suck it up if you can't.");
		}
			
	}
}
