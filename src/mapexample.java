import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapexample {

    public static void main(String[] args) throws IOException {

    Boolean isExit = Boolean.TRUE;
    Boolean isExitSubjects = Boolean.TRUE;
    Map<String, Map<String, Integer>> studentReport = new HashMap<>();

        while (isExit) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Student's name: ");
        String studentName = sc.next();
        Map<String, Integer> dynamicStudentMarks = new HashMap<>();
        while (isExitSubjects) {
            System.out.println(studentName + ": " + "Please enter Subject name: ");
            String subjectName = sc.next();
            System.out.println(studentName + " " + subjectName + ": " + "Please enter marks: ");
            Integer marks = (Integer) sc.nextInt();
            dynamicStudentMarks.put(subjectName, marks);
            studentReport.put(studentName, dynamicStudentMarks);
            System.out.println("Press 1 to Exit, Press 0 to Continue\n");
            Integer exitInput = sc.nextInt();
            if(exitInput == 1)
                isExitSubjects = Boolean.FALSE;
        }
        System.out.println(" If you dont have anymore student Press 1 to exit, Press 0 to continue to new Student\n");
        Integer exitOuterLoopInput = (Integer) sc.nextInt();
        if(exitOuterLoopInput == 1)
            isExit = Boolean.FALSE;
        isExitSubjects = Boolean.TRUE;
    }


        for (String nameOfStudent: studentReport.keySet()
            ) {
        System.out.println("Name of Student: "+ nameOfStudent + " " + studentReport.get(nameOfStudent));
    }

}}
