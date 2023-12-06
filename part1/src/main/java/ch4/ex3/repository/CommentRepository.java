package ch4.ex3.repository;

import ch4.ex3.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
