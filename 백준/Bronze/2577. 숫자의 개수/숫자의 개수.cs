using System;
using System.Security.Cryptography;

namespace Backjoon
{

    class P2577
    {
        static void Main(String[] args)
        {
            int i; int N = 1;
            int[] arry = new int[10];
            String list;
            int n;
            for(i= 0; i<3; i++)
            {
                N = N * Convert.ToInt32(Console.ReadLine());
            }

            list = Convert.ToString(N);

            for(i = 0; i<list.Length; i++)
            { 
                n = Convert.ToInt32(list[i])-48;
                arry[n]++;
            }

            for(i= 0; i<arry.Length; i++)
            {
                Console.WriteLine(arry[i]);
            }
        }

    }
}