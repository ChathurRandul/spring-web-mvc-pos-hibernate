package lk.ijse.dep.spring.pos.dao.custom.impl;

import lk.ijse.dep.spring.pos.dao.CrudDAOImpl;
import lk.ijse.dep.spring.pos.dao.custom.OrderDetailDAO;
import lk.ijse.dep.spring.pos.entity.OrderDetail;
import lk.ijse.dep.spring.pos.entity.OrderDetailPK;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDetailDAOImpl extends CrudDAOImpl<OrderDetail, OrderDetailPK> implements OrderDetailDAO {

    @Override
    public boolean existsByItemCode(String itemCode) {
        return getSession().createNativeQuery("SELECT * FROM OrderDetail WHERE item_code=?1")
                .setParameter(1, itemCode).uniqueResult() != null;
    }
}
