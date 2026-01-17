public class StringExample {
    public static void main(String[] args) {
        String text = "Hello Java World";

        // Uzunluq
        System.out.println("Length of text = " + text.length());

        // Bütün hərfləri böyük yazmaq
        System.out.println("Uppercase = " + text.toUpperCase());

        // Bütün hərfləri kiçik yazmaq
        System.out.println("Lowercase = " + text.toLowerCase());

        // Substring (parça almaq)
        System.out.println("Substring (0,5) = " + text.substring(0, 5));

        // Hərfləri bir-bir çap etmək
        System.out.println("Characters:");
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();

        // Axtarış (indexOf)
        System.out.println("Index of 'Java' = " + text.indexOf("Java"));

        // Əvəzləmə (replace)
        System.out.println("Replace 'Java' with 'GitHub' = " + text.replace("Java", "GitHub"));
    }
}

