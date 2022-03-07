package dev.jimin.jpa;

import dev.jimin.jpa.entity.BoardEntity;
import dev.jimin.jpa.entity.PostEntity;
import dev.jimin.jpa.repository.BoardRepository;
import dev.jimin.jpa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {
    public TestComponent (
            @Autowired BoardRepository boardRepository,
            @Autowired PostRepository postRepository
            ) {
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setName("new board");
        BoardEntity newBoardEntity = boardRepository.save(boardEntity);

        PostEntity postEntity = new PostEntity();
        postEntity.setTitle("hello orm");
        postEntity.setContent("This Entity is created by hibernate");
        postEntity.setWriter("jimin");
        postEntity.setBoardEntity(newBoardEntity);
        PostEntity newPostEntity = postRepository.save(postEntity);

        System.out.println(postRepository.findAllByWriter("jimin").size());
    }
}
