package com.kreitek.files;

import java.util.List;

public interface EditFilesDirectories {
    List<FileSystemItem> listFiles();

    void addFile(FileSystemItem file);

    void removeFile(FileSystemItem file);
}
