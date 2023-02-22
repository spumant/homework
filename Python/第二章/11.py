class Node(object):
    def __init__(self, value=None, next=None):
        self.value = value
        self.next = next


def print_list(head):
    if not head:
        return []
    else:
        print(head.value)
        print_list(head.next)


n = int(input())
nodes = None
for i in range(n):
    nodes = Node(i, nodes)

print_list(nodes)
