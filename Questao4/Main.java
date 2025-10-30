public class Main
{
	public static void main(String[] args) {
	    
        int[] A = {1,2,3,4,5,6,7,8,9,0};
        
        int alvo = 4;
        boolean encontrou = false;
        int pos = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (alvo == A[i]) {
                encontrou = true;
                pos = i;
            }
        }
        
        if (encontrou) {
            System.out.println("posição: " + pos);
        } else {
            System.out.println("numero nao existe");
        }
        
	}
}
