
class Notes {
	public static void main(String[] args) {

		//else if

		int num;
		num = 9;

		if (num > 10) { //num > 10
			System.out.println("if");
		}
		else if (num > 8) { //num <= 10 && num > 8
			System.out.println("else if");
		}
			//could have more as many else ifs as i need
		else { //num <= 10 && num <= 8
		//num <= 8
			System.out.println("else");
		}

		//DON'T DO THIS - UNREACHABLE ELSE IF

		if (num > 10) { //num > 10
			System.out.println("if");
		}
		else if (num > 12) { //CAN'T BE REACHED
			// num <= 10 && num > 12
			//all numbers less than 10 cannot be greater than 12
			System.out.println("else if");
		}
			//could have more as many else ifs as i need
		else { //num <= 10 && num <= 8
		//num <= 8
			System.out.println("else");
		}

		//try to order ifs and else ifs by smaller sets to larger sets (more specific to less specific)

		//nested ifs - putting and if inside an if

		if (num > 8) {
			System.out.println("first if statement ran");
			if (num < 10) { //num > 8 && num < 10
				System.out.println("both ifs ran");
			}
			if (num == 15) { //num > 8 && num == 15
				System.out.println("num is 15");
			}
			if (num < 20) { //num > 8 && num < 20
				System.out.println("3rd if is true");
			}
		}

		//avoids repeated conditions
		//helps created step by step checks
		//allows code to written between conditions

		//avoid nested ifs when they aren't necessary

		//guard clauses can be used to avoid nested ifs.  look this up if you want to figure it out

		
	}
}
