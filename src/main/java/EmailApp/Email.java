package EmailApp;


import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;    // class level variables used by calling this.<variable>

//  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//  Constructor to receive first name and last name (1)
    public Email(String firstName, String lastName) {
        // class level    local level >> 'this' keyword refers to class level variable hence this.firstName
        this.firstName  = firstName;
        this.lastName = lastName;
        System.out.println("\nNOAH'S EMAIL SYSTEM");
        System.out.println("\nEmail Created: " + this.firstName + " " + this.lastName + " ");
//  ^^ (1) ^^


//  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//      Call setDepartment method made in block (2)  >  also return the department (2)
        this.department = setDepartment();
        System.out.println("Department: " + this.department + "\n");
        System.out.println("*** Please note that upon entering a department code ***\n *** a random password was generated for you.***\n ");
        // Using this. calls the class level variable i.e. this.department
//  ^^ (2) ^^


//  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//      Call randomPassword method made in block (3)  > also returns a random password (3)
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your randomly generated password is: " + this.password);
    }



//  Ask for department method block (2)
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
//  ^^ (2) ^^


//  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// Password method block > Generate a random password (3)
    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyz1234567890!@#$"; // > .length() == 40 chars
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            // cast Math.random as an (int)
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
//   ^^ (3) ^^


//  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    // Set mailbox capacity

    // Set the alternate email

    // Change the password


}
