import java.util.Date;
public class SystemTest
{
    public static void main(String[] args)
    {
        int[] arr1 = {0 , 1 , 2 , 3 , 4};
        int[] arr2 = new int[arr1.length];
        int[] arr3 = {9 , 9 , 9 , 9 , 9};
        //复制数组(被复制数组 , 被复制索引起始位置 , 复制数组 , 复制数组起始位置 , 复制的长度)
        System.arraycopy(arr1 , 0 , arr2 , 0 , 5);
        System.arraycopy(arr1 , 2 , arr3 , 1 , 3);

        for(int n : arr2)
        {
            System.out.println(n);
        }


        System.out.println("============================");

        for(int n : arr3)
        {
            System.out.println(n);
        }       

        System.out.println("=============================");
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000000; i++)
        {
            int a = 0;
        }

        long end = System.currentTimeMillis();
        System.out.println(-(start - end));
        System.out.println(System.getProperty("os.arch"));

        try
        {
            System.out.println("this is try");
            //System.exit(0); 
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            System.out.println("this is finally");
        }

        Date d = new Date();
        d = null;
        //垃圾回收
        System.gc();
        
        System.out.println("===================================");


        System.out.println("=====getNumericValue转换成Unicode编码显示=====");
        System.out.println("是不是一个数字(字符型): " + Character.getNumericValue('c'));
        System.out.println("是不是一个数字(整数型): " + Character.getNumericValue(5));

        System.out.println("=====isDigit确定字符是不是一个数字=====");
        System.out.println("是不是一个数字(字符型): " + Character.isDigit('5'));
        System.out.println("是不是一个数字(整数型): " + Character.isDigit(5));
        
        System.out.println("=====isLetter确定字符是不是一个字母=====");
        System.out.println("是不是一个字母(字符型): " + Character.isLetter('A'));
        System.out.println("是不是一个字母(整数型): " + Character.isLetter(5));

        System.out.println("=====isLowerCase确定字符是不是小写=====");
        System.out.println("是不是一个字母(字符型): " + Character.isLowerCase('A'));
        System.out.println("是不是一个字母(整数型): " + Character.isLowerCase(5));

    }
}
