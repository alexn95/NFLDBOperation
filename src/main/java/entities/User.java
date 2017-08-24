

package entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

@SerializedName("auth_id")
@Expose
private String authId;

@SerializedName("email")
@Expose
private String mail;

@SerializedName("name")
@Expose
private String name;
@SerializedName("profile_photo")
@Expose
private String profilePhoto;
@SerializedName("role")
@Expose
private String role;
@SerializedName("user_id")
@Expose
private String userId;

/**
* No args constructor for use in serialization
* 
*/
public User() {
}

/**
* 
* @param authId
* @param userId
* @param name
* @param role
* @param profilePhoto
*/
public User(String authId, String mail, String name, String profilePhoto, String role, String userId) {
super();
this.authId = authId;
this.mail = mail;
this.name = name;
this.profilePhoto = profilePhoto;
this.role = role;
this.userId = userId;
}

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getAuthId() {
return authId;
}

public void setAuthId(String authId) {
this.authId = authId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getProfilePhoto() {
return profilePhoto;
}

public void setProfilePhoto(String profilePhoto) {
this.profilePhoto = profilePhoto;
}

public String getRole() {
return role;
}

public void setRole(String role) {
this.role = role;
}

public String getUserId() {
return userId;
}

public void setUserId(String userId) {
this.userId = userId;
}

}