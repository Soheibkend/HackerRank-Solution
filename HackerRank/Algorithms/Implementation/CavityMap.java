public class Solution {

    // Complete the cavityMap function below.
static String[] cavityMap(String[] grid) {
    ArrayList<Integer> x = new ArrayList<Integer>();
    ArrayList<Integer> y = new ArrayList<Integer>();
    for (int i = 1; i < grid.length - 1; i++) {
      for (int j = 1; j < grid[i].length() - 1; j++) {
        Character c = grid[i].charAt(j);
        Character t = grid[i - 1].charAt(j);
        Character b = grid[i + 1].charAt(j);
        Character l = grid[i].charAt(j - 1);
        Character r = grid[i].charAt(j + 1);
        if (c > t && c > b && c > l && c > r) {
          x.add(i); y.add(j);
        }
      }
    }
    for (int i = 0; i < x.size(); i++) {
      grid[x.get(i)] =
          grid[x.get(i)].substring(0, y.get(i)) +
              "X" +
              grid[x.get(i)].substring(y.get(i) + 1, grid[x.get(i)].length());
    }
    return grid;
}
}