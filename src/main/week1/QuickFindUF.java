package main.week1;

public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public void union(int nodeP, int nodeQ ){
        int pId = id[nodeP];
        int qId = id[nodeQ];
        for(int i = 0; i < id.length; i++){
            if(pId == id[i]){
                id[i] = qId ;
            }
        }
    }

    public Boolean areConnected(int nodeP, int nodeQ){
        return id[nodeP] == id[nodeQ];
    }

}
