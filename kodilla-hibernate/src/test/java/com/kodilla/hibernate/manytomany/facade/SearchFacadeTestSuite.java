package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private SearchFacade searchFacade;

    @Test
    void testSearchCompanyByPartOfTheName(){
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        Company dataScience = new Company("Data Science");
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        companyDao.save(dataScience);
        try {
            List<Company> companies = searchFacade.searchCompanyByPartOfTheName("Ma");
        } catch (SearchProcessingException e){
            // business exception - should be handled in real application
        }
        finally {
            companyDao.deleteAll();
        }
    }

    @Test
    void testSearchEmployeeByPartOfTheName(){
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        try {
            List<Employee> employees = searchFacade.searchEmployeeByPartOfTheName("da");
        } catch (SearchProcessingException e) {
            // business exception - should be handled in real application
        }
        finally {
            employeeDao.deleteAll();
        }
    }
}
