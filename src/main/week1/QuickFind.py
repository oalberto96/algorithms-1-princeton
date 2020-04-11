class QuickFind:

    def __init__(self, n):
        self.n = n
        self.data = [i for i in range(0, n)]

    def union(self, p, q):
        aux = self.data[p]
        for i in range(0, self.n):
            if self.data[i] == aux:
                self.data[i] = self.data[q]

    def are_connected(self, p, q):
        print(self.data)
        return self.data[p] == self.data[q]
