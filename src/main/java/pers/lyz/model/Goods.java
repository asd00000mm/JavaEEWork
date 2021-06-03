package pers.lyz.model;

import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class Goods {
    /**
     *
     */
    private String gId;
    /**
     *
     */
    private String gName;
    /**
     *
     */
    private Double gPrice;
    /**
     *
     */
    private Integer gNumber;
    /**
     *
     */
    private String gState;
    /**
     *
     */
    private Date gDate;

    @Override
    public String toString() {
        return "Goods{" +
                "gId='" + gId + '\'' +
                ", gName='" + gName + '\'' +
                ", gPrice=" + gPrice +
                ", gNumber=" + gNumber +
                ", gState='" + gState + '\'' +
                ", gDate=" + gDate +
                '}';
    }

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public Double getgPrice() {
        return gPrice;
    }

    public void setgPrice(Double gPrice) {
        this.gPrice = gPrice;
    }

    public Integer getgNumber() {
        return gNumber;
    }

    public void setgNumber(Integer gNumber) {
        this.gNumber = gNumber;
    }

    public String getgState() {
        return gState;
    }

    public void setgState(String gState) {
        this.gState = gState;
    }

    public Date getgDate() {
        return gDate;
    }

    public void setgDate(Date gDate) {
        this.gDate = gDate;
    }
}