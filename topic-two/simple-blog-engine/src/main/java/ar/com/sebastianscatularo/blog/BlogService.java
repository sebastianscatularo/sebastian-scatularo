package ar.com.sebastianscatularo.blog;

import ar.com.sebastianscatularo.blog.model.Blog;
import ar.com.sebastianscatularo.blog.model.Comment;
import ar.com.sebastianscatularo.blog.model.Post;

import java.util.Collections;
import java.util.Date;

/**
 * @author Sebastian Scatularo
 */
public class BlogService {
    private final PostRepository postRepository;
    private final BlogRepository blogRepository;

    public BlogService(PostRepository postRepository, BlogRepository blogRepository) {
        this.postRepository = postRepository;
        this.blogRepository = blogRepository;
    }

    public void newEntryPostOnBlog(String name, String content) {
        Blog blog = blogRepository.getByName(name);
        Post post = new Post();
        post.setContent(content);
        post.setIssued(new Date());
        post.setComments(Collections.<Comment>emptyList());
        postRepository.save(post);
        blog.getPost().add(post);
    }
}
