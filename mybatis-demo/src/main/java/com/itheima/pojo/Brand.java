package com.itheima.pojo;


// alt + 鼠标左键 整列编辑
public class Brand {

    private Integer id;
    private String name;
    private String gender;
    private String address;
    private String major;


    public Brand() {
    }


    public Brand(int id, String username, String gender, String address,
             String major) {
        this.id = id;
        this.name = username;
        this.gender = gender;
        this.address = address;
        this.major = major;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
