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
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idus")
    private Integer idus;
    @Basic(optional = false)
    @Column(name = "user")
    private String user;
    @Basic(optional = false)
    @Column(name = "pass")
    private String pass;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idus")
    private Collection<Clientes> clientesCollection;
    @JoinColumn(name = "idtipuser", referencedColumnName = "idtipuser")
    @ManyToOne(optional = false)
    private Tipousuario idtipuser;

    public Usuario() {
    }

    public Usuario(Integer idus) {
        this.idus = idus;
    }

    public Usuario(Integer idus, String user, String pass, String estado) {
        this.idus = idus;
        this.user = user;
        this.pass = pass;
        this.estado = estado;
    }

    public Integer getIdus() {
        return idus;
    }

    public void setIdus(Integer idus) {
        this.idus = idus;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public Tipousuario getIdtipuser() {
        return idtipuser;
    }

    public void setIdtipuser(Tipousuario idtipuser) {
        this.idtipuser = idtipuser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idus != null ? idus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idus == null && other.idus != null) || (this.idus != null && !this.idus.equals(other.idus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Usuario[ idus=" + idus + " ]";
    }
    
}
