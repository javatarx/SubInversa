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
@Table(name = "tracto")
@NamedQueries({
    @NamedQuery(name = "Tracto.findAll", query = "SELECT t FROM Tracto t")})
public class Tracto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtrans")
    private Integer idtrans;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @Column(name = "ejes")
    private String ejes;
    @Basic(optional = false)
    @Column(name = "capacidad")
    private String capacidad;
    @JoinColumn(name = "idCli", referencedColumnName = "idCli")
    @ManyToOne(optional = false)
    private Clientes idCli;

    public Tracto() {
    }

    public Tracto(Integer idtrans) {
        this.idtrans = idtrans;
    }

    public Tracto(Integer idtrans, String marca, String placa, String ejes, String capacidad) {
        this.idtrans = idtrans;
        this.marca = marca;
        this.placa = placa;
        this.ejes = ejes;
        this.capacidad = capacidad;
    }

    public Integer getIdtrans() {
        return idtrans;
    }

    public void setIdtrans(Integer idtrans) {
        this.idtrans = idtrans;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEjes() {
        return ejes;
    }

    public void setEjes(String ejes) {
        this.ejes = ejes;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
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
        hash += (idtrans != null ? idtrans.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tracto)) {
            return false;
        }
        Tracto other = (Tracto) object;
        if ((this.idtrans == null && other.idtrans != null) || (this.idtrans != null && !this.idtrans.equals(other.idtrans))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "subinversa.modelo.Tracto[ idtrans=" + idtrans + " ]";
    }
    
}
