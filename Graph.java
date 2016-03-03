import java.util.*;

public class Graph {

	boolean visited[];
	boolean a[][];
	boolean directed;

	Graph(int n, boolean dir)
	{
		a= new boolean[n][n];
		directed = dir;
		create();
		visited = new boolean[n];
	}
//To create a graph
	void create()
	{
		char ch;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("Enter the edge number");
			String s = sc.next();
			char x = s.charAt(0);
			char y = s.charAt(1);

			x = Character.toUpperCase(x);
			y = Character.toUpperCase(y);

			a[x-65][y-65] = true;

			if(!directed)
				a[y-65][x-65]=true;

			System.out.println("Enter y to continue");
			ch = sc.next().charAt(0);


		}while(ch=='y');	//keep taking characters

	}

//Implementation of Depth First Search(DFS)
	void dfs(int r)
	{
		System.out.println((char)(r+65));
		visited[r] = true;

		for(int c=0;c<a.length;c++)
		{
			if(a[r][c]&&!visited[c])
				dfs(c);
		}

	}

	public static void main(String args[])
	{
		Graph g = new Graph(6,false);
		g.dfs(0);
	}

}
