package com.facturacampus.services;

import java.util.List;

import com.facturacampus.exceptiones.ClienteNullException;
import com.facturacampus.respository.models.Cliente;

public interface ServiceCliente {

    List<Cliente> listar();

    Cliente porDocumento(String documento)throws ClienteNullException;

    void crear(Cliente producto);

    void editar(Cliente producto);

    void eliminar(String id);
    
}
