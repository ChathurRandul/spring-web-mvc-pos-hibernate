package lk.ijse.dep.spring.pos.dao;

import lk.ijse.dep.spring.pos.entity.SuperEntity;

import java.util.List;

public interface CrudDAO<T extends SuperEntity, ID> extends SuperDAO {

    List<T> findAll();

    T find(ID id);

    void save(T entity);

    void update(T entity);

    void delete(ID id);

}
