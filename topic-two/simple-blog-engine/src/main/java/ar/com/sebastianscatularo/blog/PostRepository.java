package ar.com.sebastianscatularo.blog;

import ar.com.sebastianscatularo.blog.model.Post;

import java.util.Date;

/**
 * @author Sebastian Scatularo
 */
public interface PostRepository {
    Post save(Post post);

    Post findById(Date issued);
}
