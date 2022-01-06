package com.rico.dao;

/**
 * Rico Halim 1972014
 */

import java.util.List;

public interface DaoService <T>{
    public int addData(T data);

    public int delData(T data);

    public int updateData(T data);

    public List<T> showData();
}
