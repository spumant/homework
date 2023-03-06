class tree():
    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right


def get_high(node):
    if node == None:
        return 0
    else:
        l = 1 + get_high(node.left)
        r = 1 + get_high(node.right)
        return max(l, r)


node = tree(0)
high = get_high(node)
print(high)
