package org.groundlevel.badb.storageEngine;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class StorageEngineTest {
    private StorageEngine engine = new StorageEngine();
    @Test
    public void testCreateDirectory() throws IOException {
        engine.createDirectory("testdb");
    }
}
