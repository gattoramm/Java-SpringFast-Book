package part1.ch4.ex4.repository;

import part1.ch4.ex4.model.Comment;

public class DBConnectRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
