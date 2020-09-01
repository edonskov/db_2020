package homework;

public class DynamicIntegerArrayImpl implements DynamicIntegerArray {

    int[] array = new int[] {10, 4, 5, 7};

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void add(int value) {
        int[] array2 = new int[size()+1];
        for (int i = 0; i < size(); i++) {
            array2[i] = array[i];
        }
        array2[size()] = value;
        array = array2;
    }

    @Override
    public int size() {
        return array.length;
    }
}
