package part1.ch4.ex7.proxy;

import part1.ch4.ex7.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
