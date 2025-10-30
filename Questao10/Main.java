public class Main {
    public static void main(String[] args) {

        int[] A = { 42, 7, 99, 18, 63, 54, 27, 82, 100, 11 };
        int fim = A[A.length - 1];

        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }

        A[0] = fim;
    }
}
