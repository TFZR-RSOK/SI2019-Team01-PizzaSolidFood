package com.psf.psfrest.repository;

import com.psf.psfrest.model.Procedures;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ProceduresRepository extends CrudRepository<Procedures, Integer> {
    @Transactional
    @Procedure(procedureName = "order_procedure")
    void order(String mail, String productName, String payment, int quantity, int orderNum);

    @Transactional
    @Procedure(procedureName = "additions_procedure_premium")
    void additionsForPremiumUsers(String productName, int orderNum, String additionName);

    @Transactional
    @Procedure(procedureName = "complete_order_procedure")
    void completeOrder(int orderNum, String userMail);


}
