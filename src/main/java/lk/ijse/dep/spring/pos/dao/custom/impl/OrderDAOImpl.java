package lk.ijse.dep.spring.pos.dao.custom.impl;

import lk.ijse.dep.spring.pos.dao.CrudDAOImpl;
import lk.ijse.dep.spring.pos.dao.custom.OrderDAO;
import lk.ijse.dep.spring.pos.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl extends CrudDAOImpl<Order, Integer> implements OrderDAO {

    @Override
    public int getLastOrderId() {
        Integer i = (Integer) getSession().createNativeQuery("SELECT id FROM `Order` ORDER BY id DESC LIMIT 1")
                .uniqueResult();
        return (i == null) ? 0 : i;
    }

    @Override
    public boolean existsByCustomerId(String customerId) {
        return getSession().createNativeQuery("SELECT * FROM `Order` WHERE id=?1")
                .setParameter(1, customerId).uniqueResult() != null;
    }
}
