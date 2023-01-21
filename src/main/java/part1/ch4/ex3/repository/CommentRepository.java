package part1.ch4.ex3.repository;

import part1.ch4.ex3.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
