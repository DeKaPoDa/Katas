public class BuildASquare {
    public static String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("+".repeat(n));
            sb.append((i==n-1)?"":"\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateShape(3));
        System.out.println(generateShape(5));
        System.out.println(generateShape(8));
    }
}
