package com.facturacampus.respository;

import java.util.List;

import com.facturacampus.respository.models.Cliente;

public interface CrudRepositoryCliente {

    List<Cliente> listar();

    Cliente porDocumento(String documento);

    void crear(Cliente cliente);

    void editar(Cliente cliente);

    void eliminar(String id);
    
}
