package Crush;

import java.io.IOException;
import java.util.Scanner;

public class fucked {

	public static void Fucked() {
		System.out.println("Let's see... is it fucked up for you to ask out your friend's ex?");
		Scanner s = new Scanner(System.in);
		
		System.out.println("How long has it been since they broke up? Tell me the number of months (full months, whole number).\nOnly the first input before a space will be considered valid.");
		int G = -1;
        while (G < 0) {
            if (s.hasNextInt()) {
                G = s.nextInt();
                
                if (G < 0) {
                    System.out.println("Your answer should be a number beetween 0 and... a very large positive number");
                    System.out.println("How long has it been since they broke up? Tell me the number of months.");
                }
            } 
            else {
                System.out.println("Your answer should be a number beetween 0 and... a very large positive number");
                System.out.println("How long has it been since they broke up? Tell me the number of months.");
            }
            s.nextLine();
        }
		
        if (G<2) {
        	System.out.println("No, it's too early and their relations is still fresh. You should wait at least 2 months since they broke up to even think about telling them. Wait until then and then come retake the test xoxo.");
        }
        else {
        	
        	System.out.println("How long have they been dating? Tell me the number of months (full months, whole number).\nOnly the first input before a space will be considered valid.");
			int D = -1;
	        while (D < 0) {
	            if (s.hasNextInt()) {
	                D = s.nextInt();
	                
	                if (D < 0) {
	                    System.out.println("Your answer should be a number beetween 0 and... a very large positive number");
	                    System.out.println("How long have they been dating? Tell me the number of months.");
	                }
	            } 
	            else {
	                System.out.println("Your answer should be a number beetween 0 and... a very large positive number");
	                System.out.println("How long have they been dating? Tell me the number of months.");
	            }
	            s.nextLine();
	        }
	        
			System.out.println("What's the level of frienship between you and the friend whose ex you wanna ask out? Give me a number from 1 to 10, where 1 is the minimum and 10 is \"I'd die for this person\".\nOnly the first input before a space will be considered valid.");
			int F = -1;
	        while (F < 1 || F > 10) {
	            if (s.hasNextInt()) {
	                F = s.nextInt();
	                
	                if (F < 1 || F > 10) {
	                    System.out.println("Your answer should be a number beetween 1 and 10. Retry.");
	                    System.out.println("What's the level of frienship? Give me a number from 1 to 10!");
	                }
	            } 
	            else {
	                System.out.println("Your answer should be a number beetween 1 and 10. Retry.");
	                System.out.println("What's the level of frienship? Give me a number from 1 to 10!");
	            }
	            s.nextLine();
	        }
	        
	        double T;
	        T=(D*F)/G;
	        int roundedT = (int)Math.round(T);
	        
	        if (roundedT <= G) {
	        	stillFeelings.StillFeelings();
	        }
	        else {
	        	System.out.println("You're nearly there. You probably should wait another " + (roundedT - G) + " months and then you can tell them. But before you do, come and retake the test! xoxo");
	        }
	    }
		
	}
}
