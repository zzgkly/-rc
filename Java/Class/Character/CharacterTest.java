public class CharacterTest
{
    public static void main(String[] args)
    {
        System.out.println("判断是不是字母:");
        System.out.print(Character.isLetter('c') + "\t");
        System.out.println(Character.isLetter('5'));

        System.out.println("判断是不是数字:");
        System.out.print(Character.isDigit('c') + "\t");
        System.out.println(Character.isDigit('5'));

        System.out.println("判断是不是空白字符:");
        System.out.print(Character.isWhitespace('0') + "\t");
        System.out.print(Character.isWhitespace(' ')+ "\t");
        System.out.print(Character.isWhitespace('\n') + "\t");
        System.out.println(Character.isWhitespace('\t') + "\t");

        System.out.println("判断是不是大写字符:");
        System.out.print(Character.isUpperCase('c') + "\t");
        System.out.println(Character.isUpperCase('C'));

        System.out.println("判断是不是小写字符:");
        System.out.print(Character.isLowerCase('c') + "\t");
        System.out.println(Character.isLowerCase('C'));

        System.out.println("将字符转换成大写:");
        System.out.print(Character.toUpperCase('A') + "\t");
        System.out.println(Character.toUpperCase('a'));

        System.out.println("将字符转换成小写:");
        System.out.print(Character.toLowerCase('A') + "\t");
        System.out.println(Character.toLowerCase('a'));


        String str = "My name is zhouAn";
        char[] buffer = str.toCharArray();
        for(int i = 0; i < buffer.length; i++)
        {
            char ch = buffer[i];
            if(Character.isUpperCase(ch))
            {
                buffer[i] = Character.toLowerCase(ch);
            }else if(Character.isTitleCase(ch))
            {
                buffer[i] = Character.toLowerCase(ch);
            }else if(Character.isLowerCase(ch))
            {
                buffer[i] = Character.toUpperCase(ch);
            }
        }

        String str2 = new String(buffer);
        System.out.println("将首字符标题变成大写:");
        System.out.println(str2);

        System.out.println("转转成Unicode字符:");
        System.out.println(Character.getNumericValue('C'));
        System.out.println(Character.getNumericValue('6'));
    }
}
