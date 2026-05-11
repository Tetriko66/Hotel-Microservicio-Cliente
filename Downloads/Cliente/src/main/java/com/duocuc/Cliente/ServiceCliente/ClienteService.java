package com.duocuc.Cliente.ServiceCliente;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duocuc.Cliente.ClienteModel.Cliente;
import com.duocuc.Cliente.RepositoryCliente.ClientRepository;

@Service
@Transactional
public class ClienteService {

    //Inyectar el repositorio de clientes
    @Autowired
    private ClientRepository clienteRepository;

    //Metodo para crear un nuevo cliente
    public Cliente crearCliente(Cliente cliente) {
        if (clienteRepository.existsByEmail(cliente.getEmail())){
            throw new IllegalArgumentException("El correo ya existe en la base de datos");
        }
        return clienteRepository.save(cliente);
    }

    //Metodo para obtener todos los clientes
    public List<Cliente> obtenerClientes(){
        return clienteRepository.findAll();
    }

    //Metodo para obtener un cliente por su ID
    public Optional<Cliente> obtenerClientePorId(Long id){
        return clienteRepository.findById(id);
    }

    //Metodo para actualizar 
    public Cliente actualizarCliente(Long Id , Cliente clienteActualizado){
        Cliente cliente = clienteRepository.findById(Id)
        .orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado con ID: " + Id));

        return clienteRepository.save(cliente);
    }

    //Metodo para eliminar un cliente por su ID
    public void eliminarCliente(Long id){
        clienteRepository.deleteById(id);
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }
}