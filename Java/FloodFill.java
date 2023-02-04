package leetcode.Java;

class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        floodFill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
     
    public static void floodFill(int[][] image, int sr, int sc, int color, int old) {
        if(sr >= 0 && sc >= 0 && sr < image.length && sc < image[sr].length) {
            if(image[sr][sc] != old || image[sr][sc] == color) {
                return;
            } else if (image[sr][sc] == old) { 
                image[sr][sc] = color; 
            }
             
            floodFill(image, sr-1, sc, color, old);	// up
            floodFill(image, sr, sc+1, color, old);  // right
            floodFill(image, sr+1, sc, color, old);	// down
            floodFill(image, sr, sc-1, color, old);	// left
         }
     }
 }