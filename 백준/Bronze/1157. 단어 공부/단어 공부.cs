using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            Solution s = new Solution();
            s.P1157();
        }
    }

}
public class Solution
{
    public void P1157()
    {
        int[] site = new int[26] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                                   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                                   -1, -1, -1, -1, -1, -1 };

        String args = Console.ReadLine();

        for (int i = 0; i < args.Length; i++)
        {
            int asc;
            if (Convert.ToInt32(args[i])>96)
                asc = Convert.ToInt32(args[i]) - 97;
            else
                asc = Convert.ToInt32(args[i]) - 65;

            site[asc]++;
        }

        int count = -1;
        int c=65;
        int check = 1;

        for(int i = 0; i<site.Length; i++)
        {
            if(site[i] > count)
            {
                count = site[i];
                c = i + 65;
                check = 0;
            }
            else if(site[i]== count)
            {
                check = 1;
            }
   
        }

        if (check == 1)
            Console.WriteLine("?");
        else
            Console.WriteLine(Convert.ToChar(c));
  
    }}
