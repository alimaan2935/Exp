package DFS;

public class Graph {
    Vertex[] adjLists;

    private void dfs(int v, boolean[] visited) {

        visited[v] = true;

        System.out.println("Visiting " + adjLists[v].name);


        for (Neighbor nbr = adjLists[v].adjList; nbr!=null; nbr=nbr.next) {
            if (!visited[nbr.vertexNum]) {
                System.out.println(adjLists[v].name + "--" + adjLists[nbr.vertexNum].name);
                dfs(nbr.vertexNum, visited);
            }
        }

    }

    public void dfs() {
        boolean[] visited = new boolean[adjLists.length];
        for (int v=0; v< visited.length; v++) {
            if (!visited[v]) {
                dfs(v, visited);
            }
        }
    }

}
