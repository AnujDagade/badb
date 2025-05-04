package org.groundlevel.badb.storageEngine;

import org.groundlevel.badb.storageEngine.dataStructures.BinarySearchTree;
import org.groundlevel.badb.storageEngine.dataStructures.Node;

import java.util.List;
import java.util.Random;

public class StoreManager {
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    public void insert(long key, String value) {
        binarySearchTree.insertData(key, value);
    }

    public List<Node> selectAll() {
        return binarySearchTree.getAllData();
    }

}
