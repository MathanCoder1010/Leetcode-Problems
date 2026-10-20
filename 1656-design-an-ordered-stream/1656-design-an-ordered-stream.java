import java.util.*;

class OrderedStream {
    String[] arr;
    int ptr = 1;

    public OrderedStream(int n) {
        arr = new String[n + 1];
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey] = value;
        List<String> list = new ArrayList<>();

        while (ptr < arr.length && arr[ptr] != null) {
            list.add(arr[ptr]);
            ptr++;
        }

        return list;
    }
}