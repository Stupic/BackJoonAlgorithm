using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            Solution s = new Solution();
            s.P2941();
        }
    }
}

public class Solution
{
    public void P2941()
    {
        String arg = Console.ReadLine();
        String[] args;
        String[] excep = new string[] { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        int Acount = 0;
        int count = 0;

        for (int i = 0; i < excep.Length; i++)
        {
            args = arg.Split(excep[i]);
            count += args.Length - 1;
            arg = "";
            for (int j = 0; j < args.Length; j++)
            {
                arg += args[j];
                arg += "@";
                Acount++;
            }
        }  //nljj

        count += arg.Length;

        Console.WriteLine(count-Acount);

    }
}