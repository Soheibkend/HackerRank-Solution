public class LibraryFine {

    // Complete the libraryFine function below.
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        
    int fine=0;
    if(y2 == y1){
        if(m2 == m1 ){
            if(d2 < d1){
                fine = (d1 - d2) * 15;
            }
            
        }
        if (m2 < m1){
            fine = (m1 - m2) * 500;
        }
    }
    if (y2 < y1){
        fine = 10000;
    } 
    return fine;
              

    }
}