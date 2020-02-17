package construction.week4_c;

import java.util.Scanner;

//Compound intrest

public class Week4_c {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double pr, rate, t, com;
	        Scanner sc=new Scanner (System. in);
	        System.out.format("%s","Enter the amount:");
	        pr=sc.nextDouble();;
	        System. out. format("%s","Enter the No.of years:");
	        t=sc.nextDouble();;
	        System. out. format("%s","Enter the Rate of  interest");
	        rate=sc.nextDouble();
	        com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	        System.out. format("%s  %.2f","Compound Interest=",com);
	}

}
