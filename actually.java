package Crush;

import java.util.Scanner;

public class actually {

	public static void Actually() {
		System.out.println("Do you actually like them or do you only have a crush on them because you're in forced proximity with them?");
		System.out.println("1) No i actually like them");
		System.out.println("I think it's the forced proximity now that I think about it...");
		System.out.println("0) back");
		
		Scanner s = new Scanner(System.in);
		char r = s.next().charAt(0);
		while (r != '1' && r != '2' && r != '0') {
			System.out.println("Your answer should be either 1, 2 or 0. Retry.");
			System.out.println("Do you actually like them or do you only have a crush on them because you're in forced proximity with them?");
			System.out.println("1) No i actually like them");
			System.out.println("I think it's the forced proximity now that I think about it...");
			System.out.println("0) back");
			s.nextLine();
			r = s.next().charAt(0);
		}
		if (r == '0') {
			throughSchool.ThroughSchool();
		}
		else if (r == '1') {
			System.out.println("Are you saying that you would have a crush on this person even if you didn't have to see them everyday?\n1) Yes\n2) Nah");
			s.nextLine();
			r = s.next().charAt(0);
			while (r != '1' && r != '2') {
				System.out.println("Your answer should be either 1 or 2. Retry.");
				System.out.println("Are you saying that you would have a crush on this person even if you didn't have to see them everyday?\n1) Yes\n2) Nah");
				s.nextLine();
				r = s.next().charAt(0);
			}
			if (r == '1') {
				System.out.println("Tell them! May be wonderful may be a disaster but always be positive xoxo.");
			}
			else if (r == '2') {
				System.out.println("Don't tell them: you're going to ruin the purpose they serve in your life and it probably would'n work annyway.");
			}
		}
		else if (r == '2') {
			System.out.println("Don't tell them: you're going to ruin the purpose they serve in your life and it probably would'n work annyway.");
		}
	}
}
