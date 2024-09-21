using System;
using System.Collections.Generic;
using System.Text;

public class Solution
{
    public void P10872()
    {
       
       
        int N = Convert.ToInt32(Console.ReadLine());

        if(N==0)
            Console.WriteLine(1);
        else
            Console.WriteLine(Pectorial(N));

        
    }
    
    int Pectorial(int N)
    {
            if (N == 1)
                return 1;


            return N * Pectorial(N - 1);
    }
}

namespace Backjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            Solution s = new Solution();
            s.P10872();
           
        }
    }
}