package ATM;


import java.sql.*;
import java.util.Random;
import java.util.Scanner;
public class CreateAccount {
    private Scanner sc;
    public void createAccount() throws Exception
    {
        try {
            sc=new Scanner(System.in);
            Random account_no=new Random();
            int  acc = 0;

                acc=account_no.nextInt(10000000);
            System.out.println("Your account number is  :"+acc);
            System.out.println("Enter the first Name:");
            String fn=sc.next();
            System.out.println("Enter the last name:");
            System.out.println("Enter contact No:");
            long contact=sc.nextLong();
            Random pin=new Random();
            int pin_no=0;

            System.out.println("*****	\t Your Account Has Been Created.\t      ****");
            System.out.println("\n ***Note :\t Please visit the bank to get the ATM pin number.***");
        }
        catch(Exception e)
        {
            System.out.println("\n\t  **  Seems  you haven't inputted your information .\n\tPlease Again Create your account. **");
        }


    }

    public void generalInformation() throws Exception
    {
        sc = new Scanner(System.in);
        System.out.println("Enter the account number:");
        int account_no=sc.nextInt();

//        System.out.print(accno);
//        String accinfo="\nFirst Name :  "+rs.getString("first_name")+"  "+rs.getString("last_name")+"\nAddress:   "+rs.getString("address");
//        System.out.print(accinfo);
//        String otherinfo="\nMarital Status:  "+rs.getString("marital_status")+"\nProfession:  "+rs.getString("profession")+"\nCitizenship:  "+rs.getString("citizenship")+"\nContact No:  "+rs.getLong("contact_no")+"\n";
//        System.out.print(otherinfo);
    }

    public void changePin() throws Exception
    {
        sc= new Scanner(System.in);
        System.out.println("Enter your old pin number: ");
        int pin_no4=sc.nextInt();
        System.out.println("Enter the new pin number:");
        int pin_no5=sc.nextInt();

    }


        private Scanner ac;

        void getPinNumber() throws Exception
        {
            ac = new Scanner(System.in);
            System.out.println("Enter your Account Number:");
//            int account=ac.nextInt();
//            int pin_no=rs.getInt("pin");
//            System.out.println("Your pin Number is :"+pin_no);

        }

    public void setPin(int pin)
    {

    }


}
