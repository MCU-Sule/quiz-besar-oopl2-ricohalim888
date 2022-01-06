package com.rico.dao;
/**
 * Rico Halim 1972014
 */
import com.rico.entity.Buku;
import com.rico.util.HibernateUtil;
import javafx.collections.FXCollections;

import java.util.List;

public class BukuDao implements DaoService<Buku>{
    @Override
    public int addData(Buku data) {
        rSession s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.save(data);
        t.commit();
        s.close();
        return 0;
    }

    @Override
    public int delData(Buku data) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.delete(data);
        t.commit();
        s.close();
        return 0;
    }

    @Override
    public int updateData(Buku data) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.update(data);
        t.commit();
        s.close();
        return 0;
    }

    @Override
    public List<Buku> showData() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder b=session.getCriteriaBuilder();
        CriteriaQuery<Buku> cq= b.createQuery(Buku.class);
        cq.from(Buku.class);
        List<Buku> categoryList=session.createQuery(cq).getResultList();
        return (List<Buku>) FXCollections.observableArrayList(categoryList);
    }
}
