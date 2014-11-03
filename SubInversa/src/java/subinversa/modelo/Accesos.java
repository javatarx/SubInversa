/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subinversa.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author pacifi
 */
@Entity
@Table(name = "accesos")
@NamedQueries({
    @NamedQuery(name = "Accesos.findAll", query = "SELECT a FROM Accesos a")})
public class Accesos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idacceso")
    private Integer idacceso;
    @Basic(optional = false)
    @Column(name = "detalle")
    private String detalle;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "idurl", referencedColumnName = "idurl")
    @ManyToOne(optional = false)
    private Url idurl;
    @JoinColumn(name = "idtipuser", referencedColumnName = "idtipuser")
    @ManyToOne(optional = false)
    private Tipousuario idtipuser;

    public Accesos() {
    }

    public Accesos(Integer idacceso) {
        this.idacceso = idacceso;
    }

    public Accesos(Integer idacceso, String detalle, String estado) {
        this.idacceso = idacceso;
        this.detalle = detalle;
        this.estado = estado;
    }

    public Integer getIdacceso() {
        return idacceso;
    }

    public void setIdacceso(Integer idacceso) {
        this.idacceso = idacceso;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Url getIdurl() {
        return idurl;
    }

    public void setIdurl(Url idurl) {
        this.idurl = idurl;
    }

    public Tipousuario getIdtipuser() {
        return idtipuser;
    }

    public void setIdtipuser(Tipousuario idtipuser) {
        this.idtipuser = idtipuser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idacceso != null ? idacceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accesos)) {
            return false;
        }
        Accesos other = (Accesos) object;
        if ((this.idacceso == null && other.idacceso != null) || (this.idacceso != null && !this.idacceso.equals(other.idacceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Accesos[ idacceso=" + idacceso + " ]";
    }
    
}
