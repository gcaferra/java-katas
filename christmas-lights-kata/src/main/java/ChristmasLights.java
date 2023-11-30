public class ChristmasLights {
    private final int[][] grid = new int[1000][1000];

    public int getStatus(int x, int y) {
        return grid[x][y];
    }

    public void turnOn(int x1, int y1, int x2, int y2) {
        for(int col = x1; col <= x2; col++)
            for(int row = y1; row <= y2; row++)
                grid[col][row] = 1;
    }
    public void turnOff(int x1, int y1, int x2, int y2) {
        for(int col = x1; col <= x2; col++)
            for(int row = y1; row <= y2; row++)
                grid[col][row] = 0;
    }
    public void toggle(int x1, int y1, int x2, int y2) {
        for(int col = x1; col <= x2; col++)
            for(int row = y1; row <= y2; row++)
                grid[col][row] = grid[col][row] == 0 ? 1: 0;
    }
}
