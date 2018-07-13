package ar.com.sebastianscatularo.blog;

import ar.com.sebastianscatularo.blog.model.Blog;
import ar.com.sebastianscatularo.blog.model.Post;
import javafx.geometry.Pos;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Sebastian Scatularo
 */
public class BlogServiceTest {
    @Test
    public void addPostToBlog() {
        PostRepository posts = mock(PostRepository.class);
        BlogRepository blogs = mock(BlogRepository.class);

        BlogService service = new BlogService(posts, blogs);
        Blog tmp = new Blog();
        tmp.setPost(new ArrayList<Post>());
        when(blogs.getByName("Mi Little Blog")).thenReturn(tmp);
        service.newEntryPostOnBlog("Mi Little Blog", "New Entry");
        verify(posts, times(1)).save(any(Post.class));
        assertEquals(1, tmp.getPost().size());
    }
}
