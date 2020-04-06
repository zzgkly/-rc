import java.util.*;
public class CollectionTest
{
    public static void main(String[] args)
    {
        //创建集合
        Collection<String> coll = new ArrayList<>();


        //向集合中每个元素添加数据
        coll.add("Java");
        coll.add("PHP");
        coll.add("Python");
        coll.add("Linux");
        coll.add("MacOX");
        System.out.println(coll + "\n======================================");


        //移除MacOX元素
        boolean rs = coll.remove("MacOX");
        System.out.println(rs);
        System.out.println(coll + "\n======================================");

        //判断集合里是否有某个元素
        boolean flag = coll.contains("MacOX");
        System.out.println(flag);
        System.out.println(coll.size());
        System.out.println(coll + "\n======================================");
        

        //把集合元素存储在数据中
        Object[] arr = coll.toArray();
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        //清除集合中所有元素
        coll.clear();
        System.out.println(coll);
    }
}
