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
@Table(name = "preeleccion")
@NamedQueries({
    @NamedQuery(name = "Preeleccion.findAll", query = "SELECT p FROM Preeleccion p")})
public class Preeleccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpre")
    private Integer idpre;
    @Basic(optional = false)
    @Column(name = "tipoAceptacion")
    private String tipoAceptacion;
    @JoinColumn(name = "idCli", referencedColumnName = "idCli")
    @ManyToOne(optional = false)
    private Clientes idCli;
    @JoinColumn(name = "idps", referencedColumnName = "idps")
    @ManyToOne(optional = false)
    private Publiserv idps;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpre")
    private Collection<Subinversa> subinversaCollection;

    public Preeleccion() {
    }

    public Preeleccion(Integer idpre) {
        this.idpre = idpre;
    }

    public Preeleccion(Integer idpre, String tipoAceptacion) {
        this.idpre = idpre;
        this.tipoAceptacion = tipoAceptacion;
    }

    public Integer getIdpre() {
        return idpre;
    }

    public void setIdpre(Integer idpre) {
        this.idpre = idpre;
    }

    public String getTipoAceptacion() {
        return tipoAceptacion;
    }

    public void setTipoAceptacion(String tipoAceptacion) {
        this.tipoAceptacion = tipoAceptacion;
    }

    public Clientes getIdCli() {
        return idCli;
    }

    public void setIdCli(Clientes idCli) {
        this.idCli = idCli;
    }

    public Publiserv getIdps() {
        return idps;
    }

    public void setIdps(Publiserv idps) {
        this.idps = idps;
    }

    public Collection<Subinversa> getSubinversaCollection() {
        return subinversaCollection;
    }

    public void setSubinversaCollection(Collection<Subinversa> subinversaCollection) {
        this.subinversaCollection = subinversaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpre != null ? idpre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Preeleccion)) {
            return false;
        }
        Preeleccion other = (Preeleccion) object;
        if ((this.idpre == null && other.idpre != null) || (this.idpre != null && !this.idpre.equals(other.idpre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Preeleccion[ idpre=" + idpre + " ]";
    }
    
}
