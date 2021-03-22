public class DesignerPdfViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for(int i=0; i< word.length();i++) {
            int x = h[word.charAt(i)-'a'];
            if (x > max){
                max = x;
            }
        }
        
        return max * word.length();


    }
}