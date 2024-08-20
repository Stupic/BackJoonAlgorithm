using System;
using System.Security.Cryptography;

namespace Backjoon
{
    class P2446
    {
        static void Main(string[] args)
        {
            int n;
            int i, j;
            int count = 0;

            n = Convert.ToInt32(Console.ReadLine());

            for (i = 1; i <= 2 * n - 1; i++)
            {
                for (j = 1; j <= 2 * n - 1; j++)
                {
                    if (j < n-Math.Abs(i-n))
                        Console.Write(" ");
                    else
                        Console.Write("*");

                    if (j == 2 * n - 1 - (n - Math.Abs(i - n))+1)
                        break;
                     
                }

                Console.WriteLine();
            }

        }
    }
}