
package bookrental;


import java.util.Date;

public class Saved extends AbstractEvent {

    private Long id;
    private Long userId;
    private Integer point;
    private String status;
    private Date chgDate;
    private Integer userTotalPoint;

    public Integer getUserTotalPoint() {
        return userTotalPoint;
    }

    public void setUserTotalPoint(Integer userTotalPoint) {
        this.userTotalPoint = userTotalPoint;
    }
    public Date getChgDate() {
        return chgDate;
    }

    public void setChgDate(Date chgDate) {
        this.chgDate = chgDate;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
