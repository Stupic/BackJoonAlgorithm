using System;

namespace Backjoon
{
    class P14681
    {
        static void Main(string[] args)
        {
            int a, b;
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToInt32(Console.ReadLine());

            if(a*b > 0)
            {
                if (a > 0)
                    Console.WriteLine(1);
                else
                    Console.WriteLine(3);
            }
            else 
            { 
                if(a>0)
                    Console.WriteLine(4);

                else
                    Console.WriteLine(2);

            }

        }
    }
}