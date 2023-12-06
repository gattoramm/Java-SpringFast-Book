package ch4.ex1.repository;

import ch4.ex1.model.Comment;

public class DBConnectRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
