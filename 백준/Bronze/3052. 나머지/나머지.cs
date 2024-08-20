using System;
using System.Security.Cryptography;

namespace Backjoon
{
    class P3052
    {
        static void Main(String[] args)
        {
            int i;
            int n = 0; ;
            int[] arry = new int[42];
            for(i =0; i<10; i++)
            {
                arry[Convert.ToInt32(Console.ReadLine())%42] = 1;
            }

            for(i = 0; i<arry.Length; i++)
            {
                if (arry[i] != 0)
                    n++;
            }

            Console.WriteLine(n);
        }
    }
}