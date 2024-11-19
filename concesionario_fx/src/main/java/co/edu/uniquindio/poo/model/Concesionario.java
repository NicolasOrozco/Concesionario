package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;
import java.time.LocalDate;

public class Concesionario {
    private String nombre;
    private Collection<Empleado> empleados;
    private Collection<Empleado> blacklist;
    private Collection<Administrador> administradores;
    private Collection<Cliente> clientes;
    private Collection<Vehiculo> vehiculos;
    public Collection<Transaccion> transacciones;

    /**
     * Constructor del concesionario
     * 
     * @param nombre
     */
    public Concesionario(String nombre) {
        this.nombre = nombre;
        empleados = new LinkedList<>();
        blacklist = new LinkedList<>();
        administradores = new LinkedList<>();
        clientes = new LinkedList<>();
        vehiculos = new LinkedList<>();
        transacciones = new LinkedList<>();
    }

    /**
     * Verifica si un empleado está registrado en la lista de empleados activos.
     * 
     * @param id Identificación del empleado.
     * @return True si el empleado está registrado, de lo contrario False.
     */
    public boolean verificarEmpleado(String id) {
        boolean estaEmpleado = false;
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                estaEmpleado = true;
            }
        }
        return estaEmpleado;
    }

    /**
     * Verifica si un empleado está en la lista negra.
     *
     * @param id Identificación del empleado.
     * @return True si el empleado está en la lista negra, de lo contrario False.
     */
    public boolean verificarEmpleadoBlacklist(String id) {
        boolean estaEmpleado = false;
        for (Empleado empleado : blacklist) {
            if (empleado.getId().equals(id)) {
                estaEmpleado = true;
            }
        }
        return estaEmpleado;
    }

    /**
     * Verifica si un administrador está registrado.
     *
     * @param id Identificación del administrador.
     * @return True si el administrador está registrado, de lo contrario False.
     */
    public boolean verificarAdministrador(String id) {
        boolean estaAdministrador = false;
        for (Administrador administrador : administradores) {
            if (administrador.getId().equals(id)) {
                estaAdministrador = true;
            }
        }
        return estaAdministrador;
    }

    /**
     * Verifica si un cliente está registrado.
     *
     * @param id Identificación del cliente.
     * @return True si el cliente está registrado, de lo contrario False.
     */
    public boolean verificarCliente(String id) {
        boolean estaCliente = false;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                estaCliente = true;
            }
        }
        return estaCliente;
    }

    /**
     * Verifica si un vehículo está registrado.
     *
     * @param id Identificación del vehículo.
     * @return True si el vehículo está registrado, de lo contrario False.
     */
    public boolean verificarVehiculo(String id) {
        boolean estaVehiculo = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId().equals(id)) {
                estaVehiculo = true;
            }
        }
        return estaVehiculo;
    }


    /**
     * Agrega un empleado a la lista de empleados si no está registrado ni en la lista negra.
     *
     * @param empleado Objeto empleado a agregar.
     */
    public void agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getId()) && !verificarEmpleadoBlacklist(empleado.getId())) {
            empleados.add(empleado);

        }
    }

    /**
     * Agrega un administrador si no está registrado.
     *
     * @param administrador Objeto administrador a agregar.
     */
    public void agregarAdminsitrador(Administrador administrador) {
        if (!verificarAdministrador(administrador.getId())) {
            administradores.add(administrador);
        }
    }

    /**
     * Agrega un cliente si no está registrado.
     *
     * @param cliente Objeto cliente a agregar.
     */
    public void agregarCliente(Cliente cliente) {
        if (!verificarCliente(cliente.getId())) {
            clientes.add(cliente);
        }
    }


    /**
     * Agrega una transacción al registro del concesionario.
     *
     * @param transaccion Objeto transacción a agregar.
     */
    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    /**
     * Agrega un vehículo si no está registrado.
     *
     * @param vehiculo Objeto vehículo a agregar.
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        if (!verificarVehiculo(vehiculo.getId())) {
            vehiculos.add(vehiculo);
        }
    }

    /**
     * Mueve un empleado de la lista de empleados activos a la lista negra.
     *
     * @param id Identificación del empleado a banear.
     */
    public void banearEmpleado(String id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                blacklist.add(empleado);
                empleados.remove(empleado);
            }
        }
    }

    /**
     * Edita los datos de un empleado registrado.
     *
     * @param id          Identificación del empleado a editar.
     * @param actualizado Objeto empleado con los nuevos datos.
     */
    public void editarEmpleado(String id, Empleado actualizado) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setNombre(actualizado.getNombre());
                empleado.setId(actualizado.getId());
                empleado.setPreguntaSeguridad(actualizado.getPreguntaSeguridad());
                empleado.setRespuesta(actualizado.getRespuesta());
                break;
            }
        }
    }

    /**
     * Elimina un empleado de la lista de empleados activos.
     *
     * @param id Identificación del empleado a eliminar.
     */
    public void eliminarEmpleado(String id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleados.remove(empleado);
            }
        }
    }

    /**
     * Elimina un administrador registrado.
     *
     * @param id Identificación del administrador a eliminar.
     */
    public void eliminarAdministrador(String id) {
        for (Administrador administrador : administradores) {
            if (administrador.getId().equals(id)) {
                administradores.remove(administrador);
            }
        }
    }

    /**
     * Elimina un cliente registrado.
     *
     * @param id Identificación del cliente a eliminar.
     */
    public void eliminarCliente(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                clientes.remove(cliente);
            }
        }
    }

    /**
     * Elimina un vehículo registrado.
     *
     * @param id Identificación del vehículo a eliminar.
     */
    public void eliminarVehiculo(String id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId().equals(id)) {
                vehiculos.remove(vehiculo);
            }
        }
    }


    public void comprarVehiculO(Vehiculo vehiculo, String idEmpleado, String idCliente){
        agregarVehiculo(vehiculo);
        Compra compra = new Compra();
        compra.setCliente(buscarCliente(idCliente));
        compra.setEmpleado(buscarEmpleado(idEmpleado));
        compra.setFecha(LocalDate.now());
        agregarTransaccion(compra);
    }


    /**
     * Busca un empleado por su identificación.
     *
     * @param id Identificación del empleado a buscar.
     * @return Objeto empleado encontrado o null si no existe.
     */
    public Empleado buscarEmpleado(String id) {
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleadoEncontrado = empleado;
            }
        }
        return empleadoEncontrado;
    }

    /**
     * Busca un administrador por su identificación.
     *
     * @param id Identificación del administrador a buscar.
     * @return Objeto administrador encontrado o null si no existe.
     */
    public Administrador buscarAdministrador(String id) {
        Administrador administradorEncontrado = null;
        for (Administrador administrador : administradores) {
            if (administrador.getId().equals(id)) {
                administradorEncontrado = administrador;
            }
        }
        return administradorEncontrado;
    }


    /**
     * Busca un cliente por su identificación.
     *
     * @param id Identificación del cliente a buscar.
     * @return Objeto cliente encontrado o null si no existe.
     */
    public Cliente buscarCliente(String id) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                clienteEncontrado = cliente;
            }
        }
        return clienteEncontrado;
    }

    /**
     * Busca un vehiculo por su identificación.
     *
     * @param id Identificación del vehiculo a buscar.
     * @return Objeto vehiculo encontrado o null si no existe.
     */
    public Vehiculo buscarVehiculo(String id) {
        Vehiculo vehiculoEncontrado = null;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId().equals(id)) {
                vehiculoEncontrado = vehiculo;
            }
        }
        return vehiculoEncontrado;
    }

    public boolean iniciarSesionEmpleado(String id, String contraseña) {
        boolean accesoValido = false;
        for (Empleado empleado : empleados) {
            if (id.equals(empleado.getId()) && contraseña.equals(empleado.getClaveAcceso())) {
                accesoValido = true;
            }
        }
        return accesoValido;
    }

    public boolean iniciarSesionAdministrador(String id, String contraseña) {
        boolean accesoValido = false;
        for (Administrador administrador : administradores) {
            if (id.equals(administrador.getId()) && contraseña.equals(administrador.getClaveAcceso())) {
                accesoValido = true;
            }
        }
        return accesoValido;
    }

    public boolean iniciarSesionCliente(String id, String contraseña) {
        boolean accesoValido = false;
        for (Cliente cliente : clientes) {
            if (id.equals(cliente.getId()) && contraseña.equals(cliente.getClaveAcceso())) {
                accesoValido = true;
            }
        }
        return accesoValido;
    }

    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Collection<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(Collection<Administrador> administradores) {
        this.administradores = administradores;
    }

    public Collection<Empleado> getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Collection<Empleado> blacklist) {
        this.blacklist = blacklist;
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }
}
