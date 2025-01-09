import java.util.Scanner;

public class IT24104268Lab10Q1B {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a mark: ");
        int mark = scanner.nextInt();

       
        assert mark >= 0 && mark <= 100 : "Invalid Mark"; 

       
        System.out.println("Mark is Validated");

        
        char grade = 'F'; 

        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        }

        
        assert (grade == 'A' && mark >= 75) || (grade == 'B' && mark >= 60 && mark < 75) || 
               (grade == 'C' && mark >= 50 && mark < 60) || (grade == 'D' && mark >= 40 && mark < 50) ||
               (grade == 'F' && mark < 40) : "Incorrect Grade Assigned"; 
        
        System.out.println("The grade is: " + grade);
    }
}
