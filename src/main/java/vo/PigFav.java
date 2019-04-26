package vo;

import java.util.Date;

public class PigFav {
    private Integer pigFavId;

    private String name;

    private String type;

    private Integer favId;

    private String favName;

    private String sts;

    private Date stsDate;

    private String account;

    private Integer pigId;

    public Integer getPigFavId() {
        return pigFavId;
    }

    public void setPigFavId(Integer pigFavId) {
        this.pigFavId = pigFavId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getFavId() {
        return favId;
    }

    public void setFavId(Integer favId) {
        this.favId = favId;
    }

    public String getFavName() {
        return favName;
    }

    public void setFavName(String favName) {
        this.favName = favName == null ? null : favName.trim();
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }

    public Date getStsDate() {
        return stsDate;
    }

    public void setStsDate(Date stsDate) {
        this.stsDate = stsDate;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Integer getPigId() {
        return pigId;
    }

    public void setPigId(Integer pigId) {
        this.pigId = pigId;
    }
}