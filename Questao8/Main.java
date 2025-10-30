public class Main {
    public static void main(String[] args) {

        int[] A = { 42, 7, 99, 18, 63, 54, 27, 82, 100, 11, 35, 60, 2, 77, 56, 49, 21, 3, 73, 5 };
        int[] pares = new int[A.length];
        int[] impares = new int[A.length];

        int ponteiro = 0;
        int ponteiro2 = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] % 2 == 0) {
                pares[ponteiro] = A[i];
                ponteiro++;
            } else {
                impares[ponteiro2] = A[i];
                ponteiro2++;
            }

        }
    }
}
