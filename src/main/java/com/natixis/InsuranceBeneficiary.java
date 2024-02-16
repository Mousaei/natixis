package com.natixis;

import java.util.Objects;

/**
 * La Classe Beneficiaire
 */
public class InsuranceBeneficiary {
    private int nss;
    private String name;
    private String firstName;
    private String NoTel;
    private String email;
    private String address;
    public InsuranceBeneficiary(int nss, String name, String firstName, String noTel, String email, String address) {
        this.nss = nss;
        this.name = name;
        this.firstName = firstName;
        NoTel = noTel;
        this.email = email;
        this.address = address;
    }

    public InsuranceBeneficiary(int nss) {
        this.nss = nss;
    }

    @Override
    public String toString() {
        return "Beneficiary{" +
                "nss=" + nss +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", NoTel='" + NoTel + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsuranceBeneficiary)) return false;
        InsuranceBeneficiary that = (InsuranceBeneficiary) o;
        return nss == that.nss && Objects.equals(name, that.name) && Objects.equals(firstName, that.firstName) && Objects.equals(NoTel, that.NoTel) && Objects.equals(email, that.email) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nss, name, firstName, NoTel, email, address);
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNoTel() {
        return NoTel;
    }

    public void setNoTel(String noTel) {
        NoTel = noTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
