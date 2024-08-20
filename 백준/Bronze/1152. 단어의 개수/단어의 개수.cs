using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            Solution s = new Solution();
            s.P1152();
        }
    }

}
public class Solution
{
    public void P1152()
    {
        
          int countnull = 0;
        String args = Console.ReadLine();
        String[] splitargs = args.Split(" ");
        for(int i = 0; i<splitargs.Length; i++)
        {
            if (splitargs[i].Equals(""))
                countnull++;
        }

        Console.WriteLine(splitargs.Length-countnull);
         
    }
}