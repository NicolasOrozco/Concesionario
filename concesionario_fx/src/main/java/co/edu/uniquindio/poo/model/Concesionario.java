    package co.edu.uniquindio.poo.model;

    import java.util.Collection;
    import java.util.LinkedList;

    public class Concesionario {
        private String nombre;
        private Collection<Empleado> empleados;
        private Collection<Empleado> blacklist;
		private Collection<Administrador> administradores;
        private Collection<Cliente> clientes;
        private Collection<Vehiculo> vehiculos;
        public Collection<Transaccion> transacciones;

        public Concesionario(String nombre) {
            this.nombre = nombre;
            empleados = new LinkedList<>();
            blacklist =  new LinkedList<>();
            administradores = new LinkedList<>();
            clientes = new LinkedList<>();
            vehiculos = new LinkedList<>();
            transacciones = new LinkedList<>();
        }

        public boolean verificarEmpleado(String id) {
            boolean estaEmpleado = false;
            for (Empleado empleado : empleados) {
                if (empleado.getId().equals(id)) {
                    estaEmpleado = true;
                }
            }
            return estaEmpleado;
        }

        public boolean verificarEmpleadoBlacklist(String id){
            boolean estaEmpleado = false;
            for (Empleado empleado : empleados) {
                if (empleado.getId().equals(id)) {
                    estaEmpleado = true;
                }
            }
            return estaEmpleado;
        }

        public boolean verificarAdministrador(String id) {
            boolean estaAdministrador = false;
            for (Administrador administrador : administradores) {
                if (administrador.getId().equals(id)) {
                    estaAdministrador = true;
                }
            }
            return estaAdministrador;
        }

        public boolean verificarCliente(String id) {
            boolean estaCliente = false;
            for (Cliente cliente : clientes) {
                if (cliente.getId().equals(id)) {
                    estaCliente = true;
                }
            }
            return estaCliente;
        }

        public boolean verificarVehiculo(String id) {
            boolean estaVehiculo = false;
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getId().equals(id)) {
                    estaVehiculo = true;
                }
            }
            return estaVehiculo;
        }

        public void agregarEmpleado(Empleado empleado) {
            if (!verificarEmpleado(empleado.getId())|| !verificarEmpleadoBlacklist(empleado.getId())) {
                empleados.add(empleado);

            }
        }

        public void agregarAdminsitrador(Administrador administrador) {
            if (!verificarAdministrador(administrador.getId())) {
                administradores.add(administrador);
            }
        }

        public void agregarCliente(Cliente cliente) {
            if (!verificarCliente(cliente.getId())) {
                clientes.add(cliente);
            }
        }

        public void agregarVehiculo(Vehiculo vehiculo){
            if (!verificarVehiculo(vehiculo.getId())){
                vehiculos.add(vehiculo);
            }
        }
        public void banearEmpleado(String id){
            for(Empleado empleado: empleados){
                if(empleado.getId().equals(id)){
                   blacklist.add(empleado);
                   empleados.remove(empleado);
                }
            }
        }

        public void editarEmpleado(String id, Empleado actualizado){
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
        public void eliminarEmpleado(String id) {
            for (Empleado empleado : empleados) {
                if (empleado.getId().equals(id)) {
                    empleados.remove(empleado);
                }
            }
        }

        public void eliminarAdministrador(String id){
            for(Administrador administrador: administradores){
                if(administrador.getId().equals(id)){
                    administradores.remove(administrador);
                }
            }
        }

        public void eliminarCliente(String id){
            for(Cliente cliente: clientes){
                if(cliente.getId().equals(id)){
                    clientes.remove(cliente);
                }
            }
        }

        public void eliminarVehiculo(String id){
            for (Vehiculo vehiculo: vehiculos){
                if(vehiculo.getId().equals(id)){
                    vehiculos.remove(vehiculo);
                }
            }
        }

        public Empleado buscarEmpleado(String id){
            Empleado empleadoEncontrado = null;
            for(Empleado empleado: empleados){
                if(empleado.getId().equals(id)){
                    empleadoEncontrado = empleado;
                }
            }
            return empleadoEncontrado;
        }

        public Administrador buscarAdministrador(String id){
            Administrador administradorEncontrado = null;
            for(Administrador administrador: administradores){
                if(administrador.getId().equals(id)){
                    administradorEncontrado = administrador;
                }
            }
            return administradorEncontrado;
        }

        public Cliente buscarCliente(String id){
            Cliente clienteEncontrado = null;
            for(Cliente cliente: clientes){
                if(cliente.getId().equals(id)){
                    clienteEncontrado = cliente;
                }
            }
            return clienteEncontrado;
        }

        public Vehiculo buscarVehiculo(String id){
            Vehiculo vehiculoEncontrado = null;
            for(Vehiculo vehiculo: vehiculos){
                if(vehiculo.getId().equals(id)){
                    vehiculoEncontrado = vehiculo;
                }
            }
            return vehiculoEncontrado;
        }

        public boolean iniciarSesionEmpleado(String id, String contraseña) {
            boolean accesoValido = false;
            for (Empleado empleado : empleados) {
                if (id.equals(empleado.getId()) || contraseña.equals(empleado.getClaveAcceso())) {
                    accesoValido = true;
                }
            }
            return accesoValido;
        }

        public boolean iniciarSesionAdministrador(String id, String contraseña) {
            boolean accesoValido = false;
            for (Administrador administrador : administradores) {
                if (id.equals(administrador.getId()) || contraseña.equals(administrador.getClaveAcceso())) {
                    accesoValido = true;
                }
            }
            return accesoValido;
        }

        public boolean iniciarSesionCliente(String id, String contraseña) {
            boolean accesoValido = false;
            for (Cliente cliente : clientes) {
                if (id.equals(cliente.getId()) || contraseña.equals(cliente.getClaveAcceso())) {
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
