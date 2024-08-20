using System;
using System.Security.Cryptography;

namespace Backjoon
{
    class P10996
    {
        static void Main(string[] args)
        {
            int n;
            int i, j;

            n = Convert.ToInt32(Console.ReadLine());

            if(n == 1)
            {
                Console.Write("*");
                return;
            }

            for (i = 1; i <= 2* n; i++)
            {
                for (j = 1; j <= n; j++)
                {
                    if (i % 2 == j % 2)
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }

                Console.WriteLine();
            }

        }
    }
}