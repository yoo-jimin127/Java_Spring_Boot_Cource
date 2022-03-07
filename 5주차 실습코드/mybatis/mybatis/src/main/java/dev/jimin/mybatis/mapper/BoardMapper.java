package dev.jimin.mybatis.mapper;

import dev.jimin.mybatis.dto.BoardDto;

public interface BoardMapper {
    int createBoard(BoardDto dto);
}
