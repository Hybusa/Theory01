public class Main {
    public static void main(String[] args) {
        String string = "String";

        int mid = string.length() / 2;

        String firstHalf = string.substring(0, mid);
        String secondHalf = string.substring(mid);

        System.out.println(firstHalf);
        System.out.println(secondHalf);

    }
}