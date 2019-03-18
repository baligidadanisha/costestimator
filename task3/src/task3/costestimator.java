package task3;

import java.util.*;
public class costestimator {

	 int material;
	 double areaofhouse;
	 boolean isautomated;
	 
	 public costestimator(int material,double areaofhouse,boolean isautomated)
	 {
		 this.material=material;
		 this.areaofhouse=areaofhouse;
		 this.isautomated=isautomated;
	 }
	 public double cost()
	 {
		 int cost=0;
		 if(material==0)
			 cost=1200;
		 else if(material==1)
			 cost=1000;
		 else if(material==2&&isautomated)
			 cost=2500;
		 else
			 cost=1800;
		 return areaofhouse*cost;
			 
	 }
	 
	public static void main(String[] args) {
		Scanner K=new Scanner(System.in);
		int material=K.nextInt();
		double areaofhouse=K.nextDouble();
		boolean isautomated=K.nextBoolean();
		costestimator c=new costestimator(material,areaofhouse,isautomated);
		System.out.println(c.cost());

	}

}
