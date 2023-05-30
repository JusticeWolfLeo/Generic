class MyClass<T extends Number> {
    private T max;
    private T min;

    public MyClass(T[] array) {
        if (array.length > 0) {
            max = array[0];
            min = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i].doubleValue() > max.doubleValue()) {
                    max = array[i];
                }

                if (array[i].doubleValue() < min.doubleValue()) {
                    min = array[i];
                }
            }
        }
    }

    public T getMax() {
        return max;
    }

    public T getMin() {
        return min;
    }
}

public class Main {
    public static <T extends Number> MyClass<T> findMaxAndMin(T[] array) {
        return new MyClass<>(array);
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 2, 1};
        MyClass<Integer> result = findMaxAndMin(intArray);
        System.out.println("Max: " + result.getMax());
        System.out.println("Min: " + result.getMin());

        Double[] doubleArray = {2.5, 1.2, 3.7, 0.8};
        MyClass<Double> result2 = findMaxAndMin(doubleArray);
        System.out.println("Max: " + result2.getMax());
        System.out.println("Min: " + result2.getMin());
    }
}
