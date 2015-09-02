/**
 * Created by Taras_Oliinyk on 8/28/2015.
 */
public class ReportCard {


    public static void main(String[] args) {
        ReportCard rc = new ReportCard();
        char yourGrade = rc.convertGrades(88);
        System.out.println("Your grade is " + yourGrade );
        yourGrade = rc.convertGrades(79);
        System.out.println(" Your second grade is " + yourGrade);
    }

    public char convertGrades(int testResult) {

        char grade;

        if (testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80) {
            grade = 'C';

        } else {

            grade = 'D';

        }
        return grade;
    }


}
