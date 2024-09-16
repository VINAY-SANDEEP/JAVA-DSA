package recersion;
import java.util.*;
public class backtracking {
    public static void main(String[] args) {
        System.out.println("How many ways to print: " + count(3, 3));
        System.out.println("..........................................................................................");
        System.out.println("See the ways to print:");
        path("", 3, 3);
        System.out.println("..........................................................................................");
        System.out.println(patharray("", 3, 3));
        System.out.println("..........................................................................................");
        System.out.println(patharray_diagonal("", 3, 3));
        System.out.println("..........................................................................................");
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        path_maze("", board, 0, 0);
        System.out.println("..........................................................................................");
         path_maze_rl("", board, 0, 0);
         System.out.println("..........................................................................................");
         int[][] path = new int[board.length][board.length];
        path_maze_rl_print("", board, 0, 0,path, 1);
    }
    static int count(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = count(row - 1, col);
        int right = count(row, col - 1);
        return left + right;
    }
    static void path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (row > 1) {
            path(p + 'D', row - 1, col);
        }
        if (col > 1) {
            path(p + 'R', row, col - 1);
        }
    } 
    static ArrayList<String> patharray(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(patharray(p + 'D', row - 1, col));
        }
        if (col > 1) {
            list.addAll(patharray(p + 'R', row, col - 1));
        }
        return list;
    }
    static ArrayList<String> patharray_diagonal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row > 1 && col > 1) {
            list.addAll(patharray_diagonal(p + 'D', row - 1, col - 1));
        }
        if (row > 1) {
            list.addAll(patharray_diagonal(p + 'V', row - 1, col));
        }
        if (col > 1) {
            list.addAll(patharray_diagonal(p + 'H', row, col - 1));
        }
        return list;
    }
    static void path_maze(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze.length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[row][col]==false) {
            return;
        }
        if (row < maze.length - 1) {
            path_maze(p + 'D', maze, row + 1, col);
        }
        if (col < maze.length - 1) {
            path_maze(p + 'R', maze, row, col + 1);
        }
    }
    static void path_maze_rl(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        if (row < maze.length - 1) {
            path_maze_rl(p + 'D', maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            path_maze_rl(p + 'R', maze, row, col + 1);
        }
        if (row > 0) {
            path_maze_rl(p + 'U', maze, row - 1, col);
         }
        if (col > 0) {
            path_maze_rl(p + 'L', maze, row, col - 1);
        }
        maze[row][col] = true;
    }
    static void path_maze_rl_print(String p, boolean[][] maze, int row, int col,int[][] path,int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
           for (int[] arr : path) {
            System.out.println(Arrays.toString(arr));
           }
           System.out.println(p);
           System.out.println();
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;
        if (row < maze.length - 1) {
            path_maze_rl_print(p + 'D', maze, row + 1, col , path , step+1);
        }
        if (col < maze[0].length - 1) {
            path_maze_rl_print(p + 'R', maze, row, col + 1, path , step+1);
        }
        if (row > 0) {
            path_maze_rl_print(p + 'U', maze, row - 1, col, path , step+1);
        }
        if (col > 0) {
            path_maze_rl_print(p + 'L', maze, row, col - 1, path , step+1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }
    static void path_maze_path(String p,int row,int col,boolean[][] maze,int[][] path,int step){
        if (row==maze.length-1 && col==maze.length-1) {
            path[row][col]=step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
              System.out.println(p);
              System.out.println();
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col]=false;
        path[row][col]=step;
        if (row < maze.length-1) {
            path_maze_path(p+'D', row+1, col, maze, path, step+1);
        }
        if (col < maze.length-1) {
            path_maze_path(p+'R', row, col+1, maze, path, step+1);
        }
        if (row > 0) {
            path_maze_path(p+'U', row-1, col, maze, path, step+1);
        }
        if (col > 0) {
            path_maze_path(p+'L', row, col-1, maze, path, step+1);
        }
        maze[row][col]=true;
        path[row][col]=0;
    }
}
