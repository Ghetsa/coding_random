public class PolaHuruf {
    public static void main(String[] args) {
        char[] huruf = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O'};
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < huruf.length; j += 5) {
                System.out.print(huruf[j] + " ");
            }
            System.out.println();
        }
    }
}
