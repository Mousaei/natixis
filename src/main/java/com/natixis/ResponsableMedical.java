package com.natixis;

import java.util.Objects;

public class ResponsableMedical {
    private String name;
    private String firstName;
    private String noTel;
    private String email;
    private String departementExercice;
    private String specialite;
    private boolean disponbilite;

    public ResponsableMedical(String name, String firstName, String noTel, String email, String departementExercice, String specialite, boolean disponbilite) {
        this.name = name;
        this.firstName = firstName;
        this.noTel = noTel;
        this.email = email;
        this.departementExercice = departementExercice;
        this.specialite = specialite;
        this.disponbilite = disponbilite;
    }

    @Override
    public String toString() {
        return "ResponsableMedical{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", noTel='" + noTel + '\'' +
                ", email='" + email + '\'' +
                ", departementExercice='" + departementExercice + '\'' +
                ", specialite='" + specialite + '\'' +
                ", disponbilite=" + disponbilite +
                '}';
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
        return noTel;
    }

    public void setNoTel(String noTel) {
        this.noTel = noTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartementExercice() {
        return departementExercice;
    }

    public void setDepartementExercice(String departementExercice) {
        this.departementExercice = departementExercice;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public boolean isDisponbilite() {
        return disponbilite;
    }

    public void setDisponbilite(boolean disponbilite) {
        this.disponbilite = disponbilite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponsableMedical)) return false;
        ResponsableMedical that = (ResponsableMedical) o;
        return isDisponbilite() == that.isDisponbilite() && Objects.equals(getName(), that.getName()) && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getNoTel(), that.getNoTel()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getDepartementExercice(), that.getDepartementExercice()) && Objects.equals(getSpecialite(), that.getSpecialite());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFirstName(), getNoTel(), getEmail(), getDepartementExercice(), getSpecialite(), isDisponbilite());
    }
}
