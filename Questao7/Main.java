public class Main {
    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5, 3, 7, 3, 9, 0 };
        int frequencia = 0;
        int alvo = 3;

        for (int i = 0; i < A.length; i++) {

            if (A[i] == alvo) {
                frequencia++;
            }

        }
    }
}
