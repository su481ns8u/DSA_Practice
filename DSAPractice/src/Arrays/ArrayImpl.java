package Arrays;

import java.util.ArrayList;

class Array {
    int length;
    ArrayList<String> data;

    Array() {
        this.length = 0;
        data = new ArrayList<>();
    }

    String get(int index) {
        return data.get(index);
    }

    void push(String item) throws Exception {
        if (data.size() != this.length)
            throw new Exception("Array Overflow");
        else {
            data.add(item);
            this.length++;
        }
    }

    String pop() {
        String poppedItem = data.remove(this.length - 1);
        this.length--;
        return poppedItem;
    }

    String delete(int index) {
        String deletedItem = data.get(index);
        shiftItems(index);
        return deletedItem;
    }

    private void shiftItems(int index) {
        for (int i = index; i < data.size() - 1; i++)
            data.set(i, data.get(i + 1));
        pop();
    }

    @Override
    public String toString() {
        return "Array{" +
                "length=" + length +
                ", data=" + data +
                '}';
    }
}

public class ArrayImpl {
    public static void main(String[] args) throws Exception {
        Array array = new Array();
        array.push("Hey");
        array.push("Hii");
        array.push("Hello");
        System.out.println(array.get(2));
        System.out.println(array);
        System.out.println(array.pop());
        System.out.println(array);
        array.push("Hello");
        System.out.println(array.delete(1) + " " + array);
    }
}
