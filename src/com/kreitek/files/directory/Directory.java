package com.kreitek.files.directory;

import com.kreitek.files.*;
import com.kreitek.files.file.File;

import java.util.ArrayList;
import java.util.List;

import static com.kreitek.service.FileManager.calculateSize;

public class Directory extends FileSystemItemBase implements FilesDirectoriesUtilities, EditFilesDirectories, GetInfo {

    protected static final String NO_ES_VALIDO_PARA_DIRECTORIOS = "No es válido para directorios";
    protected final List<FileSystemItem> files;

    public Directory(FileSystemItem parent, String name) {
        super(parent, name);
        files = new ArrayList<>();
        // Aquí vendría lógica que rellena la lista de ficheros
    }

    public String getExtension() {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    public List<FileSystemItem> listFiles() {
        return files;
    }

    public void addFile(FileSystemItem file) {
        if (!files.contains(file)) {
            files.add(file);
            file.setParent(this);
        }
    }

    public void removeFile(FileSystemItem file) {
        files.remove(file);
    }

    public int getSize() {
        int totalSize = 0;

        for (FileSystemItem item : files) {
            if (item instanceof File) {
                totalSize += item.getSize();
            } else if (item instanceof Directory) {
                totalSize += calculateSize(item.listFiles());
            }
        }

        return totalSize;
    }

    public void open() {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    public void setPosition(int numberOfBytesFromBeginning) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    public byte[] read(int numberOfBytesToRead) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    public void write(byte[] buffer) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);

    }

    public void close() {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }
}


