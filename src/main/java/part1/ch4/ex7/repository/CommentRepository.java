package part1.ch4.ex7.repository;

import part1.ch4.ex7.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
