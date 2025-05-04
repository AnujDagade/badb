package org.groundlevel.badb.storageEngine.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BinarySearchTree {
    public Node root = null;

    public void insertData(long key, String value) {
        Node node = new Node(key, value);
        if (root == null) {
            root = node;
            return;
        }
        insertNode(root, node);
    }
    public Node getData(long key) {
        return search(root, key);
    }
    public List<Node> getAllData() {
        List<Node> nodeList = new ArrayList<>();
        traverse(nodeList, root);
        return nodeList;
    }

    public void traverse(List<Node> nodeList, Node node) {
        if (node == null) return;
        nodeList.add(node);
        System.out.println(node.getValue());
        traverse(nodeList, node.getLeft());
        traverse(nodeList, node.getRight());
    }

   public Node search(Node node, long key) {
        if (node == null) return null;
        if(node.getKey() == key) return node;
        if(key < node.getKey()) {
            return search(node.getLeft(), key);
        } else {
            return search(node.getRight(), key);
        }

    }

    private void insertNode(Node oldNode, Node newNode) {
        if( newNode.getKey() < oldNode.getKey()) {
            if(oldNode.getLeft() == null) {
                oldNode.setLeft(newNode);
            } else {
                insertNode(oldNode.getLeft(), newNode);
            }
        } else {
            if(oldNode.getRight() == null) {
                oldNode.setRight(newNode);
            } else {
                insertNode(oldNode.getRight(), newNode);
            }
        }
    }


}
