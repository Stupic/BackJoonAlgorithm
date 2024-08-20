using System;

namespace Backjoon
{

    class P2753
    {
        static void Main(string[] args)
        {
            int a;
            a = Convert.ToInt32(Console.ReadLine());

            if (a % 4 == 0)
            {
                if (a % 100 != 0 || a % 400 == 0)
                    Console.WriteLine("1");
                else
                    Console.WriteLine(0);
            }
            else
                Console.WriteLine(0);
        }
    }
}