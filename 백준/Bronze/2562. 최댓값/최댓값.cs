using System;
using System.Security.Cryptography;

namespace Backjoon
{

    class P2562
    {
        static void Main(String[] args)
        {
            int rank = 0;
            int max = 0;
            int score = 0;
            int i;
            for(i = 0; i< 9; i++)
            {   score = Convert.ToInt32(Console.ReadLine());  
                if( max <= score ){
                    max = score;
                    rank = i;
                }
            }

            Console.WriteLine(max);
            Console.WriteLine(rank+1);
        }
    }
}