class tree():
    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right


def get_value(node, x):
    if x == node.data:
        return id(node)
    elif x > node.data:
        get_value(node.right, x)
    else:
        get_value(node.left, x)


node = tree(0)
x = int(input())
address = get_value(node, x)
print(address)
