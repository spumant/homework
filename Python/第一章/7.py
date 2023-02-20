n = int(input())
a = list(map(int, input().split()))
s = dict()
num = n // 2

for i in range(n):
    s[a[i]] += 1

for k, v in s.items():
    if v > num:
        print(k)
