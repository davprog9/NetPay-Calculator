// David Arzumanyan
//package src.main.java.org.example;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean condition = true;
        while(condition){
            int emp_net_pay;
            Scanner emp_id = new Scanner(System.in);
            Scanner emp_gross_pay = new Scanner(System.in);
            Scanner emp_state_tax_rate = new Scanner(System.in);
            Scanner emp_federal_tax_rate = new Scanner(System.in);

            System.out.println("Please provide the employee ID ");
            String emp_id_data = emp_id.nextLine();

            // Checking for an empty id from user
            if(emp_id_data.equals("")){
                System.out.println("Employee id is invalid! Try again please. ");
                emp_id_data = emp_id.nextLine();
            }
            // Checking if user wants to end the process
            else if (emp_id_data.equals("o")){
                System.out.println("Ending the process, thank you!");
                condition = false;
            }

            if(condition){

                System.out.println("Please provide the employee gross pay ");
                int emp_gross_pay_data = emp_gross_pay.nextInt();
                // Checking if the gross pay is a valid number
                if(emp_gross_pay_data < 0){
                    System.out.println("Employee gross pay can't be less than 0! Try again please. ");
                    emp_gross_pay_data = emp_gross_pay.nextInt();
                }

                System.out.println("Please provide the employee state tax rate ");
                // Checking if the state tax rate is a valid number
                double emp_state_tax_rate_data = emp_state_tax_rate.nextDouble();
                if(emp_state_tax_rate_data < 0){
                    System.out.println("Employee state tax rate can't be less than 0! Try again please. ");
                    emp_state_tax_rate_data = emp_state_tax_rate.nextDouble();
                }

                System.out.println("Please provide the employee federal tax rate ");
                double emp_federal_tax_rate_data = emp_federal_tax_rate.nextDouble();
                // Checking if the federal tax rate is a valid number
                if(emp_federal_tax_rate_data < 0){
                    System.out.println("Employee federal tax rate can't be less than 0! Try again please. ");
                    emp_federal_tax_rate_data = emp_federal_tax_rate.nextDouble();
                }

                // Making an object
                Payroll employee_payroll = new Payroll(emp_id_data, emp_gross_pay_data, emp_state_tax_rate_data, emp_federal_tax_rate_data);

                // Checking that net pay is a valid number
                if(employee_payroll.net_pay() < 0){
                    condition = false;
                }else{
                    System.out.println("Employee's ID : " + emp_id_data);
                    System.out.println("Employee's net pay : " + employee_payroll.net_pay() + "\n");
                }

            }

        }

    }
}