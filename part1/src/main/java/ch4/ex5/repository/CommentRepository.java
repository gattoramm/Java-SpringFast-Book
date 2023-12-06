package ch4.ex5.repository;

import ch4.ex5.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
