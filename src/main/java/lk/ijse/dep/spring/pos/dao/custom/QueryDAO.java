package lk.ijse.dep.spring.pos.dao.custom;

import lk.ijse.dep.spring.pos.dao.SuperDAO;
import lk.ijse.dep.spring.pos.entity.CustomEntity;

import java.util.List;

public interface QueryDAO extends SuperDAO {

    CustomEntity getOrderInfo(int orderId);

    CustomEntity getOrderInfo2(int orderId);

    /**
     * @param query customerId, customerName, orderId, orderDate
     * @return
     * @
     */
    List<CustomEntity> getOrdersInfo(String query);

}
