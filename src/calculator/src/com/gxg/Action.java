package com.gxg;

public class Action {
	private static String result = "0";
	private static String inputNumber = "0";
	private static String operator = null;
	private static Boolean isResult = false;
	private static Boolean isOperator = false;
	
	public static String eventProcessing(String s) {
		if("0".compareTo(s) <= 0 && "9".compareTo(s) >=0 && !"1/x".equals(s)) {
//			if(isResult || isOperator) {
//				isOperator = false;
//				isResult = false;
//				inputNumber = s;
//				operator = null;
//				result = "0";
//				return "0";
//			}
			isOperator = false;
			isResult = false;
			if("0".equals(inputNumber)) {
				if("0".equals(s)) {
					inputNumber = "0";
				}
				else{
					inputNumber = s;
				}
			} else {
				inputNumber += s;
			}
			return inputNumber;
		}
		
		if(".".equals(s)) {
			if(inputNumber.indexOf(".") == -1) {
				inputNumber += s;
			}
			return inputNumber;
		}
		
		if("+".equals(s)) {
			return calculation("+");
		}
		
		if("-".equals(s)) {
			return calculation("-");
		}
		
		if("*".equals(s)) {
			return calculation("*");
		}
		
		if("/".equals(s)) {
			return calculation("/");
		}
		
		if("=".equals(s)) {
			double number = 0;
			if("+".equals(operator)) {
				number = Double.parseDouble(result) + Double.parseDouble(inputNumber);
			}
			
			if("-".equals(operator)) {
				number = Double.parseDouble(result) - Double.parseDouble(inputNumber);
			}
			
			if("*".equals(operator)) {
				number = Double.parseDouble(result) * Double.parseDouble(inputNumber);
			}
			
			if("/".equals(operator)) {
				number = Double.parseDouble(result) / Double.parseDouble(inputNumber);
			}
			if("%".equals(operator)) {
				number = Double.parseDouble(result) % Double.parseDouble(inputNumber);
			}
			if(operator == null) {
				number = Double.parseDouble(inputNumber);
				if(number == 0) {
					number = Double.parseDouble(result);
				}
			}
			operator = null;
			result = number + "";
			isOperator = false;
			isResult = true;
			inputNumber = "0";
			return result;
		}
		
		if("1/x".equals(s)) {
			if(operator == null) {
				if(isResult) {
					if(Double.parseDouble(result) == 0) {
						result = "0";
						isOperator = false;
						isResult = false;
					} else {
						double number = 1 / Double.parseDouble(result);
						result = number + "";
						isOperator = true;
						isResult = true;
					}
				} else {
					if(Double.parseDouble(inputNumber) == 0) {
						result = "0";
						isOperator = false;
						isResult = false;
					} else {
						double number = 1 / Double.parseDouble(inputNumber);
						result = number + "";
						isOperator = true;
						isResult = true;
					}
				}
				inputNumber = "0";
				operator = null;
				return result;
			} else {
				return calculation("1/x");
			}
		}
		
		if("%".equals(s)) {
			return calculation("%");
		}
		
		if("sqrt".equals(s)) {
			if(operator == null) {
				double number = 0;
				if(isResult) {
					number = Math.sqrt(Double.parseDouble(result));
				} else {
					number = Math.sqrt(Double.parseDouble(inputNumber));
				}
				result = number + "";
				isOperator = true;
				isResult = true;
				inputNumber = "0";
				operator = null;
				return result;
			} else {
				return calculation("sqrt");
			}
		}
		
		if("C".equals(s)) {
			result = "0";
			inputNumber = "0";
			operator = null;
			isResult = false;
			isOperator = false;
			return result;
		}
		return "0";
	}
	
	public static String calculation(String nextOperator) {
		Boolean isEnd = false;
		if(operator == null) {
			if(!isResult) {
				result = inputNumber;
			}
			isOperator = true;
			isResult = false;
		} else {
			isOperator = true;
			isResult = false;
			double number = 0;
			if("+".equals(operator)) {
				number = Double.parseDouble(result) + Double.parseDouble(inputNumber);
			}
			
			if("-".equals(operator)) {
				number = Double.parseDouble(result) - Double.parseDouble(inputNumber);
			}
			
			if("*".equals(operator)) {
				number = Double.parseDouble(result) * Double.parseDouble(inputNumber);
			}
			
			if("/".equals(operator)) {
				number = Double.parseDouble(result) / Double.parseDouble(inputNumber);
			}
			
			if("1/x".equals(nextOperator)) {
				if("+".equals(operator)) {
					number = Double.parseDouble(result) + Double.parseDouble(inputNumber);
				}
				
				if("-".equals(operator)) {
					number = Double.parseDouble(result) - Double.parseDouble(inputNumber);
				}
				
				if("*".equals(operator)) {
					number = Double.parseDouble(result) * Double.parseDouble(inputNumber);
				}
				
				if("/".equals(operator)) {
					number = Double.parseDouble(result) / Double.parseDouble(inputNumber);
				}
				if("%".equals(operator)) {
					number = Double.parseDouble(result) % Double.parseDouble(inputNumber);
				}
				
				if(number == 0) {
					number = 0;
					isOperator = false;
					isResult = false;
				} else {
					number = 1 / number;
					isOperator = true;
					isResult = true;
				}
				isEnd = true;
			}
			
			if("%".equals(operator)) {
				number = Double.parseDouble(result) % Double.parseDouble(inputNumber);
			}
			
			if("sqrt".equals(operator)) {
				if("+".equals(operator)) {
					number = Double.parseDouble(result) + Double.parseDouble(inputNumber);
				}
				
				if("-".equals(operator)) {
					number = Double.parseDouble(result) - Double.parseDouble(inputNumber);
				}
				
				if("*".equals(operator)) {
					number = Double.parseDouble(result) * Double.parseDouble(inputNumber);
				}
				
				if("/".equals(operator)) {
					number = Double.parseDouble(result) / Double.parseDouble(inputNumber);
				}
				if("%".equals(operator)) {
					number = Double.parseDouble(result) % Double.parseDouble(inputNumber);
				}
				
				number = Math.sqrt(number);
				isOperator = true;
				isResult = true;
				isEnd = true;
			}
			result = number + "";
		}
		operator = nextOperator;
		if(isEnd) {
			operator = null;
			isEnd = false;
		}
		inputNumber = "0";
		return result;
	}
}
