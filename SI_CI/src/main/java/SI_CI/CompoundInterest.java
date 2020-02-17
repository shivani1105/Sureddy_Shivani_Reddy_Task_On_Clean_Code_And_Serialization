package SI_CI;

import java.util.Scanner;

public class CompoundInterest {
	
	public double principleAmt;
	public double rateOfInterest;
	public double timePeriod;
	
	public CompoundInterest(double pAmt,double rate,double noOfYears)
	{
	    principleAmt=pAmt;
	    rateOfInterest=rate;
	    timePeriod=noOfYears;
    }
	
	public void calculateCI() {
		
		double amount=0,t=1;
        rateOfInterest=(1+rateOfInterest/100);
        for(int i=0;i<timePeriod;i++)
          t*=rateOfInterest;
	    amount=principleAmt*t;
        double ci=amount-principleAmt;
        System.out.println("the compound interest is "+ci);
        
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle amount,rate of interest and no of years");
		double pa=sc.nextDouble();
		double roi=sc.nextDouble();
		double noy=sc.nextDouble();
		CompoundInterest c=new CompoundInterest(pa,roi,noy);
		c.calculateCI();
		sc.close();
	}
	

}
