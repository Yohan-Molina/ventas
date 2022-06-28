package com.ventas.service;

import com.ventas.model.Cliente;
import java.util.List;
import java.util.Optional;


public interface IClienteService    {
    
    public List<Cliente> findAllClientes();
    
    public Optional<Cliente> findClienteById(Integer id);
    
    public Cliente createCliente(Cliente cliente);
    
    public Cliente updateCliente(Cliente cliente);
    
    public void deleteCliente(Integer id);
    
}
