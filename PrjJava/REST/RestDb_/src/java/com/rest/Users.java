/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rest;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id")
    , @NamedQuery(name = "Users.findByFirstname", query = "SELECT u FROM Users u WHERE u.firstname = :firstname")
    , @NamedQuery(name = "Users.findByLastname", query = "SELECT u FROM Users u WHERE u.lastname = :lastname")
    , @NamedQuery(name = "Users.findByCompany", query = "SELECT u FROM Users u WHERE u.company = :company")
    , @NamedQuery(name = "Users.findByEmailcompany", query = "SELECT u FROM Users u WHERE u.emailcompany = :emailcompany")
    , @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username")
    , @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")
    , @NamedQuery(name = "Users.findByDatain", query = "SELECT u FROM Users u WHERE u.datain = :datain")
    , @NamedQuery(name = "Users.findByDataout", query = "SELECT u FROM Users u WHERE u.dataout = :dataout")
    , @NamedQuery(name = "Users.findBySalt", query = "SELECT u FROM Users u WHERE u.salt = :salt")
    , @NamedQuery(name = "Users.findByPasswordhash", query = "SELECT u FROM Users u WHERE u.passwordhash = :passwordhash")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Size(max = 26)
    @Column(name = "LASTNAME")
    private String lastname;
    @Size(max = 25)
    @Column(name = "COMPANY")
    private String company;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 26)
    @Column(name = "EMAILCOMPANY")
    private String emailcompany;
    @Size(max = 25)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 255)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "DATAIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datain;
    @Column(name = "DATAOUT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataout;
    @Size(max = 255)
    @Column(name = "SALT")
    private String salt;
    @Size(max = 255)
    @Column(name = "PASSWORDHASH")
    private String passwordhash;

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Users(Integer id, String firstname, String emailcompany) {
        this.id = id;
        this.firstname = firstname;
        this.emailcompany = emailcompany;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmailcompany() {
        return emailcompany;
    }

    public void setEmailcompany(String emailcompany) {
        this.emailcompany = emailcompany;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDatain() {
        return datain;
    }

    public void setDatain(Date datain) {
        this.datain = datain;
    }

    public Date getDataout() {
        return dataout;
    }

    public void setDataout(Date dataout) {
        this.dataout = dataout;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPasswordhash() {
        return passwordhash;
    }

    public void setPasswordhash(String passwordhash) {
        this.passwordhash = passwordhash;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rest.Users[ id=" + id + " ]";
    }

}
