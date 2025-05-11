package org.groundlevel.badb.storageEngine.dataStructures;

public class Node <T> {
    private T key;
    private long value;
    private Node left;
    private Node right;

    public Node() {}
    public Node(T key, long value) {
        this.key = key;
        this.value = value;
    }
    public Node(T key, long value, Node left, Node right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
