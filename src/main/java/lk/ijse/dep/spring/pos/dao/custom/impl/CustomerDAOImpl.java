package lk.ijse.dep.spring.pos.dao.custom.impl;

import lk.ijse.dep.spring.pos.dao.CrudDAOImpl;
import lk.ijse.dep.spring.pos.dao.custom.CustomerDAO;
import lk.ijse.dep.spring.pos.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl extends CrudDAOImpl<Customer, String> implements CustomerDAO {

    @Override
    public String getLastCustomerId() {
        return (String) getSession().createNativeQuery("SELECT id FROM Customer ORDER BY id DESC LIMIT 1").uniqueResult();
    }
}
