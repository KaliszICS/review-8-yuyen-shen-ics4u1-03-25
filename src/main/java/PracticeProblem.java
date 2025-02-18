public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(pluralize("carry"));
		System.out.println(pluralize("CARRY"));
		System.out.println(pluralize("monkey"));
		System.out.println(pluralize("MONKEY"));
		System.out.println(pluralize("wife"));
		System.out.println(pluralize("WIFE"));
		System.out.println(pluralize("desk"));
		System.out.println(pluralize("DESK"));
		System.out.println(min(3,5,7));
		System.out.println(min(10,5,0));
		System.out.println(min(90,5,45));
		System.out.println(isLeapYear(333));
		System.out.println(isLeapYear(40));
		System.out.println(isLeapYear(200));
		System.out.println(isLeapYear(400));


	}

	//q1
	public static String pluralize(String word) {
		String word123 = word.toLowerCase();
		if (word123.endsWith("ey")) {
			return "eys";
		} 
		else if (word123.endsWith("y")) {
			return "ies";
		} 
		else if (word123.endsWith("ife")) {
			return "ives";
		} 
		else {
			return "s";
		}
	
		
	}

	//q2
	public static int min(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			return num1;
		}
		else if (num2 < num1 && num2 < num3) {
			return num2;
		}
		else {
			return num3;
		}
	}


	//q3
	public static boolean isLeapYear(int num) {
		if (num % 4 == 0){
			if (num % 100 == 0) {
				if (num % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		}
		else {
			return false;
		}
		

	}

}
