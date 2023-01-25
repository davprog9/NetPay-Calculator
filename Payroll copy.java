// David Arzumanyan
//package src.main.java.org.example;

public class Payroll {
    private String id;
    private int gross_pay;
    private double state_tax_rate;
    private double federal_tax_rate;



    /**
     * Default constructor
     * @author David Arzumanyan
     */
    public Payroll(){
        this.id = "N/A";
        this.gross_pay = 0;
        this.state_tax_rate = 0;
        this.federal_tax_rate = 0;
    }

    /**
     * Defines the employee with the following parameters`
     * @param id Defines the id of the employee
     * @param gross_pay Defines the gross_pay of the employee
     * @param state_tax_rate Defines the state tax rate of employee based on MA (Massachusetts)
     * @param federal_tax_rate Defines the federal tax rate of employee based on MA (Massachusetts)
     * @author David Arzumanyan
     */
    public Payroll(String id, int gross_pay, double state_tax_rate, double federal_tax_rate){
        this.id = id;
        this.gross_pay = gross_pay;
        this.state_tax_rate = state_tax_rate;
        this.federal_tax_rate = federal_tax_rate;
    }

    /**
     * Calculates the net pay of the employee
     * By first` calculation the state tax deduction from gross pay,
     * and then by calculating the federal tax deduction from gross pay.
     * After, the net pay is being checked using calculated numbers.
     * Returnes the net pay of the employee
     * @return double
     * @author David Arzumayan
     */
    public double net_pay(){
        double state_tax_deduction = (this.gross_pay * this.state_tax_rate) / 100;
        double federal_tax_deduction = (this.gross_pay * this.federal_tax_rate) / 100;
        double netPay = this.gross_pay - state_tax_deduction - federal_tax_deduction;

        return netPay;
    }

    /**
     * Returns the id of the employee
     * @return long
     * @author David Arzumanyan
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the gross pay of the employee
     * @return int
     * @author David Arzumanyan
     */
    public int getGross_pay() {
        return gross_pay;
    }

    /**
     * Returns the state tax rate of the employee
     * @return double
     * @author David Arzumanyan
     */
    public double getState_tax_rate() {
        return state_tax_rate;
    }

    /**
     * Returns the federal tax rate of the employee
     * @return long
     * @author David Arzumanyan
     */
    public double getFederal_tax_rate() {
        return federal_tax_rate;
    }


}
