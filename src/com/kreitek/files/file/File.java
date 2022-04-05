package com.kreitek.files.file;

import com.kreitek.files.*;

import java.util.List;

public class File extends FileSystemItemBase implements FilesDirectoriesUtilities, EditFilesDirectories, GetInfo {

    private int size = 0;
    protected boolean isOpen = false;
    private int position = 0;

    public File(FileSystemItem parent, String name) {
        super(parent, name);
    }

    public String getExtension() {
        String extension = "";
        int indexOfLastDot = getName().lastIndexOf(".");
        if (indexOfLastDot > 0) {
            extension = getName().substring(indexOfLastDot + 1);
        }
        return extension;
    }

    public List<FileSystemItem> listFiles() {
        throw new UnsupportedOperationException("No es válido para ficheros");
    }

    public void addFile(FileSystemItem file) {
        throw new UnsupportedOperationException("No es válido para ficheros");
    }

    public void removeFile(FileSystemItem file) {
        throw new UnsupportedOperationException("No es válido para ficheros");
    }

    public int getSize() {
        return size;
    }

    public void setPosition(int numberOfBytesFromBeginning) {
        if (!isOpen) {
            throw new UnsupportedOperationException("Debe abrir el fichero primero");
        }
        if (numberOfBytesFromBeginning > size) {
            throw new UnsupportedOperationException("La posición no puede ser mayor que el tamaño del fichero");
        }
        this.position = numberOfBytesFromBeginning;
    }

    public byte[] read(int numberOfBytesToRead) {
        if (position + numberOfBytesToRead > size) {
            numberOfBytesToRead = size - position;
        }
        // Aquí habría lógica que lee el contenido del fichero
        byte[] buffer = new byte[numberOfBytesToRead];
        position += numberOfBytesToRead;
        return buffer;
    }

    public void write(byte[] buffer) {
        // Aquí habría lógica que escribiría en el fichero
        size += buffer.length;
        position += buffer.length;
    }

    public void close() {
        isOpen = false;
    }

    public void open() {
        isOpen = true;
        // Aquí vendría código que actualizaría también this.size
    }

}

