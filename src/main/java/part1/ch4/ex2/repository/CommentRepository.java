package part1.ch4.ex2.repository;

import part1.ch4.ex2.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
