public class CustomArrayList {
    int capacity = 5;
    int size = 0;
    int[] arr = new int[capacity];

    void insert(int ele) {
        if (size == capacity) {
            int[] arr1 = new int[2 * capacity];
            capacity = 2 * capacity;
            for (int j = 0; j < size; j++) {
                arr1[j] = arr[j];
            }
            arr = arr1;
        }
        arr[size] = ele;
        size++;
    }

    public int getSize() {
        return size;
    }

    public int get(int i) {
        return arr[i];
    }
}


