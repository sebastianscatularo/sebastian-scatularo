package ar.com.sebastianscatularo.blog;

import ar.com.sebastianscatularo.blog.model.Blog;

/**
 * @author Sebastian Scatularo
 */
public interface BlogRepository {
    void save(Blog blog);
    Blog getByName(String name);
}
