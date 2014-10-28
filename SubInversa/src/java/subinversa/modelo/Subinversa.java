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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "subinversa")
@NamedQueries({
    @NamedQuery(name = "Subinversa.findAll", query = "SELECT s FROM Subinversa s")})
public class Subinversa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsub")
    private Integer idsub;
    @Basic(optional = false)
    @Column(name = "propuesta")
    private double propuesta;
    @Basic(optional = false)
    @Column(name = "ronda1")
    private double ronda1;
    @Basic(optional = false)
    @Column(name = "ronda2")
    private double ronda2;
    @Basic(optional = false)
    @Column(name = "ronda3")
    private double ronda3;
    @Basic(optional = false)
    @Column(name = "ronda4")
    private double ronda4;
    @Basic(optional = false)
    @Column(name = "puntaje")
    private double puntaje;
    @JoinColumn(name = "idpre", referencedColumnName = "idpre")
    @ManyToOne(optional = false)
    private Preeleccion idpre;

    public Subinversa() {
    }

    public Subinversa(Integer idsub) {
        this.idsub = idsub;
    }

    public Subinversa(Integer idsub, double propuesta, double ronda1, double ronda2, double ronda3, double ronda4, double puntaje) {
        this.idsub = idsub;
        this.propuesta = propuesta;
        this.ronda1 = ronda1;
        this.ronda2 = ronda2;
        this.ronda3 = ronda3;
        this.ronda4 = ronda4;
        this.puntaje = puntaje;
    }

    public Integer getIdsub() {
        return idsub;
    }

    public void setIdsub(Integer idsub) {
        this.idsub = idsub;
    }

    public double getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(double propuesta) {
        this.propuesta = propuesta;
    }

    public double getRonda1() {
        return ronda1;
    }

    public void setRonda1(double ronda1) {
        this.ronda1 = ronda1;
    }

    public double getRonda2() {
        return ronda2;
    }

    public void setRonda2(double ronda2) {
        this.ronda2 = ronda2;
    }

    public double getRonda3() {
        return ronda3;
    }

    public void setRonda3(double ronda3) {
        this.ronda3 = ronda3;
    }

    public double getRonda4() {
        return ronda4;
    }

    public void setRonda4(double ronda4) {
        this.ronda4 = ronda4;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public Preeleccion getIdpre() {
        return idpre;
    }

    public void setIdpre(Preeleccion idpre) {
        this.idpre = idpre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsub != null ? idsub.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subinversa)) {
            return false;
        }
        Subinversa other = (Subinversa) object;
        if ((this.idsub == null && other.idsub != null) || (this.idsub != null && !this.idsub.equals(other.idsub))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Subinversa[ idsub=" + idsub + " ]";
    }
    
}
