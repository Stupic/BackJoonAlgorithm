using System;
using System.Collections.Generic;
using System.Globalization;
using System.Threading;

namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P1978();
        }
    }
}




public class Solution
{
    public void P1978()
    {
        int[] primecheck = new int[1002];
        primecheck[0] = 1;
        primecheck[1] = 1;
        primecheck[2] = 0;
        List<int> n = new List<int> {};

 
        int count = 0;
        int t = Convert.ToInt32(Console.ReadLine());
        String args = Console.ReadLine();
        String[] arg = args.Split(" ");

        for(int i = 0; i <arg.Length; i++)
        {
            n.Add(Convert.ToInt32(arg[i]));
        }
        n.Sort();
        
        for (int i = 2; i<= n[n.Count-1]; i++)
        {

            if(primecheck[i] == 0)
            {

                for (int j = i; j <= n[n.Count - 1]; )
                {
                    j += i;
                    if( j<= 1001)
                    primecheck[j] = 1;

                }
            }
          
        }
        for(int i = 0; i<t; i++)
        {
            if (primecheck[n[i]] == 0)
                count++;
               
        }


        Console.WriteLine(count);
        

    }
}