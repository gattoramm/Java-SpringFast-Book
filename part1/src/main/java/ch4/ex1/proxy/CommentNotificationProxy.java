package ch4.ex1.proxy;

import ch4.ex1.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
