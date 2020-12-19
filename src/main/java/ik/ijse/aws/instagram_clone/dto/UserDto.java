/*package ik.ijse.ws.instagram_clone.dto;

import org.springframework.web.multipart.MultipartFile;

public class UserDto {
    private String name;
    private String username;
    private String password;
    private String pro_pic;


    public UserDto() {
    }

    public UserDto(String name, String username, String password, String pro_pic) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.pro_pic = pro_pic;
    }

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPro_pic() {
        return pro_pic;
    }

    public void setPro_pic(String pro_pic) {
        this.pro_pic = pro_pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pro_pic='" + pro_pic + '\'' +
                '}';
    }
}*/
package ik.ijse.aws.instagram_clone.dto;
import org.springframework.web.multipart.MultipartFile;

        import java.io.File;

public class UserDto {
    private String name;
    private String username;
    private String password;
    private MultipartFile pro_pic;


    public UserDto() {
    }

    public UserDto(String name, String username, String password, MultipartFile pro_pic) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.pro_pic = pro_pic;
    }

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MultipartFile getPro_pic() {
        return pro_pic;
    }

    public void setPro_pic(MultipartFile pro_pic) {
        this.pro_pic = pro_pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pro_pic='" + pro_pic + '\'' +
                '}';
    }
}
