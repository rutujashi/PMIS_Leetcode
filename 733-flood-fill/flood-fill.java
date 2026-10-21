class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        if (originalColor == color) {
            return image;
        }

        fill(image, sr, sc, originalColor, color);

        return image;
    }

    public void fill(int[][] image, int sr, int sc, int originalColor, int color) {

        if (sr < 0 || sc < 0 || sr >= image.length ||
            sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }

        image[sr][sc] = color;

        fill(image, sr - 1, sc, originalColor, color);
        fill(image, sr + 1, sc, originalColor, color);
        fill(image, sr, sc - 1, originalColor, color);
        fill(image, sr, sc + 1, originalColor, color);
    }
}