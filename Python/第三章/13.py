class tree():
    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right


n = 0


def count(node):
    global n
    if node != None:
        if node.left != None and node.right != None:
            n = n + 1
        count(node.left)
        count(node.right)


node = tree(0)
count(node)
print(n)
