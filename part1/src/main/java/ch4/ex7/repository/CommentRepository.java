package ch4.ex7.repository;

import ch4.ex7.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
