package ch4.ex6.repository;

import ch4.ex6.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
