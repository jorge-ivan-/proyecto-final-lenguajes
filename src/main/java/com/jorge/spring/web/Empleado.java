/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jorge.spring.web;
 import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import java.io.Serializable;


public class Empleado {
   
/**
 *
 * @author T-10A
 */
@Entity
@Table(name = "empleado")

public class empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empleado")
    private Integer idAlumno;
    
    
    @Size(max = 80)
    @Column(name = "nombre")
    private String nombre;
    
    
   
    @Size(max = 80)
    @Column(name = "email")
    private String email;
    
   

    public Empleado() {
    }

    public Empleado(Integer idEmpleado) {
        this.idAlumno = idAlumno;
    }

    public Empleado(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
       
    }
    

   

    public Integer getIdEmpleado() {
        return idAlumno;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idAlumno == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jorge.spring.web.Empleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}

    
}
