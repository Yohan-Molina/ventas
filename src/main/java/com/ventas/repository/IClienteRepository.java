package com.ventas.repository;

import com.ventas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
