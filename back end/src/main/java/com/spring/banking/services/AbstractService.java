package com.spring.banking.services;

import java.util.List;

/**
 * @author jaouad err
 */
public interface AbstractService<T> {

  Integer save(T dto);

  List<T> findAll();

  T findById(Integer id);

  void delete(Integer id);

}
