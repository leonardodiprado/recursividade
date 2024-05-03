public class PalavraInvertida {
    public static String inverterPalavra(String palavra) {
        if (palavra.isEmpty() || palavra.length() == 1) {
            return palavra;
        } else {
            return palavra.charAt(palavra.length() - 1) + inverterPalavra(palavra.substring(0,palavra.length()));
        }
    }
}