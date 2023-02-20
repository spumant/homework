a = list(map(int, input().split()))

a = sorted(a, reverse=True)

num = float('inf')
for i in range(1, len(a)):
    if a[i] - a[i - 1] < num:
        num = a[i] - a[i - 1]

for i in range(1, len(a)):
    if a[i] - a[i - 1] == num:
        print((a[i], a[i - 1]))
