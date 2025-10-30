public class Main {
    public static void main(String[] args) {

        int[] A = { 4, 2, 7, 4, 2, 4, 9, 7, 2, 9 };
        boolean[] contado = new boolean[A.length];

        for (int i = 0; i < A.length; i++) {
            if (!contado[i]) {
                int cont = 1;
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] == A[j]) {
                        cont++;
                        contado[j] = true;
                    }
                }
                System.out.println(A[i] + " aparece " + cont + " vez(es).");
            }
        }
    }
}
