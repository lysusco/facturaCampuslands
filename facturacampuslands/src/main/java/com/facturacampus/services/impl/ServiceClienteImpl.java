package com.facturacampus.services.impl;

import java.util.List;

import com.facturacampus.exceptiones.ClienteNullException;
import com.facturacampus.respository.CrudRepositoryCliente;
import com.facturacampus.respository.models.Cliente;
import com.facturacampus.services.ServiceCliente;

public class ServiceClienteImpl implements ServiceCliente{

    private final CrudRepositoryCliente crudRepositoryCliente;

    public ServiceClienteImpl(CrudRepositoryCliente crudRepositoryCliente){
        this.crudRepositoryCliente = crudRepositoryCliente;
    }

    @Override
    public List<Cliente> listar() {
        return this.crudRepositoryCliente.listar();
    }

    @Override
    public Cliente porDocumento(String documento) throws ClienteNullException {
        Cliente cliente = this.crudRepositoryCliente.porDocumento(documento);
        if(cliente != null){
            return cliente;
        }else{
            throw new ClienteNullException("NO se encontro cliente por id");
        }
    }

    @Override
    public void crear(Cliente cliente) {
        this.crudRepositoryCliente.crear(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        this.crudRepositoryCliente.editar(cliente);
    }

    @Override
    public void eliminar(String id) {
        this.crudRepositoryCliente.eliminar(id);
    }
    
}
