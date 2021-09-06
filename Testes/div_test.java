package exemplo02;

public class PP {

	public static void main(String[] args) {
		
			try{
				int a;
				int b;
				int c;
			
				a = 10;
				b = 0;
				c = a/b;
			
			
				System.out.println("resultado: "+c);
			}catch (ArithmeticException e){
				System.out.println("N�o � Poss�vel dividir por 0.");
			}
		}
		
		
		
	}


