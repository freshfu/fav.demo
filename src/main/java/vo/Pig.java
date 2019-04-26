package vo;

import org.springframework.stereotype.Repository;


public class Pig {
    private Integer pigId;

    private String account;

    private String password;

    private String name;

    public Integer getPigId() {
        return pigId;
    }

    public void setPigId(Integer pigId) {
        this.pigId = pigId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}