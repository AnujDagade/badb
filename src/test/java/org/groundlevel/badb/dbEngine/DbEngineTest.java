package org.groundlevel.badb.dbEngine;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DbEngineTest {
    DbEngine dbEngine = new DbEngine();
    private static final String DB_NAME = "test";
    private static final String TABLE_NAME = "testTable";


    @Test
    public void testCreateDb() throws Exception {
        dbEngine.createDb(DB_NAME);
    }
    @Test
    public void testCreateTable() throws Exception {
        dbEngine.createDb("testDb");
        dbEngine.createTable("testDb", TABLE_NAME);
    }
}
