package org.groundlevel.badb.storageEngine;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

import static org.groundlevel.badb.storageEngine.StorageEngineConstants.DEFAULT_BASE_PATH;

public class StorageEngine {
    protected void createDirectory(String name) throws IOException {
        Path basePath = Path.of(DEFAULT_BASE_PATH+ File.separator+"badb"+ File.separator+name);

        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(basePath);


        if(!Files.exists(basePath))
            Files.createDirectories(basePath);
        else
            throw new IOException(name + " already exists");
    }


}
