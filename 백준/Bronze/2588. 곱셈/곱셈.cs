using System;

namespace Backjoon
{
    class P2588
    {
        static void Main(string[] args)
        {
            int a, b;
            a= Convert.ToInt32( Console.ReadLine());
            b= Convert.ToInt32(Console.ReadLine());


            Console.WriteLine("{0}", a * (b % 10));
            Console.WriteLine("{0}", a * ((b % 100)-(b%10))/10);
            Console.WriteLine("{0}", a * (b - (b % 100)) /100);
            Console.WriteLine("{0}", a * b);

        }
    }

}