package construction.week4_c;

import java.util.Scanner;

//simple intrest

public class Week4_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double pr, rate, t, sim;
	        Scanner sc=new Scanner (System. in);
	        System.out.format("%s","Enter the amount:");
	        pr=sc.nextDouble();;
	        System. out. format("%s","Enter the No.of years:");
	        t=sc.nextDouble();;
	        System. out. format("%s","Enter the Rate of  interest");
	        rate=sc.nextDouble();
	        sim=(pr * t * rate)/100;
	        System.out.format("%s %.2f","Simple Interest=",sim);
	}

}
