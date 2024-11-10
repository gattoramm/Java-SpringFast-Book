package part1.ch4.ex3.proxy;

import part1.ch4.ex3.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
