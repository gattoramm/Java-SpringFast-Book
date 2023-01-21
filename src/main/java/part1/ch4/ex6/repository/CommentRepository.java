package part1.ch4.ex6.repository;

import part1.ch4.ex6.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
