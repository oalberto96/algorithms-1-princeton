

import unittest
from QuickFind import *

class TestFind(unittest.TestCase):

    def test_connection_work(self):
        q_find = QuickFind(10)

        q_find.union(4, 3)
        q_find.union(3, 8)
        q_find.union(6,5)
        q_find.union(9,4)
        q_find.union(2, 1)
        """
        0   1 - 2   3 - 4
                    |   |
        5 - 6   7   8   9
        """

        self.assertEqual(True, q_find.are_connected(8,9), "8 and 9 must be connected")
        self.assertEqual(False, q_find.are_connected(5,0), "8 and 9 must not be connected")
        q_find.union(5,0)
        q_find.union(7,2)
        q_find.union(6,1)
        self.assertEqual(True, q_find.are_connected(0, 7), "0 and 7 must be connected")


if __name__ == '__main__':
    unittest.main()