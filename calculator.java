package Question1;

public class calculator {
	int num1;
	int num2;
	
	
	public calculator (int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	void show() {
		System.out.println("_____Welcome to my calcultor____\n");
	}
	
	void add() {
		System.out.println("Addition :" + (this.num1 + this.num2));
	}
	
	void sub() {
		System.out.println("Subtraction :"  +  (this.num1 - this.num2));
	}
	
	void multiply() {
		System.out.println("Multiplication : " + this.num1 * this.num2);
	}
	
	void divide() {
		System.out.println ("Division :" + this.num1/this.num2);
	}
	
	public static class test {
		public static void main(String[] args) {
				calculator s1=new calculator(10,5);
				s1.show();
				s1.add();
				s1.sub();
				s1.multiply();
				s1.divide();
				
			}
	}
}

