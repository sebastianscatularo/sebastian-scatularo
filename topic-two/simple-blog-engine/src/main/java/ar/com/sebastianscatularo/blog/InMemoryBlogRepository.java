package ar.com.sebastianscatularo.blog;

import ar.com.sebastianscatularo.blog.model.Blog;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sebastian Scatularo
 */
public class InMemoryBlogRepository implements BlogRepository {
    private Map<String, Blog> blogs = new HashMap<>();

    public void save(Blog blog) {
        blogs.put(blog.getName(), blog);
    }

    @Override
    public Blog getByName(String name) {
        return blogs.get(name);
    }
}
