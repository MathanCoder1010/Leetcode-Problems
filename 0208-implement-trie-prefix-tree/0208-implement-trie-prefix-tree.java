class Trie {

    class Node {
        Node[] child = new Node[26];
        boolean end;
    }

    Node root = new Node();

    public Trie() {
    }

    public void insert(String word) {
        Node cur = root;

        for (char c : word.toCharArray()) {
            int i = c - 'a';

            if (cur.child[i] == null) {
                cur.child[i] = new Node();
            }

            cur = cur.child[i];
        }

        cur.end = true;
    }

    public boolean search(String word) {
        Node cur = root;

        for (char c : word.toCharArray()) {
            int i = c - 'a';

            if (cur.child[i] == null) {
                return false;
            }

            cur = cur.child[i];
        }

        return cur.end;
    }

    public boolean startsWith(String prefix) {
        Node cur = root;

        for (char c : prefix.toCharArray()) {
            int i = c - 'a';

            if (cur.child[i] == null) {
                return false;
            }

            cur = cur.child[i];
        }

        return true;
    }
}