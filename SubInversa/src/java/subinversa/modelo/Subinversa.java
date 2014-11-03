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
    @Column(name = "puja")
    private double puja;
    @Basic(optional = false)
    @Column(name = "puntaje")
    private int puntaje;
    @JoinColumn(name = "idpre", referencedColumnName = "idpre")
    @ManyToOne(optional = false)
    private Preeleccion idpre;

    public Subinversa() {
    }

    public Subinversa(Integer idsub) {
        this.idsub = idsub;
    }

    public Subinversa(Integer idsub, double puja, int puntaje) {
        this.idsub = idsub;
        this.puja = puja;
        this.puntaje = puntaje;
    }

    public Integer getIdsub() {
        return idsub;
    }

    public void setIdsub(Integer idsub) {
        this.idsub = idsub;
    }

    public double getPuja() {
        return puja;
    }

    public void setPuja(double puja) {
        this.puja = puja;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
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
