package part1.ch4.ex1.proxy;

import part1.ch4.ex1.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
