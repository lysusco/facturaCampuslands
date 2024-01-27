package com.facturacampus.utils;

import java.util.ArrayList;
import java.util.List;

import com.facturacampus.respository.models.Cliente;

import lombok.Data;

@Data
public class ConexionBDList {
    private static ConexionBDList conexion;
    private List<Cliente> listaClientes;

    private ConexionBDList(){
        listaClientes = new ArrayList<>();
        this.loadData();
    }

    public static ConexionBDList getConexion(){
        if(conexion != null) {
            return conexion;
        }else{
            conexion = new ConexionBDList();
            return conexion;
        }
    }

    private void loadData(){
        getLoadDataClientes();
    }

    private void getLoadDataClientes(){
        listaClientes.add(new Cliente("Juan", "Perez", "jperez@gmail.com", "dirección", "celular", "13822001"));
        listaClientes.add(new Cliente("Maria", "Gomez", "mariag@gmail.com", "dirección", "celular", "13822002"));
        listaClientes.add(new Cliente("Andres", "Sarmiento", "andress@gmail.com", "dirección", "celular", "13822003"));
        listaClientes.add(new Cliente("Lizeth", "Villamizar", "lizethv@gmail.com", "dirección", "celular", "13822004"));
        listaClientes.add(new Cliente("Gladys", "Moreno", "gladysm@gmail.com", "dirección", "celular", "13822005"));
        listaClientes.add(new Cliente("Sebastian", "Dominguez", "sebastian@gmail.com", "dirección", "celular", "13822006"));
        listaClientes.add(new Cliente("Maura", "Sabolla", "mauras@gmail.com", "dirección", "celular", "13822007"));
        listaClientes.add(new Cliente("Catalina", "Moreno", "catalinam@gmail.com", "dirección", "celular", "13822008"));
        listaClientes.add(new Cliente("Celina", "Torres", "celinat@gmail.com", "dirección", "celular", "13822009"));
        listaClientes.add(new Cliente("Diego", "Rangel", "diegor@gmail.com", "dirección", "celular", "13822010"));
        listaClientes.add(new Cliente("Camilo", "Rodriguez", "camilor@gmail.com", "dirección", "celular", "13822011"));
        listaClientes.add(new Cliente("Diana", "Tarazona", "dianat@gmail.com", "dirección", "celular", "13822012"));
    }
}
