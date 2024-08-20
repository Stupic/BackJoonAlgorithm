#include<stdio.h>
long long int N, sosu[1000001], data[100000], ans = 1, cnt, tmp;
int main()
{
    int i, j;
    scanf("%lld", &N);
    sosu[1] = 1;
    for (i = 2; i <= N; i++)
    {
        if (sosu[i] == 0)
        {
            data[++cnt] = i;
            for (j = i; j <= N; j += i)
            {
                sosu[j] = 1;
            }
        }
    }
    for (i = 1; i <= cnt; i++)
    {
        tmp = N;
        while (tmp / data[i] >= 1)
        {
            tmp /= data[i];
            ans = ans*data[i] % 987654321;
        }
    }
    printf("%lld", ans);
    return 0;
}