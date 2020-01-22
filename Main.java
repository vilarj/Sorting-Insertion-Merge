import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /* Testing Insertion Sort with numbers */
        Integer[] set = {2,3,3,1,5,6,1,10};
        Insertion_Sort<Integer> list = new Insertion_Sort<>(set);
        list.toArray(set);

        System.out.println("\n****************");

        /* Testing Merge Sort with the dictionary */
        FileWriter file_writer = new FileWriter("sorted_book");
        Reader reader = new Reader("book");
        String[] vocabulary = reader.get();

        MergeSort merge = new MergeSort(vocabulary);

        for(String word : vocabulary) {
            System.out.println(word); // printing out to console the original file in words
            file_writer.write(word); // writing to the file "sorted_book"
        }
    }
}
