package ch4.ex3.proxy;

import ch4.ex3.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
