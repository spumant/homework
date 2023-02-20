n, k = map(int, input().split())
s = dict()
for i in range(n):
    num = int(input())
    s[num] = 1
    if k-num in s:
        print(num, k - num)