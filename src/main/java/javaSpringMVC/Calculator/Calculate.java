package javaSpringMVC.Calculator;

public class Calculate {
	
    public int add(int x,int y) {
    	Addition addition=(a,b)->a+b;
    	return addition.add(x, y);
    }
    
    public int substract(int x,int y) {
    	Substraction substraction=(a,b)->a-b;
    	return substraction.substract(x, y);
    }
    
    public int multiply(int x,int y) {
    	Multiplication multiplication=(a,b)->a*b;
    	return multiplication.multiply(x, y);
    }
    
    public int divide(int x,int y) {
    	Division division=(a,b)->a/b;
    	return division.divide(x, y);
    }
    
    public int getResult(String operation,int a,int b) {
    	if(operation.equals("+")) {
    		return this.add(a, b);
    	}else if(operation.equals("-")) {
    		return this.substract(a, b);
    	}else if(operation.equals("*")) {
    		return this.multiply(a, b);
    	}else{
    		return this.divide(a, b);
    	}
    }
}
