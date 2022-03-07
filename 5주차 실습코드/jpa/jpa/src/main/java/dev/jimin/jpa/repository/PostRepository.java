package dev.jimin.jpa.repository;

import dev.jimin.jpa.entity.BoardEntity;
import dev.jimin.jpa.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
    List<PostEntity> findAllByWriter(String writer);  // where writer = ?
    List<PostEntity> findAllByWriterAndBoardEntity(String writer, BoardEntity boardEntity); // where writer = ? and board_entity_id = ?
    List<PostEntity> findAllByWriterContaining(String writer);
}
