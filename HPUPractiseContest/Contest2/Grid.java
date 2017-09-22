import java.util.*;

//Breadth first search

class Grid {

	//the vertex that we use in BFS
	static class Vertex {
		//i, j is the coordinates
		//d is the distance from the source
		int i, j, d;
		Vertex(int ii, int jj, int dd) { i=ii; j=jj; d=dd; }
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();

		//read the graph into the 2D array
		int[][] graph = new int[n][m];
		for(int i = 0; i < n; i++) {
			String line = in.next();
			for(int j = 0; j < line.length(); j++)
				graph[i][j] = line.charAt(j) - '0';
		}

		//four directions
		int[] di = {1, -1, 0, 0};
		int[] dj = {0, 0, 1, -1};

		//boolean 2D array to store where a node has been visited
		//initially fill with false
		boolean[][] vis = new boolean[n][m];
		for(boolean[] x : vis) Arrays.fill(x, false);

		//BFS queue
		Queue<Vertex> q = new LinkedList<>();

		//Add the source node to the queue. 
		//since the source is always at upper left corner, i=0, j=0, d=0.
		//and set 0, 0 to be visited
		q.add(new Vertex(0, 0, 0));
		vis[0][0] = true;

		//standard BFS
		while(!q.isEmpty()) {

			//poll out one vertex from the queue.
			Vertex v = q.poll();

			//if the vertex is the destination, print out the distance and exit the program.
			if(v.i == n - 1 && v.j == m - 1) {
				System.out.println(v.d);
				System.exit(1);
			}

			//goto four directions
			for(int i = 0; i < 4; i++) {

				//The magnitute of the movement is determined by the value of the node.
				int mul = graph[v.i][v.j];
				int ii = v.i + di[i] * mul; 
				int jj = v.j + dj[i] * mul; 

				//make sure the new coordinates are in range, and it has not been visited.
				if(ii >= 0 && jj >= 0 && ii < n && jj < m && !vis[ii][jj]) {

					//set the new coordinates to be visited, and add it to the queue.
					vis[ii][jj] = true;
					q.add(new Vertex(ii, jj, v.d + 1));
				}
			}
		}

		//print -1 if there is no solution
		System.out.println(-1);
	}
}