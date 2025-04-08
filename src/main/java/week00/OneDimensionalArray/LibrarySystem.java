package week00.OneDimensionalArray;

public class LibrarySystem {

    public static void bookSort(String[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < books.length; j++) {
                if (books[j].compareTo(books[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = books[i];
                books[i] = books[minIndex];
                books[minIndex] = temp;
            }
        }
        System.out.println("Sorted books:");
        for (String book : books) {
            System.out.print(book + " ");
        }
    }

    public static void main(String[] args) {
        String[] books = {"BCD", "ABC", "EFG"};
        bookSort(books);
    }
}
