package ar.com.sebastianscatularo.blog.model;

import java.util.Date;

/**
 * @author Sebastian Scatularo
 */
public class Comment {
    private String userName;
    private String text;
    private Date issued;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getIssued() {
        return issued;
    }

    public void setIssued(Date issued) {
        this.issued = issued;
    }
}
