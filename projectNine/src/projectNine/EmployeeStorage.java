package projectNine;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeStorage {

	private static boolean _flagValidation=false;
	
	private static int _employeeId;
	private static int _sentinel = 1;
	
	private static double _grossPay;
	private static double _stateTax;
	private static double _federalTax;
	private static double _withHoldings;
	private static double _netPay;
	private static double _grossPayTotal;
	private static double _stateTaxTotal;
	private static double _federalTaxTotal;
	private static double _withHoldingsTotal;
	private static double _netPayTotal;
	private static double _garbage;
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner( System.in);
		ArrayList <Integer> list = new ArrayList<>();
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		
		while(_sentinel != 0){
		
		System.out.print("Enter employee ID >> ");
		_employeeId = scanner.nextInt();
		_sentinel = _employeeId;
		if(_sentinel != 0){
			
			while(_flagValidation == true){
		
		System.out.print("Enter Gross Pay >> ");
		_grossPay = scanner.nextInt();
		if(_grossPay >=0){
		_grossPayTotal += _grossPay;
		}
		while(_grossPay <= -1){
			System.out.print("Enter Gross Pay greater than -1 >> ");
			_grossPay = scanner.nextInt();
			if(_grossPay >=0){
				_grossPayTotal += _grossPay;
				}
		}
		
		System.out.print("Enter State Tax >> ");
		_stateTax = scanner.nextInt();
		//_stateTaxTotal += _stateTax;
		if(_stateTax >=0 && _stateTax < _grossPay){
			_stateTaxTotal += _stateTax;
			}
			while(_stateTax <= -1 && _stateTax < _grossPay){
				System.out.print("Enter State Tax greater than -1 and smaller than gross pay>> ");
				_stateTax = scanner.nextInt();
				if(_stateTax >=0 && _stateTax < _grossPay){
					_stateTaxTotal += _stateTax;
					}
			}
		
		System.out.print("Enter Federal Tax >> ");
		_federalTax = scanner.nextInt();
		//_federalTaxTotal += _federalTax;
		if(_federalTax >=0 && _federalTax < _grossPay){
			_federalTaxTotal += _federalTax;
			}
			while(_federalTax <= -1 && _federalTax < _grossPay){
				System.out.print("Enter Federal Tax greater than -1 and smaller than gross pay>> ");
				_federalTax = scanner.nextInt();
				if(_federalTax >=0 && _federalTax < _grossPay){
					_federalTaxTotal += _federalTax;
					}
			}
		
		
		System.out.print("Enter FICA withholdings >> ");
		_withHoldings = scanner.nextInt();
		//_withHoldingsTotal += _withHoldings;
		if(_withHoldings >=0 && _withHoldings < _grossPay){
			}
			while(_withHoldings <= -1 && _withHoldings < _grossPay){
				System.out.print("Enter FICA Witholdings greater than -1 and smaller than gross pay>> ");
				_withHoldings = scanner.nextInt();
				
			}
		
		}
			_garbage = _withHoldings + _federalTax + _stateTax;
		if(_garbage > _grossPay){
			
		}
			_federalTaxTotal += _federalTax;
		_netPay += _grossPay - _stateTax - _federalTax - _withHoldings;//calculate net pay
		System.out.println("The net pay is "+defaultFormat.format(_netPay));
		//list.add();
		}
		
		System.out.println("Gross Pay: "+defaultFormat.format(_grossPayTotal)+" State Tax "+defaultFormat.format(_stateTaxTotal)+" Federal Tax "+defaultFormat.format(_federalTaxTotal)+" FICA withholdings "+defaultFormat.format(_withHoldingsTotal)+" Net Pay "+defaultFormat.format(_netPayTotal));
	}

}
}
