public class Expoente {
    public static int expoente (int n, int expoente) {
        if(expoente==0) {
            return 1;
        } else {
            return n * (expoente(n, expoente - 1));
        }
    }
}
