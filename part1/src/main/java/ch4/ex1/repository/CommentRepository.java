package ch4.ex1.repository;

import ch4.ex1.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
