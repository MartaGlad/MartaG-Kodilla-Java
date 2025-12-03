package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator { //interfejs oczekiwany przez stary system

    @Override
    public double totalSalary(String[][] workers, double[] salaries) { //metoda ze starego interfejsu
        List<Employee> employeeList = new ArrayList<>();
        for(int n = 0; n < salaries.length; n++) {
            employeeList.add(new Employee(
                    workers[n][0], workers[n][1], workers[n][2], new BigDecimal(salaries[n]))
            );
        }
        return calculateSalaries(employeeList).doubleValue(); //metoda nowego interfejsu
    }
}
