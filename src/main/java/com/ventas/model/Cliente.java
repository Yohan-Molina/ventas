package com.ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    
    @NotNull(message = "El nombre no puede ser nulo")
    @NotBlank(message = "El nombre es requerido")
    @Size(min = 3, max = 70, message = "El nombre debe ser mayor a 3 caracteres")
    @Column(nullable = false, length = 70)
    private String nombres;
    
    @NotNull
    @NotBlank(message = "Los apellidos son requerido")
    @Size(min = 3, max = 150, message = "Los apellidos deben ser mayor a 3 caracteres")
    @Column(nullable = false, length = 150)
    private String apellidos; 
    
    @Size(max = 150, message = "La direccion no debe superar los 150 caracteres")
    @Column(nullable = true, length = 150)
    private String direccion; 
    
    @Size(min = 8, message = "El telefono debe ser mayor a 8 caracteres")
    @Column(nullable = true, length = 10)
    private String telefono; 
    
    @NotNull
    @NotBlank(message = "El email es requerido")
    @Size(min = 10, message = "El email deben ser mayor a 10 caracteres")
    @Email(message = "El email enviado no es un formato valido")
    @Column(nullable = false, length = 150)
    private String email;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
