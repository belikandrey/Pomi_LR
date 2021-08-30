package by.bsuir.task1_1;

import java.math.BigInteger;
import java.util.Objects;

public class Student {
    private BigInteger id;
    private String lastName;
    private String name;
    //Отчество
    private String patronymic;
    private DateOfBirth dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(BigInteger id, String lastName, String name, String patronymic, String address, String phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(BigInteger id, String lastName, String name, String patronymic, String address, String phoneNumber, String faculty, int course, String group, String dateOfBirth) {
        this(id, lastName, name, patronymic, address, phoneNumber,faculty, course, group)
        this.dateOfBirth = new DateOfBirth(dateOfBirth);
    }

    public Student(BigInteger id, String lastName, String name, String patronymic, String address, String phoneNumber, String faculty, int course, String group, int dayBirth, int monthBirth, int yearBirth) {
        this(id, lastName, name, patronymic, address, phoneNumber,faculty, course, group)
        this
    }

    class DateOfBirth {
        private int day;
        private int month;
        private int year;

        public DateOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public DateOfBirth(String date) {
            String[] params = date.split(" ");
            if (params.length < 3) {
                params = date.split("-");
            }
            if (params.length < 3) {
                params = date.split("\\.");
            }
            if (params.length < 3) {
                throw new RuntimeException("Invalid Date Of Birth");
            }
            int day = Integer.parseInt(params[0]);
            int month = Integer.parseInt(params[1]);
            int year = Integer.parseInt(params[2]);
            if (day < 1 || day > 31) {
                throw new RuntimeException("Invalid Day of Birth");
            }
            if (month < 1 || month > 12) {
                throw new RuntimeException("Invalid Month of Birth");
            }
            if (year < 1900 || year > 2021) {
                throw new RuntimeException("Invalid Year of Birth");
            }

            this.day = day;
            this.month = month;
            this.year = year;
        }

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

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(id, student.id) && Objects.equals(lastName, student.lastName) && Objects.equals(name, student.name) && Objects.equals(patronymic, student.patronymic) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(address, student.address) && Objects.equals(phoneNumber, student.phoneNumber) && Objects.equals(faculty, student.faculty) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, name, patronymic, dateOfBirth, address, phoneNumber, faculty, course, group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
