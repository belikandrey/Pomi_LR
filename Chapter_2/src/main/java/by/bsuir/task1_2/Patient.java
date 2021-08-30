package by.bsuir.task1_2;

import java.math.BigInteger;
import java.util.Objects;

public class Patient {
    private BigInteger id;
    private String lastName;
    private String name;
    //Отчество
    private String patronymic;
    private String address;
    private String phoneNumber;
    private long numberMedicalCard;
    private String diagnosis;

    public Patient(BigInteger id, String lastName, String name, String patronymic, String address, String phoneNumber, long numberMedicalCard, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.numberMedicalCard = numberMedicalCard;
        this.diagnosis = diagnosis;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getNumberMedicalCard() {
        return numberMedicalCard;
    }

    public void setNumberMedicalCard(long numberMedicalCard) {
        this.numberMedicalCard = numberMedicalCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id) && Objects.equals(lastName, patient.lastName) && Objects.equals(name, patient.name) && Objects.equals(patronymic, patient.patronymic) && Objects.equals(address, patient.address) && Objects.equals(phoneNumber, patient.phoneNumber) && Objects.equals(numberMedicalCard, patient.numberMedicalCard) && Objects.equals(diagnosis, patient.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, name, patronymic, address, phoneNumber, numberMedicalCard, diagnosis);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", numberMedicalCard='" + numberMedicalCard + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
