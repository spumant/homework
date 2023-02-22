str = input()


def is_palindroms(str):
    if len(str) < 1:
        return True
    else:
        return str[0] == str[-1] and is_palindroms(str[1: -1])


print(is_palindroms(str))
