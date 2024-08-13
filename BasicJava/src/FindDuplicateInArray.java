public class FindDuplicateInArray {
    public static void main(String[] args) {
        String names[] = {"java", "python", "C++", "Html", "java"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate present: " + names[i]);
                }
            }
        }
    }
}
