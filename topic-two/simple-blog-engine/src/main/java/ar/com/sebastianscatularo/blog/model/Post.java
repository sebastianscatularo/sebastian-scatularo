package ar.com.sebastianscatularo.blog.model;

import java.util.Date;
import java.util.List;

/**
 * @author Sebastian Scatularo
 */
public class Post {
    private List<Comment> comments;
    private String content;
    private Date issued;

    public List<Comment> getComments() {
        return comments;
    }

    public String getContent() {
        return content;
    }

    public Date getIssued() {
        return issued;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIssued(Date issued) {
        this.issued = issued;
    }
}
