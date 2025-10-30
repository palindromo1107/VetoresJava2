public class Main {
    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 6, 7, 8, 9, 0 };
        int[] C = new int[A.length + B.length];

        boolean pos = true;

        for (int i = 0; i < A.length; i++) {

            if (pos) {
                C[i] = B[i];
                pos = false;
            } else {
                C[i] = A[i];
                pos = true;
            }

        }
    }
}
