public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 99999; i++) {
            String a = String.valueOf(i);
            if (a.contains("4")|| a.contains("13")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
