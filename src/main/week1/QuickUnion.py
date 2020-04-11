

class QuickUnion:

    def __init__(self, n):
        self.data = [i for i in range(0, n)]

    def union(self, p, q):
        if self.are_connected(p, q) is False:
            q_root = self.get_root(q)
            p_root = self.get_root(p)
            self.data[q_root] = p_root

    def get_root(self, p):
        if self.data[p] == p:
            return p
        else:
            return self.get_root(self.data[p])

    def are_connected(self, p, q):
        return self.get_root(p) == self.get_root(q)