public class Main {
    public static void main(String[] args) {

        int[] A = { 1, 2, 43, 4, 0, 1, 62, 4, 0, 9 };
        int[] C = new int[A.length];
        int tamFinal = 0;

        for (int i = 0; i < A.length; i++) {
            if (diferente(C, tamFinal, A[i])) {
                C[tamFinal] = A[i];
                tamFinal++;
            }
        }

        int[] B = new int[tamFinal];

        for (int i = 0; i < B.length; i++) {
            B[i] = C[i];
        }

    }

    public static boolean diferente(int[] lista, int tamanho, int item) {

        for (int i = 0; i < tamanho; i++) {
            if (lista[i] == item) {
                return false;
            }
        }
        return true;

    }
}
