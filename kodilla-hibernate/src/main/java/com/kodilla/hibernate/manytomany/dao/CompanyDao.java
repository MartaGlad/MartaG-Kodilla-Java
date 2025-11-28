package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> retrieveCompaniesNameStartsWith(@Param("NAME_STARTS_WITH") String nameStartsWith);

    @Query
    List<Company> retrieveCompaniesByPartOfTheName(@Param("ARG") String arg);

}
