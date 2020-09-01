package homework;

/**
 * @author Evgeny Borisov
 */
public class DynamicIntegerArrayImpl implements DynamicIntegerArray {

    private int[] nums = new int[0];

    @Override
    public int get(int index) {

        return nums[index];
    }

    @Override
    public void add(int value) {
        int[] ints = new int[nums.length + 1];
/*
        for (int i = 0; i < nums.length; i++) {
            ints[i] = nums[i];
        }
        ints[nums.length] = value;

        nums = ints;*/
        System.arraycopy(nums,0,ints,0,nums.length);
        ints[nums.length]=value;
        nums = ints;


    }

    @Override
    public int size() {
        return nums.length;
    }
}
