package com.facturacampus.respository.impl;

import java.util.List;

import com.facturacampus.respository.CrudRepositoryCliente;
import com.facturacampus.respository.models.Cliente;
import com.facturacampus.utils.ConexionBDList;

public class CrudRepositoryClienteImpl implements CrudRepositoryCliente{
        ConexionBDList conexion = ConexionBDList.getConexion();

        @Override
        public List<Cliente> listar() {
            return conexion.getListaClientes();
        }

        @Override
        public Cliente porDocumento(String documento) {
            Cliente resultado = null;
            for (Cliente cliente : conexion.getListaClientes()) {
                if(cliente.getDocumento().equals(documento)){
                    resultado = cliente;
                    break;
                }
            }
            return resultado;
        }

        @Override
        public void crear(Cliente cliente) {
            conexion.getListaClientes().add(cliente);
        }

        @Override
        public void editar(Cliente cliente) {
            for (Cliente clienteCurrent : conexion.getListaClientes()) {
                if(clienteCurrent.getDocumento().equals(cliente.getDocumento())){
                    clienteCurrent.setNombre(cliente.getNombre());
                    clienteCurrent.setApellido(cliente.getApellido());
                    clienteCurrent.setDireccion(cliente.getDireccion());
                    clienteCurrent.setEmail(cliente.getEmail());
                    clienteCurrent.setCelular(cliente.getCelular());
                    break;
                }
            }
        }

        @Override
        public void eliminar(String id) {
            for (Cliente cliente : conexion.getListaClientes()) {
                if (cliente.getDocumento().equals(id)) {
                    conexion.getListaClientes().remove(cliente);
                    break;
                }
            }
        }

        
}
