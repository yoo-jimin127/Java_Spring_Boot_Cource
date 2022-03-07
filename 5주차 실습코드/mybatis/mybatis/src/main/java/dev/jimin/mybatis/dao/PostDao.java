package dev.jimin.mybatis.dao;

import dev.jimin.mybatis.dto.PostDto;
import dev.jimin.mybatis.mapper.PostMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Repository
public class PostDao {
    private final SqlSessionFactory sessionFactory;

    public PostDao(
            @Autowired SqlSessionFactory sessionFactory
            ) {
        this.sessionFactory = sessionFactory;
    }

    public int createPost(PostDto dto) {
        try (SqlSession session = sessionFactory.openSession(true)) {
            PostMapper mapper = session.getMapper(PostMapper.class);
            return mapper.createPost(dto);
        }

//        SqlSession session = sessionFactory.openSession(true);
//        PostMapper mapper = session.getMapper(PostMapper.class);
//        int rowAffected = mapper.createPost(dto);
//        session.close();
//        return rowAffected;
    }

    public PostDto readPost(int id) {
        try (SqlSession session = sessionFactory.openSession()) {
            PostMapper mapper = session.getMapper(PostMapper.class);
            return mapper.readPost(id);
        }
    }

    public List<PostDto> readPostAll() {
        try (SqlSession session = sessionFactory.openSession()) {
            PostMapper mapper = session.getMapper(PostMapper.class);
            return mapper.readPostAll();
        }
    }

    public int updatePost(PostDto dto) {
        try (SqlSession session = sessionFactory.openSession()) {
            PostMapper mapper = session.getMapper(PostMapper.class);
            return mapper.updatePost(dto);
        }
    }

    public int deletePost(int id) {
        try (SqlSession session = sessionFactory.openSession()) {
            PostMapper mapper = session.getMapper(PostMapper.class);
            return mapper.deletePost(id);
        }
    }
}
