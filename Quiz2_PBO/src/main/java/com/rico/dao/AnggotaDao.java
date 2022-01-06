package com.rico.dao;
/**
 * Rico Halim 1972014
 */
import com.rico.entity.Anggota;
import com.rico.util.HibernateUtil;
import javafx.collections.FXCollections;

import java.util.List;

public class AnggotaDao implements DaoService<Anggota>{
    @Override
    public int addData(Anggota data) {
        rSession s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.save(data);
        t.commit();
        s.close();
        return 0;
    }

    @Override
    public int delData(Anggota data) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.delete(data);
        t.commit();
        s.close();
        return 0;
    }

    @Override
    public int updateData(Anggota data) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.update(data);
        t.commit();
        s.close();
        return 0;
    }

    @Override
    public List<Anggota> showData() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder b=session.getCriteriaBuilder();
        CriteriaQuery<Anggota> cq= b.createQuery(Anggota.class);
        cq.from(Anggota.class);
        List<Anggota> categoryList=session.createQuery(cq).getResultList();
        return FXCollections.observableArrayList(categoryList);
    }
}
