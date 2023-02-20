s = input()


def judge(i, j):
    while (i < j):
        if s[i] != s[j]:
            return False
        i += 1
        j -= 1
    return True


if judge(0, len(s) - 1):
    print("Yes")
else:
    print("No")
