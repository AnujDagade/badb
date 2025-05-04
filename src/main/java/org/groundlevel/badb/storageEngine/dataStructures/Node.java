package org.groundlevel.badb.storageEngine.dataStructures;

public class Node {
    private long key;
    private String value;
    private Node left;
    private Node right;

    public Node() {}
    public Node(long key, String value) {
        this.key = key;
        this.value = value;
    }
    public Node(long key, String value, Node left, Node right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
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
