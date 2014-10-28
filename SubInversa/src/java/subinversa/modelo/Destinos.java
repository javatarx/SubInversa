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
@Table(name = "destinos")
@NamedQueries({
    @NamedQuery(name = "Destinos.findAll", query = "SELECT d FROM Destinos d")})
public class Destinos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddest")
    private Integer iddest;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddest")
    private Collection<Publiserv> publiservCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddest")
    private Collection<Clientes> clientesCollection;

    public Destinos() {
    }

    public Destinos(Integer iddest) {
        this.iddest = iddest;
    }

    public Destinos(Integer iddest, String nombre, String estado) {
        this.iddest = iddest;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Integer getIddest() {
        return iddest;
    }

    public void setIddest(Integer iddest) {
        this.iddest = iddest;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Collection<Publiserv> getPubliservCollection() {
        return publiservCollection;
    }

    public void setPubliservCollection(Collection<Publiserv> publiservCollection) {
        this.publiservCollection = publiservCollection;
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
        hash += (iddest != null ? iddest.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destinos)) {
            return false;
        }
        Destinos other = (Destinos) object;
        if ((this.iddest == null && other.iddest != null) || (this.iddest != null && !this.iddest.equals(other.iddest))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Destinos[ iddest=" + iddest + " ]";
    }
    
}
