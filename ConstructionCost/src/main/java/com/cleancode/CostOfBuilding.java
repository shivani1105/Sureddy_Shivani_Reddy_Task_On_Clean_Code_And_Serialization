package com.cleancode;

import java.util.Scanner;

public class CostOfBuilding {
	
	public int materialStandard;
	public int areaOfHouse;
	
	public CostOfBuilding(int ms,int area)
	{
		materialStandard=ms;
		areaOfHouse=area;
	}
	
	public int constructionCost(int fa) {
		
		if(materialStandard==1)
		{
			return 1200*areaOfHouse;
		}
		if(materialStandard==2)
		{
			return 1500*areaOfHouse;
		}
		if(materialStandard==3)
		{
			if(fa==0)
				return 1800*areaOfHouse;
			else
				return 2500*areaOfHouse;
		}
		
		return 0;
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n '1' for standard materials \n '2' for above standard materials \n '3' for high standard materials");
		int ch=sc.nextInt();
		System.out.println("Do you want fully automated house:\n '1' for Yes \n '0' for No");
		int f=sc.nextInt();
		System.out.println("Enter the area of house in square feet");
		int area=sc.nextInt();
		CostOfBuilding cb=new CostOfBuilding(ch,area);
		int cost=cb.constructionCost(f);
		System.out.println("The cost for construction of building is "+cost);
		sc.close();
		
	}

}
