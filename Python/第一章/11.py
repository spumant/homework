n = int(input())


def divide(n):
    i = 2
    while i <= n / i:
        if n % i == 0:
            while n % i == 0:
                n //= i
                print(i)
        i += 1
    if n > 1:
        print(n)


divide(n)
