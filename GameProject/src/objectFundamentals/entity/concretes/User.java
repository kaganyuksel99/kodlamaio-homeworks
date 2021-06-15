package objectFundamentals.entity.concretes;

import objectFundamentals.entity.abstracts.Entity;

public class User extends Entity {
    private  int id ;
    private  String firstName;
    private String lastName;
    private String password;
    private  String identificationNumber;

    public User() { //constructer

    }

    public User(int id, String firstName, String lastName, String password, String identificationNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.identificationNumber = identificationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
}
