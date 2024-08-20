using System;
using System.Security.Cryptography;

namespace Backjoon
{
    class P8958
    {
        static void Main(String[] args)
        {
            int Score;
            int n;
            int i;
            int j;
            String Answer;
            int Case = Convert.ToInt32(Console.ReadLine());

            for(i= 0; i<Case; i++)
            {
                Answer =  Console.ReadLine() ;
                Score = 0;
                n = 0;
                for(j = 0; j<Answer.Length; j++)
                {
                    if (Answer[j] =='O')
                        n++;
                    else
                        n = 0;

                    Score += n;
                }
                Console.WriteLine(Score);
            }

        }
    }
}