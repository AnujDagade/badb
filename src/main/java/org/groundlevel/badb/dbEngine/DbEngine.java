package org.groundlevel.badb.dbEngine;
import org.groundlevel.badb.storageEngine.StorageEngine;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.groundlevel.badb.storageEngine.StorageEngineConstants.DEFAULT_BASE_PATH;

public class DbEngine {

    public void createDb(String dbName) throws FileAlreadyExistsException, IOException {
        createDirectory(dbName);
    }
    public void createTable(String dbName, String tableName) throws FileAlreadyExistsException, IOException {
        createTableFile(dbName,tableName);
    }

    private void createDirectory(String dbName) throws FileAlreadyExistsException, IOException {
        Path basePath = Path.of(DEFAULT_BASE_PATH + File.separator+dbName);
        Files.createDirectory(basePath);
    }
    private void createTableFile(String dbName,String tableName) throws FileAlreadyExistsException, IOException {
        Path tableFilePath = Path.of(DEFAULT_BASE_PATH + File.separator+dbName+File.separator+tableName);
        Files.createFile(tableFilePath);
    }

}
