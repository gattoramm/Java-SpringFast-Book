package ch4.ex4.proxy;

import ch4.ex4.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
