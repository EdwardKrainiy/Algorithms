package kruskal;

class Edge{
    int fromPoint;
    int toPoint;
    int weight;

    Edge(int fromPoint, int toPoint, int weight) {
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.weight = weight;
    }

    public int compareTo(Edge edge) {
        if (weight != edge.weight) {
            if(weight < edge.weight){
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
