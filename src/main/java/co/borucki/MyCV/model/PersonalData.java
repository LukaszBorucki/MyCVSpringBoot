package co.borucki.MyCV.model;

import javax.persistence.*;

@Entity
@Table(name = "personal_data")
public class PersonalData {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
 private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "houseNo")
    private String houseNo;
    @Column(name = "postCode")
    private String postCode;
    @Column(name = "gitHub")
    private String gitHub;
    @Column(name = "webService")
    private String webService;
    @Column(name = "skype")
    private String skype;
    @Column(name = "linkedIn")
    private String linkedIn;
    @Column(name = "googleLocation")
    private String googleLocation;
    @Column(name = "photo")
    private String photo;
    @Column(name = "about_pl")
    private String aboutPl;
    @Column(name = "about_en")
    private String aboutEn;

    public PersonalData() {
    }

    public PersonalData(int id, String name, String surname, String phone, String email, String city, String street
            , String houseNo, String postCode, String gitHub, String webService, String skype, String linkedIn
            , String googleLocation, String photo, String aboutPl, String aboutEn) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.street = street;
        this.houseNo = houseNo;
        this.postCode = postCode;
        this.gitHub = gitHub;
        this.webService = webService;
        this.skype = skype;
        this.linkedIn = linkedIn;
        this.googleLocation = googleLocation;
        this.photo = photo;
        this.aboutPl = aboutPl;
        this.aboutEn = aboutEn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getWebService() {
        return webService;
    }

    public void setWebService(String webService) {
        this.webService = webService;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getGoogleLocation() {
        return googleLocation;
    }

    public void setGoogleLocation(String googleLocation) {
        this.googleLocation = googleLocation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAboutPl() {
        return aboutPl;
    }

    public void setAboutPl(String aboutPl) {
        this.aboutPl = aboutPl;
    }

    public String getAboutEn() {
        return aboutEn;
    }

    public void setAboutEn(String aboutEn) {
        this.aboutEn = aboutEn;
    }
}
