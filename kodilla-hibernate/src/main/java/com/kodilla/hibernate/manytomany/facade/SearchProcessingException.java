package com.kodilla.hibernate.manytomany.facade;

public class SearchProcessingException extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employees are not found";
    public static String ERR_COMPANY_NOT_FOUND = "Companies is not found";

    public SearchProcessingException(String message) {
        super(message);
    }
}
