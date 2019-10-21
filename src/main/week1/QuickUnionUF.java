package main.week1;

public class QuickUnionUF implements FindUnionAlgorithm {

    private int[] id;

    public QuickUnionUF(int n){
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int getRoot(int initialNode){
        int node = initialNode;
        while(node != id[node]){
            node = id[node];
        }
        return node;
    }

    public boolean areConnected(int nodeP, int nodeQ){
        return getRoot(nodeP) == getRoot(nodeQ);
    }

    public void union(int nodeP, int nodeQ){
        int nodePRoot = getRoot(nodeP);
        int nodeQRoot = getRoot(nodeQ);
        if (nodePRoot != nodeQRoot){
            id[nodePRoot] = nodeQRoot;
        }
    }

}