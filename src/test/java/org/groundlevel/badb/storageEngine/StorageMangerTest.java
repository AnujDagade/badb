package org.groundlevel.badb.storageEngine;

import org.groundlevel.badb.storageEngine.dataStructures.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StorageMangerTest {
    StoreManager storeManager = new StoreManager();
    @Test
    public void testInsertData() {
        for (int i = 0; i < 100; i++) {
            storeManager.insert(i, "value"+i);
        }
        List<Node> nodeList = storeManager.selectAll();
        for (Node node: nodeList) {
            System.out.print("node = " + node.getValue() + " ");
        }
        Assertions.assertNotNull(nodeList);
        Assertions.assertEquals(100, nodeList.size());
    }

}
