using System;
using System.Security.Cryptography;
using System.Threading;

namespace Backjoon
{
    class P1065
    {
       
        static void Main(String[] args)
        {
            int a;
            int count =0;
            a = Convert.ToInt32(Console.ReadLine());

            for(int i = 1; i<=a; i++)
            {
                if (hansu(i) == true)
                    count++;
            }

            Console.WriteLine(count);
        }

        static Boolean hansu(int a)
        {
            int n = a; // 남은 수  
            int x;  // 이전 수
            int dif = 10; //등차  10이 나올수 없음

            if (n <=99)   // n 이 100 미만이면 한수
            {
                return true;
            }


            x = n % 10; // 1의자리수 ;

            while(n/10 != 0) // 몫이  없다는 건 한자리 뿐
            {
                n = n / 10;
                if (dif == 10) //등차가 설정되지 않았을 경우
                {             //설정하면서 넘어감
                    dif = x - n % 10;
                    x = n % 10;  
                }
                else
                {
                    if(x-  (n%10) != dif) // 이전 수 , 다음수의 차이가 전과 다르다면
                        return false;
                    else
                    {
                        x = n % 10;
  
                    }
                }
            }
            return true;
        }


    }
}