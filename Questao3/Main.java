public class Main
{
	public static void main(String[] args) {
	    
        int[] A = {2,3,4,5,6,7,8,9};
        
        int tamanho = A.length;
        int media = 0;
        int total = 0;
        
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }
        
        media = total / tamanho;
        
        System.out.println(media);
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] > media) {
                System.out.println(A[i]);
            }
        }
		
	}
}
