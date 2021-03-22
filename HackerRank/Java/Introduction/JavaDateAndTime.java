import java.time.LocalDate;
class JavaDateAndTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        
        return String.valueOf(dt.getDayOfWeek());
        
    }

}

