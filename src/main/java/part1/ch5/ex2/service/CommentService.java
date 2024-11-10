package part1.ch5.ex2.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import part1.ch5.ex2.repository.CommentRepository;

@Getter
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
}
