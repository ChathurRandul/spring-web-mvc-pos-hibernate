package lk.ijse.dep.spring.pos.dao.custom.impl;

import lk.ijse.dep.spring.pos.dao.CrudDAOImpl;
import lk.ijse.dep.spring.pos.dao.custom.ItemDAO;
import lk.ijse.dep.spring.pos.entity.Item;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDAOImpl extends CrudDAOImpl<Item, String> implements ItemDAO {

    @Override
    public String getLastItemCode() {
        return (String) getSession().createNativeQuery("SELECT code FROM Item ORDER BY code DESC LIMIT 1").uniqueResult();
    }

}
