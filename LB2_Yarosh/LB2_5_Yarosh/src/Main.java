public class Main {
    public static void main(String[] args) {
        System.out.println(MixStrings("zhenya", "yarosh"));
        System.out.println(MixStrings("maks", "ralko"));
        System.out.println(MixStrings("1234567", "1234567"));
    }
    private static String MixStrings(String first, String second) {
        String shorter = first;
        boolean longer = true;
        if (first.length() > second.length()) {
            shorter = second;
            longer = false;
        }
        StringBuilder builder = new StringBuilder();
        int i;
        for (i = 0; i < shorter.length(); i++) {
            builder.append(first.charAt(i)).append(second.charAt(i));
        }
        if (longer)
            builder.append(second.substring(i));
        else builder.append(first.substring(i));
        return builder.toString();
    }
}