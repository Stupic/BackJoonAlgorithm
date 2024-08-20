using System;

namespace Backjoon
{
    class main
    {
        static void Main(String[] args)
        {
            Solution s = new Solution();
            s.P1316();
        }
    }
}


public class Solution
{
    public void P1316()
    {
        int n = Convert.ToInt32(Console.ReadLine());
        int count = 0;
        int i, j;
        for( i = 0; i<n; i++)
        {
            String group ="";
            char target = ' ';
            Boolean check = true;
            String arg = Console.ReadLine();
            for(j = 0; j<arg.Length; j++)
            {


                if (target.Equals(' '))
                {
                        target = arg[j];
                }
                else if (!target.Equals(arg[j]))
                {
                    group += target;
 
                    if (group.IndexOf(arg[j]) !=-1)
                    {
                        check = false;
                        break;
                    }
                    else
                    {
                        
                        target = arg[j];
                    }
                }
 
               
            }

    
            if (check == true)
                count++;
        }
        Console.WriteLine(count);
    }
}