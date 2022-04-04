package com.kreitek.files;

public interface FilesDirectoriesUtilities {

    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}
