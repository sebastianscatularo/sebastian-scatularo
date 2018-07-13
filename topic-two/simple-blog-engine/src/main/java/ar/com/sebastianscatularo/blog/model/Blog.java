package ar.com.sebastianscatularo.blog.model;

import java.util.List;

/**
 * @author Sebastian Scatularo
 */
public class Blog {
    private List<Post> post;
    private String name;

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
