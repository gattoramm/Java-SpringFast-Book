package part1.ch4.ex2.proxy;

import part1.ch4.ex2.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
