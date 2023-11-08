public class SimpleArrayList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 1;

    public SimpleArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(int element) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = element;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void sort() {
        Arrays.sort(array, 0, size);
    }

    public void reverse() {
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.display();
        list.sort();
        list.display();
        list.reverse();
        list.display();
        list.remove(1);
        list.display();
    }
}
