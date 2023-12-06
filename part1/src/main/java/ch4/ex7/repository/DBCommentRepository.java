package ch4.ex7.repository;

import org.springframework.stereotype.Repository;
import ch4.ex7.model.Comment;

@Repository
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
