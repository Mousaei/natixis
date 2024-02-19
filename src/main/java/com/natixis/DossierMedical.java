package com.natixis;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class DossierMedical {
    private List<File> docuementMedical;
    private String motif;
    private List<String> antecedent;
    private List<String> TraitementHabituel;
    private List<String> histoireDeLaMaladie;
    private String examenClinique;
    private List<String> chronologieDesEvenements;
    private List<String> parametresVitaux;
    private String origine;
    private List<String> hypotheses;
    private String conduiteATenir;
    private List<String> examenPeriodique;
    private String conclusion;

    public DossierMedical(String motif, List<String> antecedent, List<String> traitementHabituel, List<String> histoireDeLaMaladie, String examenClinique, List<String> chronologieDesEvenements, List<String> parametresVitaux, String origine, List<String> hypotheses, String conduiteATenir, List<String> examenPeriodique, String conclusion) {
        this.motif = motif;
        this.antecedent = antecedent;
        TraitementHabituel = traitementHabituel;
        this.histoireDeLaMaladie = histoireDeLaMaladie;
        this.examenClinique = examenClinique;
        this.chronologieDesEvenements = chronologieDesEvenements;
        this.parametresVitaux = parametresVitaux;
        this.origine = origine;
        this.hypotheses = hypotheses;
        this.conduiteATenir = conduiteATenir;
        this.examenPeriodique = examenPeriodique;
        this.conclusion = conclusion;
    }

    @Override
    public String toString() {
        return "DossierMedical{" +
                "docuementMedical=" + docuementMedical +
                ", motif='" + motif + '\'' +
                ", antecedent=" + antecedent +
                ", TraitementHabituel=" + TraitementHabituel +
                ", histoireDeLaMaladie=" + histoireDeLaMaladie +
                ", examenClinique='" + examenClinique + '\'' +
                ", chronologieDesEvenements=" + chronologieDesEvenements +
                ", parametresVitaux=" + parametresVitaux +
                ", origine='" + origine + '\'' +
                ", hypotheses=" + hypotheses +
                ", conduiteATenir='" + conduiteATenir + '\'' +
                ", examenPeriodique=" + examenPeriodique +
                ", conclusion='" + conclusion + '\'' +
                '}';
    }

    public List<File> getDocuementMedical() {
        return docuementMedical;
    }

    public void setDocuementMedical(List<File> docuementMedical) {
        this.docuementMedical = docuementMedical;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public List<String> getAntecedent() {
        return antecedent;
    }

    public void setAntecedent(List<String> antecedent) {
        this.antecedent = antecedent;
    }

    public List<String> getTraitementHabituel() {
        return TraitementHabituel;
    }

    public void setTraitementHabituel(List<String> traitementHabituel) {
        TraitementHabituel = traitementHabituel;
    }

    public List<String> getHistoireDeLaMaladie() {
        return histoireDeLaMaladie;
    }

    public void setHistoireDeLaMaladie(List<String> histoireDeLaMaladie) {
        this.histoireDeLaMaladie = histoireDeLaMaladie;
    }

    public String getExamenClinique() {
        return examenClinique;
    }

    public void setExamenClinique(String examenClinique) {
        this.examenClinique = examenClinique;
    }

    public List<String> getChronologieDesEvenements() {
        return chronologieDesEvenements;
    }

    public void setChronologieDesEvenements(List<String> chronologieDesEvenements) {
        this.chronologieDesEvenements = chronologieDesEvenements;
    }

    public List<String> getParametresVitaux() {
        return parametresVitaux;
    }

    public void setParametresVitaux(List<String> parametresVitaux) {
        this.parametresVitaux = parametresVitaux;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public List<String> getHypotheses() {
        return hypotheses;
    }

    public void setHypotheses(List<String> hypotheses) {
        this.hypotheses = hypotheses;
    }

    public String getConduiteATenir() {
        return conduiteATenir;
    }

    public void setConduiteATenir(String conduiteATenir) {
        this.conduiteATenir = conduiteATenir;
    }

    public List<String> getExamenPeriodique() {
        return examenPeriodique;
    }

    public void setExamenPeriodique(List<String> examenPeriodique) {
        this.examenPeriodique = examenPeriodique;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DossierMedical)) return false;
        DossierMedical that = (DossierMedical) o;
        return Objects.equals(getDocuementMedical(), that.getDocuementMedical()) && Objects.equals(getMotif(), that.getMotif()) && Objects.equals(getAntecedent(), that.getAntecedent()) && Objects.equals(getTraitementHabituel(), that.getTraitementHabituel()) && Objects.equals(getHistoireDeLaMaladie(), that.getHistoireDeLaMaladie()) && Objects.equals(getExamenClinique(), that.getExamenClinique()) && Objects.equals(getChronologieDesEvenements(), that.getChronologieDesEvenements()) && Objects.equals(getParametresVitaux(), that.getParametresVitaux()) && Objects.equals(getOrigine(), that.getOrigine()) && Objects.equals(getHypotheses(), that.getHypotheses()) && Objects.equals(getConduiteATenir(), that.getConduiteATenir()) && Objects.equals(getExamenPeriodique(), that.getExamenPeriodique()) && Objects.equals(getConclusion(), that.getConclusion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDocuementMedical(), getMotif(), getAntecedent(), getTraitementHabituel(), getHistoireDeLaMaladie(), getExamenClinique(), getChronologieDesEvenements(), getParametresVitaux(), getOrigine(), getHypotheses(), getConduiteATenir(), getExamenPeriodique(), getConclusion());
    }
}
