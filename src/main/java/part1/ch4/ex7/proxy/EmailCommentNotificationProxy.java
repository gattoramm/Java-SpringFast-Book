package part1.ch4.ex7.proxy;

import org.springframework.stereotype.Component;
import part1.ch4.ex7.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
