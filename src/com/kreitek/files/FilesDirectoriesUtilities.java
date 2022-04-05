package com.kreitek.files;

import java.util.List;

public interface FilesDirectoriesUtilities {

        byte[] read(int numberOfBytesToRead);
        void write(byte[] buffer);
        void setPosition(int numberOfBytesFromBeginning);
        void close();
        void open();


}
