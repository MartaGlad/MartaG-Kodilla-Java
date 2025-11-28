package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public SearchFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> searchCompanyByPartOfTheName(String arg) throws SearchProcessingException {
        List<Company> list = companyDao.retrieveCompaniesByPartOfTheName(arg);
        if (list.isEmpty()) {
            LOGGER.error(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
            throw new SearchProcessingException(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
        }
        else {
            LOGGER.info("Found companies with part of the name: " + list);
            return list;
        }
    }

    public List<Employee> searchEmployeeByPartOfTheName(String arg) throws SearchProcessingException {
        List<Employee> list = employeeDao.retrieveEmployeesByPartOfTheName(arg);
        if (list.isEmpty()) {
            LOGGER.error(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchProcessingException(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        else {
            LOGGER.info("Found employees with part of the name: " + list);
            return list;
        }
    }
}
