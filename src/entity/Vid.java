package entity;

public class Vid {
    private String id;
    private String date;
    private String title;
    private long view;

    public Vid() {
    }

    public Vid(String id, String date, String title, long view) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.view = view;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }
}
