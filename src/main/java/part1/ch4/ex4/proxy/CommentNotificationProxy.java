package part1.ch4.ex4.proxy;

import part1.ch4.ex4.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
