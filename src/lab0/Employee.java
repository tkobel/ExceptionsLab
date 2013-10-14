package lab0;

import java.util.Date;
import java.util.regex.*;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee{
    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    public static final int MIN_NAME_LENGTH = 2;
    public static final String DAYS_VACATION_ERR = "daysVacation must be in the range"
                    + "of " + MIN_VACATION_DAYS + "-" + MAX_VACATION_DAYS;
    public static final String NAME_LENGTH_ERR = "name length must be greater than "
                    + MIN_NAME_LENGTH;
    public static final String DATE_ERR = "Date cannot be null";
    public static final String SSN_ERR = "ssn must in in the format of '###-##-####'";
    public static final String SSN_REGEX = "^\\d{3}-\\d{2}-\\d{4}$";
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;
    

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setHireDate(hireDate);
        setDaysVacation(daysVacation);
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public final void setDaysVacation(int daysVacation) {
        if(daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS) {
            throw new IllegalArgumentException(DAYS_VACATION_ERR);
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < MIN_NAME_LENGTH) {
            throw new IllegalArgumentException(NAME_LENGTH_ERR);
        }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public final void setHireDate(Date hireDate) {
        if(hireDate == null) {
            throw new IllegalArgumentException(DATE_ERR);
        }
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        if (lastName == null || lastName.length() < MIN_NAME_LENGTH) {
            throw new IllegalArgumentException(NAME_LENGTH_ERR);
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        if (!ssn.matches(SSN_REGEX)) {
            throw new IllegalArgumentException(SSN_ERR);
        }
        this.ssn = ssn;
    }  
}
