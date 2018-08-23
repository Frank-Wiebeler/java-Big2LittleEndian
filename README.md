# java-Big2LittleEndian

Java handles multiple-byte-Values as Little Endian. This small class helps to convert to BigEndian

## What is BigEndian and LittleEndian
(**Remark**: For simplicity we talk only about unsigned values here)
Binary files consist of bytes.

For values bigger 255 (0b11111111), you need to store them in multiple bytes.

So, if you have a value that fits in 2 Bytes "Byte 0" and "Byte 1", the question is: Where is the part of the 2 Bytes value, that represents the Value-Part 0-255 and where is the part, that represents the bigger values.

For example, if you have 1234, its Binary:

0b 11010010 00000100 in Little Endian

0b 11010010 00000100 in Big Endian

 ## Where is that used?

 For example in CanBus, LittleEndian vs. BigEndian or "Intel-Format" vs. "Motorola Format" is a very common issue.