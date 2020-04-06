public class Demo
{
    public static void main(String[] args)
    {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        String s1 = "1";
        String s2 = "1";
        Long g = 3L;
        Long h = 2L;

        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g == (a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));
        System.out.println("=============================");


        System.out.println(a.equals(s1));
        System.out.println(s2.equals(s1));
        System.out.println(s2 == s1);

        System.out.println("===============================");
        
        int num1 = 10;
        int num2 = 20;
        swap(num1 , num2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("=================================");

        int[] arr = {1 , 2 , 3 , 4 , 5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
        System.out.println("====================================");

        show(new Cat());
        show(new Dog());

        Animal aa = new Cat();
        aa.eat();
        Cat cc  = (Cat)aa;
        cc.work();
    }

    public static void swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void change(int[] arr)
    {
        arr[0] = 0;
    }

    public static void show(Animal a)
    {
        a.eat();
        if(a instanceof Cat)
        {
            Cat c = (Cat)a;
            c.work();
        }
        else if(a instanceof Dog)
        {
            Dog c = (Dog)a;
            c.work();
        }
    }

}



abstract class Animal
{
    abstract void eat();
}

class Cat extends Animal
{
    public void eat()
    {
        System.out.println("eat fish");
    }
    public void work()
    {
        System.out.println("catch mouse");
    }
}

class Dog extends Animal
{
    public void eat()
    {
        System.out.println("chi gutou");
    }
    public void work()
    {
        System.out.println("kanjia");
    }
}


