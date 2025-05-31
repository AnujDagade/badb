package org.groundlevel.badb.storageEngine;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class StorageEngineConstants {
    private StorageEngineConstants() {}

    public static final short PAGE_SIZE = 8192;
    public static final String DEFAULT_BASE_PATH = System.getProperty("user.home")+ File.separator+"badb";

}
