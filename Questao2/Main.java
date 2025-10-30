public class Main
{
	public static void main(String[] args) {
	    
        int[] A = {1,2,3,4,5,6,7,8,9,0};
        
        int menor = A[0];
        int maior = A[0];
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] < menor) {
                menor = A[i];
            }
            if (A[i] > maior) {
                maior = A[i];
            }
            
            System.out.println(menor + " n " + maior);
        }
		
	}
}
