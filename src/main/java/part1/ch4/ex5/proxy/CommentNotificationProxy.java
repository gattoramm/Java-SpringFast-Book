package part1.ch4.ex5.proxy;

import part1.ch4.ex5.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
