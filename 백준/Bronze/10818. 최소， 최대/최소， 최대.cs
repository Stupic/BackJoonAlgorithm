using System;
using System.Security.Cryptography;

namespace Backjoon
{

    class P10818
    {
        static void Main(String[] args)
        {
            int max= -1000000;
            int min = 1000000 ;
            int i;
            int n = Convert.ToInt32(Console.ReadLine());

            String[] arry = Console.ReadLine().Split(' ');

            for(i = 0; i<n; i++)
            {
                if (Convert.ToInt32(arry[i]) > max)
                    max = Convert.ToInt32(arry[i]);

                if (Convert.ToInt32(arry[i]) < min)
                    min = Convert.ToInt32(arry[i]);
            }

            Console.WriteLine(min + " " + max);
            
        }
    }
}