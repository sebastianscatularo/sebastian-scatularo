package ar.com.sebastianscatularo.blog;

import ar.com.sebastianscatularo.blog.model.Comment;
import ar.com.sebastianscatularo.blog.model.Post;
import org.junit.Test;

import java.util.Collections;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author Sebastian Scatularo
 */
public class PostRepositoryTest {
    @Test
    public void addNewPost() {
        PostRepository repository = new InMemoryPostRepository();
        Post p = new Post();
        p.setComments(Collections.<Comment>emptyList());
        p.setContent("Hello World");
        p.setIssued(new Date());
        repository.save(p);
        assertEquals(p, repository.findById(p.getIssued()));
    }

}
