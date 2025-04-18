class MyHashMap {

    private static final int SIZE = 1000;
    private LinkedList<Node>[] map;
    private class Node {
        int key, value;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    public MyHashMap() {
        map = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            map[i] = new LinkedList<>();
        }
    }
    private int hash(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        for (Node node : map[index]) {
            if (node.key == key) {
                node.value = value; 
                return;
            }
        }
        map[index].add(new Node(key, value)); 
    }
    
    public int get(int key) {
        int index = hash(key);
        for (Node node : map[index]) {
            if (node.key == key) {
                return node.value; 
            }
        }
        return -1; 
    }
    
    public void remove(int key) {
        int index = hash(key);
        for (Node node : map[index]) {
            if (node.key == key) {
                map[index].remove(node);
                return;
            }
        }
    }
}
