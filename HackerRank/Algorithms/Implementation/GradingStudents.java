class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    
    int n = grades.size();
    List<Integer> final_grade = new ArrayList<Integer>();
    for (int i=0; i< n ; i++ ) {
        if (grades.get(i) < 38) {
            final_grade.add(grades.get(i));
        }
        else if (grades.get(i) % 5 >= 3) {
            
            if ((grades.get(i)+(grades.get(i)%5)-1) > 100) {
                final_grade.add(100);
            }
            else {
                final_grade.add(grades.get(i)+5-(grades.get(i)%5));
            }
        }
        else {
            final_grade.add(grades.get(i));
        }
    }
    return final_grade;

    }

}