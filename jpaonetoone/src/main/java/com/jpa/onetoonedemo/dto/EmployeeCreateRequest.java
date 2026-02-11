package com.jpa.onetoonedemo.dto;

public class EmployeeCreateRequest {

    private String name;
    private String email;
    private ProfileDto profile;

    // getters & setters for EmployeeCreateRequest
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ProfileDto getProfile() {
        return profile;
    }

    public void setProfile(ProfileDto profile) {
        this.profile = profile;
    }

    // INNER DTO
    public static class ProfileDto {

        private String phone;
        private String address;

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
