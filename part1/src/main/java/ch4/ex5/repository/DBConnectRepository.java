package ch4.ex5.repository;

import org.springframework.stereotype.Component;
import ch4.ex5.model.Comment;

@Component
public class DBConnectRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
