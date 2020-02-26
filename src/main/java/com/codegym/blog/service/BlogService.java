package com.codegym.blog.service;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;

public interface BlogService extends GeneralService<Blog> {
    Iterable<Blog> findAllByCategory(Category category);

    Iterable<Blog> findAllByAuthorContains(String author);
}
