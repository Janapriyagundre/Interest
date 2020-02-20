
public class Main_class {

	public static void main(String[] args) {
		Building_cost_Estimation object1=new Building_cost_Estimation();
		int price=object1.buildCost("standard house",20);
		System.out.println("the cost price for house is :"+price);
		Calculate_interest object2=new Calculate_interest();
		int calculation=object2.Simple_interest_calculation(1000,6,2);
		System.out.println("the value of interest is :"+calculation);
	

	}

}
