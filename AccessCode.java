import java.util.Scanner;
public class AccessCode {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int correctCode = 1234; // Replace with your access code
System.out.print("Enter the access code: ");
int enteredCode = scanner.nextInt();
if (enteredCode == correctCode) {
System.out.println("Door is open.");
} 
else {
System.out.println("Access denied!");
 }
 }
 }
