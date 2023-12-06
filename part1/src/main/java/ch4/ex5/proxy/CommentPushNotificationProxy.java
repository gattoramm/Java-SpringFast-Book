package ch4.ex5.proxy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ch4.ex5.model.Comment;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
