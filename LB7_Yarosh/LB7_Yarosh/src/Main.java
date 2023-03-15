import java.util.Scanner;
class SchoolExample {
    private int schoolNumber;
    private int numberOfStudents;
    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    };
    public int getSchoolNumber() {
        return schoolNumber;
    };
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    };
    public int getNumberOfStudents() {
        return numberOfStudents;
    };
    enum Season {
        Winter("Now is winter and we aren't studying"),
        Spring("Now is spring and we are studying"),
        Summer("Now is summer and we aren't studying"),
        Autumn("Now is autumn and we are studying");
        private String code;
        Season(String code) {
            this.code = code;
        }
        public String getCode() { return code;}
    };
    public void PrintResults() {
        System.out.println("The school number " + getSchoolNumber() + " has " + getNumberOfStudents() + " students");
        System.out.println(Season.Winter.getCode());
        System.out.println(Season.Spring.getCode());
        System.out.println(Season.Summer.getCode());
        System.out.println(Season.Autumn.getCode());
    };
}
public class Main {
    public static void main(String [] args) {
        SchoolExample mySchool = new SchoolExample();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the school number: ");
        mySchool.setSchoolNumber(in.nextInt());
        System.out.println("Enter the number of students: ");
        mySchool.setNumberOfStudents(in.nextInt());
        in.close();
        System.out.println("The results: \n");
        mySchool.PrintResults();
    };
}