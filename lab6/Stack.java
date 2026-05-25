public class Stack<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public void push(T element) {
        if (size < data.length) {
            data[size] = element;
            size++;
        } else {
            System.out.println("Ошибка: Стек переполнен!");
        }
    }

    public T pop() {
        if (size == 0) {
            System.out.println("Ошибка: Стек пуст!");
            return null;
        }
        size--;
        T element = data[size];
        data[size] = null;
        return element;
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return data[size - 1];
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.pop());
    }
}