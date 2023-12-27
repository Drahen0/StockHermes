package controleur;

public class Manager {
    private int idUser ,postal;
    private String department, registration, cityWork, name, lastName, email, password, address, city;

    public Manager(int idUser, String department, String registration, String cityWork, String name, String lastName, String email, String password, String address, int postal, String city) {
        super();
        this.idUser = idUser;
        this.department = department;
        this.registration = registration;
        this.cityWork = cityWork;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.postal = postal;
        this.city = city;
    }

    public Manager(String department, String registration, String cityWork, String name, String lastName, String email, String password, String address, int postal, String city) {
        super();
        this.idUser = 0;
        this.department = department;
        this.registration = registration;
        this.cityWork = cityWork;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.postal = 0;
        this.city = city;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getCityWork() {
        return cityWork;
    }

    public void setCityWork(String cityWork) {
        this.cityWork = cityWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostal() {
        return postal;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
