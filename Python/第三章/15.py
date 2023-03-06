a = list(map(int, input().split()))
n = len(a)
low = 0
high = n - 1
while low < high:
    mid = (low + high) // 2
    if a[mid] == mid:
        print(mid)
        exit(0)
    elif a[mid] > mid:
        high = mid
    else:
        low = mid + 1
