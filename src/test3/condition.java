package test3;

public class condition {

	public static void main(String[] args) {
		int monthNumber=15;
		
		if(monthNumber>=1 && monthNumber <=3) {
		System.out.println("This is a Quarter 1");
		}else if (monthNumber>=4 && monthNumber <=6) {
		System.out.println("This is a Quarter 2");
		} else if (monthNumber>=7 && monthNumber <=9) {
			System.out.println("This is a Quarter 3");
		}else if (monthNumber>=10 && monthNumber <=12) {
				System.out.println("This is a Quarter 4");
		}else {
					System.out.println("This is unknown month");
				}
			

	}

}
