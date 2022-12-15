import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" ")).map(a->a.length()>=5? new StringBuilder(a).reverse():a).collect(Collectors.joining(" "));

    }

    public static void main(String[] args) {
        System.out.println(spinWords("12345 12 123456 123 12345678 1 12 1234567 123"));
    }
}