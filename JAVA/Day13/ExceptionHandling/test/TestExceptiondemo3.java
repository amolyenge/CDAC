package ExceptionHandling;

import ExceptionHandling.exceptions.NegativeSalaryException;
import ExceptionHandling.service.MyService;

public class TestExceptiondemo3 {

	public static void main(String[] args) {
		MyService ms=new MyService();
		try {
			ms.acceptData();
		} catch (NegativeSalaryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
