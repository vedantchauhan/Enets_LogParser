import java.util.HashMap;

/**
 * @author : Vedant
 */
public class EnetsBean {

    private String enets_id;
    private String username;
    private String table;
    private String date;
    private HashMap<String,String> history;

    public String getEnets_id() {
        return enets_id;
    }

    public String getUsername() {
        return username;
    }

    public String getTable() {
        return table;
    }

    public String getDate() {
        return date;
    }

    public HashMap<String, String> getHistory() {
        return history;
    }

    public void setEnets_id(String enets_id) {
        this.enets_id = enets_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHistory(HashMap<String, String> history) {
        this.history = history;
    }
}
