package part1.ch4.ex6.proxy;

import part1.ch4.ex6.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
