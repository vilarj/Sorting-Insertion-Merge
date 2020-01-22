
public class Insertion_Sort <T> {
    public <T extends Comparable> Insertion_Sort (T[] list) {
        Insertion (list);
    }

    public <T extends Comparable> void Insertion (T[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j-1].compareTo(list[j]) > 0) {
                    swap(list,j-1,j);
                }
                else break;
            }
        }
    }

    public <T extends Comparable> void swap(Comparable[] list, int i, int j) {
        Comparable swap = list[i];
        list[i] = list[j];
        list[j] = swap;
    }

    public <T extends  Comparable> T[] toArray (T[] list) {
        for (T t : list) {System.out.print(t + " ");}
        return list;
    }
}
