import java.util.Random;
public class RandomTest
{
    public static void main(String[] args)
    {

        long start = System.currentTimeMillis();
        System.out.println("开始时候的时间: " + start);
        Random r = new Random();
        System.out.println("生成[0 , 10)区间整数: ");
        int n1 = r.nextInt(10);
        int n2 = Math.abs(r.nextInt()%10);
        System.out.println(n1 + "\t" + n2); 

        System.out.println("生成[0 , 10]区间整数: ");
        n1 = r.nextInt(11);
        n2 = Math.abs(r.nextInt()%11);
        System.out.println(n1 + "\t" + n2);

        System.out.println("随机种子固定化: ");
        r.setSeed(666);
        for(int i = 0; i < 5 ; i++)
        {

            if(i != 4 )
            {
                if(i == 0)
                    {
                        System.out.print("[" + r.nextInt(101) + ", ");
                    }
                System.out.print(r.nextInt(101) + ", ");
           }
            else if(i == 4)
            {
                System.out.println(r.nextInt(101) + "]");
            }
        }

        Random random = new Random();
        System.out.println("Another Random Type");
        System.out.println("Long: " + random.nextLong());
        System.out.println("Double: " + random.nextDouble());
        System.out.println("Float: " + random.nextFloat());
        System.out.println("Boolean: " + random.nextBoolean());
        
        byte[] bytes = new byte[5];
        random.nextBytes(bytes);
        for(int n : bytes)
        {
            System.out.print(n);
        }

        long end = System.currentTimeMillis();
        System.out.println("结束时候的时间: " + end);
        System.out.println("一共用时: " + (end - start)  + "毫秒");
    }
}
