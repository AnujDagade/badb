package org.groundlevel.badb.storageEngine;

import java.nio.file.Files;
import java.nio.file.Path;

public class StorageEngineConstants {
    private StorageEngineConstants() {}

    protected static final short PAGE_SIZE = 8192;
    protected static final String DEFAULT_BASE_PATH = "/usr/local";

}
