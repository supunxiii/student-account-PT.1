public class Student{
    String studentName;
    String studentAddress;
    int currentLevel;
    int passMark = 50;

    public Student(String studentName, String studentAddress, int currentLevel){
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.currentLevel = currentLevel;
    }

    public void displayValue(){
        System.out.println("------------- Student Details -------------");
        System.out.println();
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Address: " + studentAddress);
        System.out.println("Current Level: " + currentLevel);
    }

    public boolean passCheck(double mark1, double mark2, double mark3){
        boolean result;
        double moduleMark = (mark1 + mark2 + mark3) / 3;
        if (moduleMark > 50){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
