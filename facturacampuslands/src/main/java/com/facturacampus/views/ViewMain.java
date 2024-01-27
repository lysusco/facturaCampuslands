package com.facturacampus.views;

import java.util.Scanner;

import com.facturacampus.respository.impl.CrudRepositoryClienteImpl;
import com.facturacampus.services.ServiceCliente;
import com.facturacampus.services.impl.ServiceClienteImpl;

public class ViewMain {

    public static final ServiceCliente serviceCliente = new ServiceClienteImpl(new CrudRepositoryClienteImpl());
    public static final Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int op = 0;

        do {
            op = menuMain(); 
            switch (op) {
                case 1:
                    ViewCliente.startMenu();
                    break;
                default:
                    break;
            }   
        } while (op >= 1 && op < 2);
    }
    private static int menuMain() {
        System.out.println("---Aplicacion de Facturacion---");
        System.out.println("1. Modulo de Cliente");
        System.out.println("2. Salir");
        return leer.nextInt();
    }
}