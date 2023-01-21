package part1.ch4.ex3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import part1.ch4.ex3.model.Comment;
import part1.ch4.ex3.proxy.CommentNotificationProxy;
import part1.ch4.ex3.repository.CommentRepository;

@Component
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
