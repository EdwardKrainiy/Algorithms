package kruskal;

public class DSF {
    int[] setsMassive;
    int[] ranksMassive;

    DSF(int size) {
        setsMassive = new int[size];
        ranksMassive = new int[size];
        for (int i = 0; i < size; i++)
            setsMassive[i] = i;
    }

    int set(int x) {
        if(x == setsMassive[x]){
            return x;
        }
        else return setsMassive[x] = set(setsMassive[x]);
    }

    boolean union(int firstVertex, int secondVertex) {
        firstVertex = set(firstVertex);
        secondVertex = set(secondVertex);
        if (firstVertex == secondVertex)
            return false;
        if (ranksMassive[firstVertex] < ranksMassive[secondVertex]) {
            setsMassive[firstVertex] = secondVertex;
        } else {
            setsMassive[secondVertex] = firstVertex;
            if (ranksMassive[firstVertex] == ranksMassive[secondVertex])
                ranksMassive[firstVertex]++;
        }
        return true;
    }
}
