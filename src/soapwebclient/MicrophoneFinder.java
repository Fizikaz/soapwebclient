package soapwebclient;


import net.webservicex.Calculator;
import net.webservicex.CalculatorSoap;

public class MicrophoneFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(args.length != 1) {
//			System.out.println("You need to pass in two numbers");
//		} else {
			Integer number1 = Integer.parseInt(args[0]);
			Integer number2 = Integer.parseInt(args[1]);
			
			Calculator testService = new Calculator();
			CalculatorSoap testServiceSoap = testService.getCalculatorSoap();
			int result = testServiceSoap.add(number1, number2);
			System.out.println(result);
//		}
	}
}
