package part1.ch4.ex5.repository;

import part1.ch4.ex5.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
