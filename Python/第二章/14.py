n = list(map(int, input().split()))

num = int(input())


def get(l):
    if l[0] == num:
        print(id(l))
    else:
        get(l[1:])


get(n)
