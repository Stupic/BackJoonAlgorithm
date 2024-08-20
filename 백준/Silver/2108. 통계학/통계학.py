import sys

# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

n = int(input())

ary = [0] * 8000
n_average = 0
n_min = 4000
n_max = -4000
n_count = 0
n_sort = []
n_list = []
zero = [0]

for i in range(n):
    input = int(sys.stdin.readline())
    if(input>0):
        ary[input - 1] += 1
    elif(input<0):
        ary[input] += 1
    else:
        zero[input] += 1


for i in range(0, 4000):
    if(ary[i] > 0):
        n_average += (i+1) * ary[i]
        n_max = i+1 if n_max < i+1 else n_max
        n_min = i+1 if n_min > i+1 else n_min
        for k in range(ary[i]):
            n_sort.append(i+1)

    mi = int((i+1)*(-1))
    if(ary[mi] > 0):
        n_average += mi * ary[mi]
        n_max = mi if n_max<mi else n_max
        n_min = mi if n_min>mi else n_min
        for k in range(ary[mi]):
            n_sort.append(mi)

    #print(f'{i} {ary[i]}  {mi} {ary[mi]}')
    mi = i if ary[mi]<ary[i] else mi
    if(ary[n_count] == ary[mi]):
        n_list.append(mi) if mi<0 else n_list.append(mi+1)
    elif(ary[n_count] < ary[mi]):
        n_count = mi
        n_list.clear()
        n_list.append(mi) if mi<0 else n_list.append(mi+1)

if(zero[0]>0):
    for k in range(zero[0]):
        n_sort.append(0)

    n_max = 0 if n_max < 0 else n_max
    n_min = 0 if n_min > 0 else n_min
    if(zero[0] == ary[n_count]):
        n_list.append(0)
    elif (ary[n_count] < zero[0]):
        n_count = 0
        n_list.clear()
        n_list.append(0)

n_sort.sort()
n_list.sort()

print(f'{round(n_average/n)}')
print(f'{n_sort[int(len(n_sort)/2)]}')
print(f'{n_list[1] if len(n_list)>1 else n_list[0]}')
print(f'{abs(n_max -n_min)}')

