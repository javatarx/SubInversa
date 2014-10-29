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
@Table(name = "url")
@NamedQueries({
    @NamedQuery(name = "Url.findAll", query = "SELECT u FROM Url u")})
public class Url implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idurl")
    private Integer idurl;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @Column(name = "detalle")
    private String detalle;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idurl")
    private Collection<Accesos> accesosCollection;

    public Url() {
    }

    public Url(Integer idurl) {
        this.idurl = idurl;
    }

    public Url(Integer idurl, String url, String detalle, String state) {
        this.idurl = idurl;
        this.url = url;
        this.detalle = detalle;
        this.state = state;
    }

    public Integer getIdurl() {
        return idurl;
    }

    public void setIdurl(Integer idurl) {
        this.idurl = idurl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Collection<Accesos> getAccesosCollection() {
        return accesosCollection;
    }

    public void setAccesosCollection(Collection<Accesos> accesosCollection) {
        this.accesosCollection = accesosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idurl != null ? idurl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Url)) {
            return false;
        }
        Url other = (Url) object;
        if ((this.idurl == null && other.idurl != null) || (this.idurl != null && !this.idurl.equals(other.idurl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Url[ idurl=" + idurl + " ]";
    }
    
}
