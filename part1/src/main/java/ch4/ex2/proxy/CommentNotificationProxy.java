package ch4.ex2.proxy;

import ch4.ex2.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
