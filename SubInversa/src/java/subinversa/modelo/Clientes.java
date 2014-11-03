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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pacifi
 */
@Entity
@Table(name = "clientes")
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")})
public class Clientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCli")
    private Integer idCli;
    @Basic(optional = false)
    @Column(name = "ruc")
    private String ruc;
    @Basic(optional = false)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telefono")
    private long telefono;
    @Basic(optional = false)
    @Column(name = "fax")
    private long fax;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "idus", referencedColumnName = "idus")
    @ManyToOne(optional = false)
    private Usuario idus;
    @JoinColumn(name = "iddest", referencedColumnName = "iddest")
    @ManyToOne(optional = false)
    private Destinos iddest;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCli")
    private Collection<Preeleccion> preeleccionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCli")
    private Collection<Publiserv> publiservCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCli")
    private Collection<Tracto> tractoCollection;

    public Clientes() {
    }

    public Clientes(Integer idCli) {
        this.idCli = idCli;
    }

    public Clientes(Integer idCli, String ruc, String razonsocial, String direccion, String email, long telefono, long fax, String estado) {
        this.idCli = idCli;
        this.ruc = ruc;
        this.razonsocial = razonsocial;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.fax = fax;
        this.estado = estado;
    }

    public Integer getIdCli() {
        return idCli;
    }

    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getFax() {
        return fax;
    }

    public void setFax(long fax) {
        this.fax = fax;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getIdus() {
        return idus;
    }

    public void setIdus(Usuario idus) {
        this.idus = idus;
    }

    public Destinos getIddest() {
        return iddest;
    }

    public void setIddest(Destinos iddest) {
        this.iddest = iddest;
    }

    public Collection<Preeleccion> getPreeleccionCollection() {
        return preeleccionCollection;
    }

    public void setPreeleccionCollection(Collection<Preeleccion> preeleccionCollection) {
        this.preeleccionCollection = preeleccionCollection;
    }

    public Collection<Publiserv> getPubliservCollection() {
        return publiservCollection;
    }

    public void setPubliservCollection(Collection<Publiserv> publiservCollection) {
        this.publiservCollection = publiservCollection;
    }

    public Collection<Tracto> getTractoCollection() {
        return tractoCollection;
    }

    public void setTractoCollection(Collection<Tracto> tractoCollection) {
        this.tractoCollection = tractoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCli != null ? idCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idCli == null && other.idCli != null) || (this.idCli != null && !this.idCli.equals(other.idCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Clientes[ idCli=" + idCli + " ]";
    }
    
}
