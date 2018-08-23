package com.dev4ag;

public class Big2LittleEndian {

    /**
     * Reformats a Little Endian value to bigEndian
     * @param val the value to transform
     * @return Big Endian Value
     */
    public static short short2LittleEndian(short val){
        return (short)(((val&0xff00)>>>8) + ((val&0x00ff)<<8));
    }

    /**
     * Reformats a Little Endian value to bigEndian
     * @param val the value to transform
     * @return Big Endian Value
     */
    public static int int2LittleEndian(int val){
        return
                (  ( val&0xff000000 ) >>> 24 ) +
                ( (( val&0x00ff0000 ) >>> 16 ) << 8 ) +
                ( (( val&0x0000ff00 ) >>>  8 ) << 16 ) +
                ( (( val&0x000000ff )        ) << 24 )
                ;
    }

    /**
     * Reformats a Little Endian value to bigEndian
     * @param val the value to transform
     * @return Big Endian Value
     */
    public static long long2LittleEndian(long val){
        return
                ( (val&0xff00000000000000L) >>> 56 ) +
                (((val&0x00ff000000000000L) >>> 48 ) << 8 ) +
                (((val&0x0000ff0000000000L) >>> 40 ) << 16 ) +
                (((val&0x000000ff00000000L) >>> 32 ) << 24 ) +
                (((val&0x00000000ff000000L) >>> 24 ) << 32 ) +
                (((val&0x0000000000ff0000L) >>> 16 ) << 40 ) +
                (((val&0x000000000000ff00L) >>> 8  ) << 48 ) +
                (((val&0x00000000000000ffL)        ) << 56 )
                ;
    }

    /**
     * ================================================================================
     *          The other way arround
     *          Fun fact: If you turn the bytes, the bytes turn. If you do it twice, you undo it.
     *          Turn AB to BA and turn it again => AB. Magic :)
     *          So, it's all basically the same functions.
     *
     *          However, we create some alias functions to make it
     *          readable in your source code, what you assume to do :)
     */

    /**
     * Reformats a Little Endian value to bigEndian
     * @param val the value to transform
     * @return Big Endian Value
     */
    public static int intFromLittleEndian(int val){
        return int2LittleEndian(val);
    }

    public static short shortFromLittleEndian(short val){
        return short2LittleEndian(val);
    }

    public static long longFromLittleEndian(long val){
        return long2LittleEndian(val);
    }

}
