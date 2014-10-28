/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subinversa.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pacifi
 */
@Entity
@Table(name = "tipoempresa")
@NamedQueries({
    @NamedQuery(name = "Tipoempresa.findAll", query = "SELECT t FROM Tipoempresa t")})
public class Tipoempresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipemp")
    private Integer idtipemp;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipemp")
    private Collection<Clientes> clientesCollection;

    public Tipoempresa() {
    }

    public Tipoempresa(Integer idtipemp) {
        this.idtipemp = idtipemp;
    }

    public Tipoempresa(Integer idtipemp, String nombre, String descripcion, String estado) {
        this.idtipemp = idtipemp;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getIdtipemp() {
        return idtipemp;
    }

    public void setIdtipemp(Integer idtipemp) {
        this.idtipemp = idtipemp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Collection<Clientes> getClientesCollection() {
        return clientesCollection;
    }

    public void setClientesCollection(Collection<Clientes> clientesCollection) {
        this.clientesCollection = clientesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipemp != null ? idtipemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoempresa)) {
            return false;
        }
        Tipoempresa other = (Tipoempresa) object;
        if ((this.idtipemp == null && other.idtipemp != null) || (this.idtipemp != null && !this.idtipemp.equals(other.idtipemp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Tipoempresa[ idtipemp=" + idtipemp + " ]";
    }
    
}
