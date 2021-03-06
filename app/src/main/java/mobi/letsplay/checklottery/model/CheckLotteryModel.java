package mobi.letsplay.checklottery.model;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class CheckLotteryModel extends RealmObject{
    @PrimaryKey
    private String Id;

    @Required
    private String lottery;

    @Required
    private String detail;

    private int typ;

    @Index
    private String DateTime;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getLottery() {
        return lottery;
    }

    public void setLottery(String lottery) {
        this.lottery = lottery;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getStatus() {
        return typ;
    }

    public void setStatus(int typ) {
        this.typ = typ;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }
}
