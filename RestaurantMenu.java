package com.smshahnewaz;

import java.util.*;
public class RestaurantMenu {
	static Scanner sc= new Scanner(System.in);
	
	public static void Pizza() {
			System.out.println("             MENU         ");
			System.out.println("    Pizza(s)        Pirce(s):");
			System.out.println("1.Pepperoni          $22.99 \n2.Mushrooms          $25.99 \n3.Sausage            $21.99\n4.Bacon              $23.99\n5.Extra Cheese       $18.99\n6.Balck Olives       $21.99\n7.Green peppers      $22.99\n");
			System.out.print("Enter selction :");
			int choice_pizza=sc.nextInt();
			switch(choice_pizza){
				case 1:
					System.out.print("Pizza type     : Pepperoni.\nEnter quantity : ");
					int q1=sc.nextInt();
					for(int i=0; i<=q1;) {
						float price=(float) (q1*22.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}break;
				case 2:
					System.out.print("Pizza type     : Mushrooms.\nEnter quantity : ");
					int q2=sc.nextInt();
					for(int i=0; i<=q2;) {
						float price=(float) (q2*25.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}break;
				case 3:
					System.out.print("Pizza type     : Sausage.\nEnter quantity : ");
					int q3=sc.nextInt();
					for(int i=0; i<=q3;) {
						float price=(float) (q3*21.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);					
						break;
					}						break;

				case 4:
					System.out.print("Pizza type     : Bacon.\nEnter quantity : ");
					int q4=sc.nextInt();
					for(int i=0; i<=q4;) {
						float price=(float) (q4*23.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}						break;


				case 5:
					System.out.print("Pizza type     : Extra Cheese.\nEnter quantity : ");
					int q5=sc.nextInt();
					for(int i=0; i<=q5;) {
						float price=(float) (q5*18.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);						
						break;
					}						break;


				case 6:
					System.out.print("Pizza type     : Balck Olives.\nEnter quantity : ");
					int q6=sc.nextInt();
					for(int i=0; i<=q6;) {
						float price=(float) (q6*21.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);						
						break;
					}						break;


				case 7:
					System.out.print("Pizza type     : Green peppers.\nEnter quantity : ");
					int q7=sc.nextInt();
					for(int i=0; i<=q7;) {
						float price=(float) (q7*22.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);						
						break;
					}
					break;
					default: 
						System.out.print("Please select from menu! ");
			}
		}
	public static void Drinks() {
			System.out.println("\n");
			System.out.println("             MENU         ");
			System.out.println("    Drink(s)       Pirce(s):");
			System.out.println("1.Wine              $25.99 \n2.Beer              $11.99 \n3.Lemonade          $5.99\n4.Icead Tea         $4.99\n5.Juice             $3.99\n6.Sprinkle Water    $3.99\n7.Water             $1.99\n");
			System.out.print("Enter selction :");
			int choice_pizza=sc.nextInt();
			switch(choice_pizza){
				case 1:
					System.out.print("Drinks type     : Wine.\nEnter quantity : ");
					int q1=sc.nextInt();
					for(int i=0; i<=q1;) {
						float price=(float) (q1*25.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}
					break;
				case 2:
					System.out.print("Drinks type     : Beer.\nEnter quantity : ");
					int q2=sc.nextInt();
					for(int i=0; i<=q2;) {
						float price=(float) (q2*11.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}
					break;

				case 3:
					System.out.print("Drinks type     : Lemonade.\nEnter quantity : ");
					int q3=sc.nextInt();
					for(int i=0; i<=q3;) {
						float price=(float) (q3*5.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}
					break;

				case 4:
					System.out.print("Drinks type     : Iced Tea .\nEnter quantity : ");
					int q4=sc.nextInt();
					for(int i=0; i<=q4;) {
						float price=(float) (q4*4.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}
					break;

				case 5:
					System.out.print("Pizza type     : Juice.\nEnter quantity : ");
					int q5=sc.nextInt();
					for(int i=0; i<=q5;) {
						float price=(float) (q5*3.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}
					break;

				case 6:
					System.out.print("Drinks type     : Hot Chocolate.\nEnter quantity : ");
					int q6=sc.nextInt();
					for(int i=0; i<=q6;) {
						float price=(float) (q6*3.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}
					break;

				case 7:
					System.out.print("Drinks type     : Water.\nEnter quantity : ");
					int q7=sc.nextInt();
					for(int i=0; i<=q7;) {
						float price=(float) (q7*1.99);
						System.out.println("Before Tax     : "+price);
						float sales_tax=(int) (0.089*price);
						float total=sales_tax+price;
						System.out.println("After Tax      : "+total);
						break;
					}
					default: 
						System.out.print("Please select from menu! ");
			}
		}
	public static void main(String[] args) {
		System.out.println("        Restaurant & Bar        ");
		Pizza();
		Drinks();
		System.out.println("\nEnter Sellection  :\n1.Chekcout  \n2.Continue Shopping");
		int selection=sc.nextInt();
		switch(selection) {
		case 1:
			System.out.println("\n             CHECKOUT               ");
			System.out.print("Item Price(s)  :$");
			float pz= sc.nextFloat();
			System.out.print("Item Price(s)  :$");
			float pd=sc.nextFloat();
			System.out.print("Total Prices  :$"+pz+pd);
			break;
		case 2:
			Pizza();
			Drinks();
			System.out.println("\n             CHECKOUT               ");
			System.out.print("Item Price(s)  :$");
			float pz1= sc.nextFloat();
			System.out.print("Item Price(s)  :$");
			float pd1=sc.nextFloat();
			System.out.print("Total Prices  :$"+pz1+pd1);
			break;
			default:
				System.out.println();
		}
	}


}
