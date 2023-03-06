a = list(map(int, input().split()))


def max_and_min(a, low, high, maxx, minn):
    if low == high:
        maxx = a[high]
        minn = a[low]
    elif low == high - 1:
        maxx = max(a[0], a[1])
        minn = min(a[0], a[1])
    else:
        mid = (low + high) // 2
        lmax = 0
        lmin = 0
        lmax, lmin = max_and_min(a, low, mid, lmax, lmin)
        rmax = 0
        rmin = 0
        rmax, rmin = max_and_min(a, mid+1, high, rmax, rmin)
        maxx = max(lmax, rmax)
        minn = min(lmin, rmin)
    return maxx, minn


maxx, minn = max_and_min(a, 0, len(a) - 1, 0, 0)
print(maxx, minn)
