package com.facturacion.demo.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;


import com.facturacion.demo.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{


}
