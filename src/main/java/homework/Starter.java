package homework;

public class Starter {
    public static void main(String[] args) {
        ArrayList listTest = new ArrayList(10);
        for (int i = 0; i < 100000; i++){
            listTest.add(i);
        }
        System.out.println(listTest.get(99999));
    }
}
