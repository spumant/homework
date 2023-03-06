x, n = map(int, input().split())


def fun(x, n):
    if n == 1:
        return x
    elif n % 2 == 0:
        fv = fun(x, n // 2)
        return fv * fv
    else:
        fv = fun(x, (n - 1) // 2)
        return fv * fv * x


ans = fun(x, n)
print(ans)
