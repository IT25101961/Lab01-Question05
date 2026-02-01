public class  Calculator{
	
	public int add(int a, int b) { //add two integers
		return a+b;
		
	}
	public int multiply(int a, int b) { //multiply two integers
	   return a*b;
	}
	   
	public int square(int a) { //square a number
	  return a*a;
	}
	public static void main(String[] args) {
		
		Calculator cal =new Calculator();
		
		int part1   = cal.multiply(3,4);
		int part2   = cal.multiply(5,7);
		int sum1    = cal.add(part1,part2);
		int result1 = cal.square(sum1);
		
		System.out.println("(3 ∗ 4 + 5 ∗ 7)^2 = " + result1);
		
		int sumA = cal.add(4,7);
		int squareA = cal.square(sumA);
		
		int sumB = cal.add(8, 3);
		int squareB = cal.square(sumB);
		
		int results2 = cal.add(squareA,squareB);
		
		System.out.println("(4 + 7)^2 + (8+3)^2 = " + results2);
	}
	}
		