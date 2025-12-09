package com.proyecto.cleanreview;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Esta clase se encarga de manejar las listas de clientes y órdenes. Aquí se agregan, procesan y generan reportes
 * básicos.
 */
public class CustomerManager {

    // Logger para reemplazar System.out.println
    private static final Logger LOGGER = Logger.getLogger(CustomerManager.class.getName());

    // Lista donde se guardan los nombres de los clientes
    private final List<String> customerList;

    // Lista donde se guardan las órdenes registradas
    private final List<String> orderList;

    // Constructor donde inicializo las listas
    public CustomerManager() {
        this.customerList = new ArrayList<>();
        this.orderList = new ArrayList<>();
    }

    /**
     * Agrega un cliente a la lista.
     *
     * @param customerName
     *            nombre del cliente
     */
    public void addCustomer(final String customerName) {
        customerList.add(customerName);
        log("Cliente agregado: " + customerName);
    }

    /**
     * Agrega una orden a la lista de órdenes.
     *
     * @param order
     *            nombre o descripción de la orden
     */
    public void addOrder(final String order) {
        orderList.add(order);
        log("Orden agregada: " + order);
    }

    /**
     * Procesa todas las órdenes asociadas a un cliente.
     *
     * @param customerName
     *            nombre del cliente
     */
    public void processOrders(final String customerName) {
        log("Procesando órdenes para: " + customerName);

        // Recorro todas las órdenes usando foreach
        for (final String order : orderList) {
            log("Procesando orden: " + order);
        }
    }

    /**
     * Genera un pequeño reporte con todos los clientes y órdenes.
     */
    public void generateReport() {
        log("=== Reporte de Clientes ===");
        for (final String customer : customerList) {
            log("Cliente: " + customer);
        }

        log("=== Reporte de Órdenes ===");
        for (final String order : orderList) {
            log("Orden: " + order);
        }
    }

    /**
     * Método centralizado para imprimir mensajes usando logger.
     */
    private void log(final String message) {
        LOGGER.info(message);
    }

    public static void main(final String[] args) {

        // Instancia final del administrador
        final CustomerManager manager = new CustomerManager();

        // Pruebas simples
        manager.addCustomer("John Doe");
        manager.addCustomer("Jane Smith");

        manager.addOrder("Orden 1");
        manager.addOrder("Orden 2");

        manager.processOrders("John Doe");
        manager.generateReport();
    }
}
