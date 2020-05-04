package EmailApp;


import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;


    // Constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        // class level    local level >> 'this' keyword refers to class level variable hence this.firstName
        this.firstName  = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName + " ");

        // Call a method asking for the department > return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
//     >> setting class level variable (this.department) to equal method setDepartment()
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);

        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "Sales";
        }
        else if (deptChoice == 2) {
            return "Development";
        }
        else if (deptChoice == 3) {
            return "Accounting";
        }
        else {
            return "";
        }

    }



    // Generate a random password

    // Set mailbox capacity

    // Set the alternate email

    // Change the password


}
