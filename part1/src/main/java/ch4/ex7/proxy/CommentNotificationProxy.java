package ch4.ex7.proxy;

import ch4.ex7.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
