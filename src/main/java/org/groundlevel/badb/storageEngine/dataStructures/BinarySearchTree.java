package org.groundlevel.badb.storageEngine.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BinarySearchTree {
    public Node<Long> root = null;

    public void insertData(long key, long value) {
        Node node = new Node(key, value);
        if (root == null) {
            root = node;
            return;
        }
        insertNode(root, node);
    }
    public Node<Long> getData(long key) {
        return search(root, key);
    }
    public List<Node<Long>> getAllData() {
        List<Node<Long>> nodeList = new ArrayList<>();
        traverse(nodeList, root);
        return nodeList;
    }

    public void traverse(List<Node<Long>> nodeList, Node<Long> node) {
        if (node == null) return;
        nodeList.add(node);
        System.out.println(node.getValue());
        traverse(nodeList, node.getLeft());
        traverse(nodeList, node.getRight());
    }

   public Node<Long> search(Node<Long> node, long key) {
        if (node == null) return null;
        if(node.getKey().equals(key)) return node;
        if(key < node.getKey()) {
            return search(node.getLeft(), key);
        } else {
            return search(node.getRight(), key);
        }

    }

    private void insertNode(Node<Long> oldNode, Node<Long> newNode) {
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
