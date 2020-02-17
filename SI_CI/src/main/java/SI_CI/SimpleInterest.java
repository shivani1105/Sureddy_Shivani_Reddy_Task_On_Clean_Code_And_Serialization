package SI_CI;

import java.util.Scanner;

public class SimpleInterest {
	
	public double principleAmt;
	public double rateOfInterest;
	public double timePeriod;
	
	public SimpleInterest(double pAmt,double rate,double time) {
		
		principleAmt=pAmt;
		rateOfInterest=rate;
		timePeriod=time;
		
	}
	
	public void calculateSI() {
		
		double si=(principleAmt*rateOfInterest*timePeriod)/100;
		System.out.println("the simple interest is "+si);
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle amount,rate of interest and time period");
		double pa=sc.nextDouble();
		double roi=sc.nextDouble();
		double tp=sc.nextDouble();
		SimpleInterest s=new SimpleInterest(pa,roi,tp);
		s.calculateSI();
		sc.close();
		
	}

}
