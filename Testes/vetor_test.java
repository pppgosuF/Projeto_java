package exemplo02;

public class PP2 {

	
	public static void main(String[] args) {
		
		int[] vetor = new int[3];
		
		try{
			
			vetor[0] = 10;
			vetor[1] = 20;
			vetor[2] = 30;
			vetor[3] = 40;
			
			for (int i=0;i<vetor.length;i++);
				
		}catch (ArrayIndexOutOfBoundsException e){
			
		}
		System.out.println("bom dia boa tarde e boa noite.  notamos que temos um erro no sistema Array pois a caixa de Array 3 n�o suporta Array 4, sabemos q errar � humano e aconcelhamos que o senhor ou senhora deverar arrumar esse erro");
		
		
		
		
		
		
		
	}

}
