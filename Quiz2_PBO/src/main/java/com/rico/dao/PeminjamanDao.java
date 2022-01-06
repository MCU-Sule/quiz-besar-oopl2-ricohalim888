package com.rico.dao;
/**
 * Rico Halim 1972014
 */
import com.rico.entity.Peminjaman;
import com.rico.util.HibernateUtil;
import javafx.collections.FXCollections;

import java.util.List;

public class PeminjamanDao implements DaoService<Peminjaman>{

    @Override
    public int addData(Peminjaman data) {
        rSession s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.save(data);
        t.commit();
        s.close();
        return 0;
    }

    @Override
    public int delData(Peminjaman data) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.delete(data);
        t.commit();
        s.close();
        return 0;
    }

    @Override
    public int updateData(Peminjaman data) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        s.update(data);
        t.commit();
        s.close();
        return 0;
    }

    @Override
    public List<Peminjaman> showData() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder b=session.getCriteriaBuilder();
        CriteriaQuery<Peminjaman> cq= b.createQuery(Peminjaman.class);
        cq.from(Peminjaman.class);
        List<Peminjaman> categoryList=session.createQuery(cq).getResultList();
        return FXCollections.observableArrayList(categoryList);
    }
}

