//import data
import java.math.BigDecimal;
import java.util.Scanner;

public class PrecisionNumber {
	PrecisionNumber(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input one number : ");
		String on = input.nextLine();
		
		BigDecimal n1 = new BigDecimal(on);
		System.out.println("Input the second one number : ");
		String tn = input.nextLine();
		
		BigDecimal n2 = new BigDecimal(tn);
		System.out.println("What do you want to do ? input number  (1) +  (2) -  (3) x  (4) กา   ");
		int want = input.nextInt();
		
		if (want== 1){
			System.out.println("The one number Plus the second one is : " + n1.add(n2));
		}else if (want == 2){
		System.out.println("The one number Substract the second one is : " + n1.subtract(n2));
		}else if (want == 3){
			System.out.println("The one number Multiply the second one is : " +n1.multiply(n2));
		}else if (want == 4){
			System.out.println("The one number Divide the second one is : " +n1.divide(n2,100,BigDecimal.ROUND_HALF_UP));
		}else{
			System.out.println("INPUT   ERROR  . Please try again .");
			new PrecisionNumber();
		}
	}
}