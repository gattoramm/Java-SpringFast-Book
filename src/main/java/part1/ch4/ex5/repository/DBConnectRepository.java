package part1.ch4.ex5.repository;

import org.springframework.stereotype.Component;
import part1.ch4.ex5.model.Comment;

@Component
public class DBConnectRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
