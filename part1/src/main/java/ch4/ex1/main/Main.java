package ch4.ex1.main;

import ch4.ex1.model.Comment;
import ch4.ex1.proxy.EmailCommentNotificationProxy;
import ch4.ex1.repository.DBConnectRepository;
import ch4.ex1.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBConnectRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();

        comment.setAuthor("Ramm");
        comment.setText("My Text");

        commentService.publishComment(comment);
    }
}
