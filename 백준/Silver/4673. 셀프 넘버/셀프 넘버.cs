using System;
using System.Diagnostics.CodeAnalysis;
using System.Security.Cryptography;
using System.Threading;

namespace Backjoon
{
    class P4673
    {
        static int[] notSelf = new int[10001];

        static void Main(String[] args)
        {
            int i;

            for(i= 1; i<10001; i++)
            {
                Selcheck(i);
            }
/*
            for(i = 1; i<10001; i++)
            {
                if(notSelf[i] != 1)
                Console.WriteLine(i);
            }*/


        }

        static void Selcheck(int n)
        {
            if (notSelf[n] != 1)
             Console.WriteLine(n);

            int nextN = split(n);
            
            if ( nextN<10001 && notSelf[nextN] != 1)
            {
                notSelf[nextN] = 1;
                Selcheck(nextN);
            }
        
        }


        static int split(int n)
        {
            int nextN = n;
             
            while(n/10 != 0)
            {
                nextN += n % 10;
                n = n / 10;
            }

            nextN = nextN + n;

            return nextN;

        }
    }
}