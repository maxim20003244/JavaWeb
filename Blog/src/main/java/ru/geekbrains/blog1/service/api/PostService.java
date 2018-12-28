package ru.geekbrains.blog1.service.api;

import ru.geekbrains.blog1.dto.Post;

import java.util.List;

public interface PostService {
  List<Post> search(String query);
}
