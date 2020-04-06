import java.lang.*;
public class Test01
{
    public static void main(String[] args)
    {
        System.out.println("十进制转十六进制: " + Integer.toHexString(10));
        System.out.println("十进制转零八进制: " + Integer.toOctalString(10));
        System.out.println("十进制转零二进制: " + Integer.toBinaryString(10));
        System.out.println("十六进制转十进制: " + Integer.valueOf("FFF" , 16).toString());
        System.out.println("零八进制转十进制: " + Integer.valueOf("777" , 8).toString());
        System.out.println("零二进制转十进制: " + Integer.valueOf("0101" , 2).toString());
        System.out.println("==============================");

    
        System.out.println("9的二进制是: " + Integer.toBinaryString(9) + ", 5的二进制是: " + Integer.toBinaryString(5) + ", 9和5的按位或是: " + String.valueOf(9|5));
        System.out.println("9的二进制是: " + Integer.toBinaryString(9) + ", 5的二进制是: " + Integer.toBinaryString(5) + ", 9和5的按位异或是: " + String.valueOf(9^5));
        System.out.println("9的二进制是: " + Integer.toBinaryString(9) + ", 5的二进制是: " + Integer.toBinaryString(5) + ", 9和5的按位与是: " + String.valueOf(9&5));
        System.out.println("9的二进制是: " + Integer.toBinaryString(9) + ", 5的二进制是: " + Integer.toBinaryString(5) + ", 9和5的按位左移是: " + String.valueOf(9<<5));
        System.out.println("9的二进制是: " + Integer.toBinaryString(9) + ", 5的二进制是: " + Integer.toBinaryString(5) + ", 9和5的按位右移是: " + String.valueOf(9>>5));
        System.out.println("9的二进制是: " + Integer.toBinaryString(9) + ", 5的二进制是: " + Integer.toBinaryString(5) + ", 9和5的无符号右移是: " + String.valueOf(9>>5));
        System.out.println("9的取反是: " + ~9 + ", 5的取反是: " + ~5);
    }
}
