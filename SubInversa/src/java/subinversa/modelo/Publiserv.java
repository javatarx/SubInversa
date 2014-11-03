/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package subinversa.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pacifi
 */
@Entity
@Table(name = "publiserv")
@NamedQueries({
    @NamedQuery(name = "Publiserv.findAll", query = "SELECT p FROM Publiserv p")})
public class Publiserv implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idps")
    private Integer idps;
    @Basic(optional = false)
    @Column(name = "Serie")
    private long serie;
    @Basic(optional = false)
    @Column(name = "nameOferta")
    private String nameOferta;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "valoReferencial")
    private long valoReferencial;
    @Basic(optional = false)
    @Column(name = "fechaInicial")
    @Temporal(TemporalType.DATE)
    private Date fechaInicial;
    @Basic(optional = false)
    @Column(name = "fechaFinal")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "recogida")
    private String recogida;
    @Basic(optional = false)
    @Column(name = "entrega")
    private String entrega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idps")
    private Collection<Preeleccion> preeleccionCollection;
    @JoinColumn(name = "iddest", referencedColumnName = "iddest")
    @ManyToOne(optional = false)
    private Destinos iddest;
    @JoinColumn(name = "idCli", referencedColumnName = "idCli")
    @ManyToOne(optional = false)
    private Clientes idCli;

    public Publiserv() {
    }

    public Publiserv(Integer idps) {
        this.idps = idps;
    }

    public Publiserv(Integer idps, long serie, String nameOferta, String descripcion, long valoReferencial, Date fechaInicial, Date fechaFinal, String estado, String recogida, String entrega) {
        this.idps = idps;
        this.serie = serie;
        this.nameOferta = nameOferta;
        this.descripcion = descripcion;
        this.valoReferencial = valoReferencial;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.recogida = recogida;
        this.entrega = entrega;
    }

    public Integer getIdps() {
        return idps;
    }

    public void setIdps(Integer idps) {
        this.idps = idps;
    }

    public long getSerie() {
        return serie;
    }

    public void setSerie(long serie) {
        this.serie = serie;
    }

    public String getNameOferta() {
        return nameOferta;
    }

    public void setNameOferta(String nameOferta) {
        this.nameOferta = nameOferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getValoReferencial() {
        return valoReferencial;
    }

    public void setValoReferencial(long valoReferencial) {
        this.valoReferencial = valoReferencial;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRecogida() {
        return recogida;
    }

    public void setRecogida(String recogida) {
        this.recogida = recogida;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public Collection<Preeleccion> getPreeleccionCollection() {
        return preeleccionCollection;
    }

    public void setPreeleccionCollection(Collection<Preeleccion> preeleccionCollection) {
        this.preeleccionCollection = preeleccionCollection;
    }

    public Destinos getIddest() {
        return iddest;
    }

    public void setIddest(Destinos iddest) {
        this.iddest = iddest;
    }

    public Clientes getIdCli() {
        return idCli;
    }

    public void setIdCli(Clientes idCli) {
        this.idCli = idCli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idps != null ? idps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Publiserv)) {
            return false;
        }
        Publiserv other = (Publiserv) object;
        if ((this.idps == null && other.idps != null) || (this.idps != null && !this.idps.equals(other.idps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Publiserv[ idps=" + idps + " ]";
    }
    
}
