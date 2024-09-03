using System;
using System.IO;

class Program
{
    public static void Main(string[] args)
    {
        int[] ary = new int[10001];
        var sr = new StreamReader(Console.OpenStandardInput());

        var n = int.Parse(sr.ReadLine());

        for (int i = 0; i < n; i++)
        {
            ary[int.Parse(sr.ReadLine())] += 1;
        }

        var sw = new StreamWriter(Console.OpenStandardOutput());

        for (int i = 1; i < ary.Length; i++)
        {
            if (ary[i] > 0)
            {
                for (int j = 0; j < ary[i]; j++)
                {
                    sw.Write(i.ToString());
                    sw.Write(' ');
                }
            }
        }
        sr.Close();
        sw.Close();
    }
}

