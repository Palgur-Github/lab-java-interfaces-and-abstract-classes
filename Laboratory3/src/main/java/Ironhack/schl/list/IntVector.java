package Ironhack.schl.list;

public class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        this.array = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id >= 0 && id < size) {
            return array[id];
        } else {
            throw new IndexOutOfBoundsException("Invalid Id: " + id);
        }
    }
}