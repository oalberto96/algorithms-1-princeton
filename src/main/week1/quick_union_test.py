import unittest
from QuickUnion import QuickUnion

class TestQuickUnion(unittest.TestCase):

    def test_connection_works(self):
        q_union = QuickUnion(10)
        q_union.union(4, 3)
        q_union.union(3, 8)
        q_union.union(6,5)
        q_union.union(9,4)
        q_union.union(2, 1)
        self.assertEqual(True, q_union.are_connected(8,9), "8 and 9 must be connected")
        self.assertEqual(False, q_union.are_connected(5,0), "8 and 9 must not be connected")
        q_union.union(5,0)
        q_union.union(7,2)
        q_union.union(6,1)
        self.assertEqual(True, q_union.are_connected(0, 7), "0 and 7 must be connected")

if __name__ == '__main__':
    unittest.main()