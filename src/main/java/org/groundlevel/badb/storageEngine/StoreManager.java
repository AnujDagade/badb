package org.groundlevel.badb.storageEngine;

import org.groundlevel.badb.storageEngine.dataStructures.BinarySearchTree;
import org.groundlevel.badb.storageEngine.dataStructures.Node;

import java.util.List;
import java.util.Random;

public class StoreManager {
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    public void insert(long key, long value) {
        binarySearchTree.insertData(key, value);
    }

    public List<Node<Long>> selectAll() {
        return binarySearchTree.getAllData();
    }

}
