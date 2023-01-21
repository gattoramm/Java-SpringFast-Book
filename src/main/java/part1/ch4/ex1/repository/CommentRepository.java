package part1.ch4.ex1.repository;

import part1.ch4.ex1.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
