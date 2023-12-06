package ch4.ex7.proxy;

import org.springframework.stereotype.Component;
import ch4.ex7.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
