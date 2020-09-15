package homework;

public class ArrayList implements DynamicIntegerArray {
    private final int INCREASING = 10;
    private int arraySize;
    private int size;
    private int[] elemnts;

    public ArrayList() {
        this.size = 0;
        this.arraySize = 0;
    }

    public ArrayList(int arraySize) {
        this.size = 0;
        this.arraySize = arraySize;
        this.elemnts = new int[this.arraySize];
    }

    @Override
    public int get(int index) {
        return this.elemnts[index];
    }

    @Override
    public void add(int value) {
        if (this.arraySize == this.size){
            this.arraySize += INCREASING;
            int[] temp = new int[this.arraySize];

            for (int i = 0; i < this.size; i++){
                temp[i] = elemnts[i];
            }

            this.elemnts = temp;

        }
        this.elemnts[size] = value;
        size++;

    }

    public int size() {
        return size;
    }
}
