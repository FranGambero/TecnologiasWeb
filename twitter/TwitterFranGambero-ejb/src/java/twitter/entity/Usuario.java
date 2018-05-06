/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Takox
 */
@Entity
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario")
    , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuario.findByDescripcion", query = "SELECT u FROM Usuario u WHERE u.descripcion = :descripcion")
    , @NamedQuery(name = "Usuario.findByFecha", query = "SELECT u FROM Usuario u WHERE u.fecha = :fecha")
    , @NamedQuery(name = "Usuario.findByUrl", query = "SELECT u FROM Usuario u WHERE u.url = :url")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIO")
    private Long idusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 250)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 80)
    @Column(name = "URL")
    private String url;
    @JoinTable(name = "USUARIO_SEGUIDOR", joinColumns = {
        @JoinColumn(name = "IDUSUARIO", referencedColumnName = "IDUSUARIO")}, inverseJoinColumns = {
        @JoinColumn(name = "IDUSUARIO_SEGUIDOR", referencedColumnName = "IDUSUARIO")})
    @ManyToMany
    private Collection<Usuario> usuarioCollection;
    @ManyToMany(mappedBy = "usuarioCollection")
    private Collection<Usuario> usuarioCollection1;
    @ManyToMany(mappedBy = "usuarioCollection")
    private Collection<Tuit> tuitCollection;
    @ManyToMany(mappedBy = "usuarioCollection1")
    private Collection<Tuit> tuitCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Collection<Tuit> tuitCollection2;
    @JoinColumn(name = "PAIS", referencedColumnName = "PAIS_ISO_CODE")
    @ManyToOne(optional = false)
    private Pais pais;

    public Usuario() {
    }

    public Usuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(Long idusuario, String nombre, Date fecha) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection1() {
        return usuarioCollection1;
    }

    public void setUsuarioCollection1(Collection<Usuario> usuarioCollection1) {
        this.usuarioCollection1 = usuarioCollection1;
    }

    @XmlTransient
    public Collection<Tuit> getTuitCollection() {
        return tuitCollection;
    }

    public void setTuitCollection(Collection<Tuit> tuitCollection) {
        this.tuitCollection = tuitCollection;
    }

    @XmlTransient
    public Collection<Tuit> getTuitCollection1() {
        return tuitCollection1;
    }

    public void setTuitCollection1(Collection<Tuit> tuitCollection1) {
        this.tuitCollection1 = tuitCollection1;
    }

    @XmlTransient
    public Collection<Tuit> getTuitCollection2() {
        return tuitCollection2;
    }

    public void setTuitCollection2(Collection<Tuit> tuitCollection2) {
        this.tuitCollection2 = tuitCollection2;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "twitter.entity.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}
