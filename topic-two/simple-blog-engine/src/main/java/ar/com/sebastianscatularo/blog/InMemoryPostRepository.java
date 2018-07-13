package ar.com.sebastianscatularo.blog;

import ar.com.sebastianscatularo.blog.model.Post;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sebastian Scatularo
 */
public class InMemoryPostRepository implements PostRepository {
    private Map<Date, Post> posts = new HashMap<Date, Post>();

    public Post save(Post post) {
        return posts.put(post.getIssued(), post);
    }

    public Post findById(Date issued) {
        return posts.get(issued);
    }
}
