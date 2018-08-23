package com.dev4ag;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileBigEndian extends RandomAccessFile {
    /**
     * Copyright 2018 dev4Agriculture, Frank Wiebeler
     *
     */

    public RandomAccessFileBigEndian(String name, String mode) throws FileNotFoundException {
        super(name, mode);
    }

    public RandomAccessFileBigEndian(File file, String mode) throws FileNotFoundException {
        super(file, mode);
    }

    /**
     * Read a BiGEndian Integer as little Endian
     * @return A little endian Integer Value
     * @throws IOException forwarded from readInt
     */
    public int readIntBE() throws IOException{
        return Big2LittleEndian.int2LittleEndian( this.readInt());
    }


    /**
     * Read a BiGEndian Short as little Endian
     * @return A little endian Short Value
     * @throws IOException forwarded from readShort
     */
    public short readShortBE() throws  IOException{
        return Big2LittleEndian.short2LittleEndian( this.readShort() ) ;
    }

    /**
     * Read a BiGEndian Long as little Endian
     * @return A little endian Long Value
     * @throws IOException forwarded from readLong
     */
    public long readLongBE() throws IOException {
        return Big2LittleEndian.long2LittleEndian( this.readLong() );

    }

    /**
     * Writes a long in Little Endian Mode
     * @param val Value to write to File
     * @throws IOException forwarded from writeLong
     */
    public void writeLongBE(long val) throws IOException {
        this.writeLong( Big2LittleEndian.longFromLittleEndian(val) );
    }

    /**
     * Writes a integer in Little Endian Mode
     * @param val Value to write to File
     * @throws IOException forwarded from writeInt
     */
    public void writeIntBE(int val) throws  IOException{
        this.writeInt( Big2LittleEndian.intFromLittleEndian( val ));
    }

    /**
     * Writes a short in Little Endian Mode
     * @param val Value to write to File
     * @throws IOException forwarded from writeShort
     */
    public void writeShortBE(short val) throws IOException {
        this.writeShort( Big2LittleEndian.shortFromLittleEndian( val ));
    }


}
