package classes;

public class Counter implements AutoCloseable {
    private static int count = 0;

    public static void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Ошибка при работе с объектом типа счетчик");
    }
}
