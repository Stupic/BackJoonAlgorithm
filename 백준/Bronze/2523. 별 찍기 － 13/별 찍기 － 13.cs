using System;
using System.Security.Cryptography;

namespace Backjoon
{

    class P2523
    {
        static void Main(string[] args)
        {
            int n;
            int i,j ;

            n = Convert.ToInt32(Console.ReadLine());

            for (i= 1; i<=2*n-1; i++)
            {
                for(j= 0; j< n-Math.Abs(i-n); j++)
                {
                    Console.Write("*");
                }

                Console.WriteLine();
            }

        }
    }

}