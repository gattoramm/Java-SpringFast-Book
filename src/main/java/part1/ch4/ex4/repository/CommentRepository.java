package part1.ch4.ex4.repository;

import part1.ch4.ex4.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
