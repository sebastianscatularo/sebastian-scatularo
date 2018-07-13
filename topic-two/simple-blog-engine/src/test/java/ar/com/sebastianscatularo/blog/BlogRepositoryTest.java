package ar.com.sebastianscatularo.blog;

import ar.com.sebastianscatularo.blog.model.Blog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Sebastian Scatularo
 */
public class BlogRepositoryTest {
    @Test
    public void newBlog() {
        BlogRepository repository = new InMemoryBlogRepository();
        Blog blog = new Blog();
        blog.setName("My little blog");
        repository.save(blog);
        assertEquals(blog, repository.getByName(blog.getName()));
    }
}
