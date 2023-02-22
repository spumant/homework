m = -float('inf')


class Node(object):
    def __init__(self, value=None, next=None):
        self.value = value
        self.next = next


nodes = Node


def print_list(head):
    global m, nodes
    if not head:
        return []
    else:
        if head.value > m:
            m = head.value
            nodes = head
        print_list(head.next)


n = int(input())
for i in range(n):
    nodes = Node(i, nodes)
print(nodes, nodes.value)
