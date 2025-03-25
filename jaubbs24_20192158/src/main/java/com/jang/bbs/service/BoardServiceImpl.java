package com.jang.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jang.bbs.mapper.BoardMapper;
import com.jang.bbs.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<BoardVO> getBoardList() {
        return boardMapper.getBoardList();
    }

    @Override
    public BoardVO getArticle(int bno) {
        // 게시글 조회 시 조회수 증가
        boardMapper.incrementViewCnt(bno);
        return boardMapper.getArticle(bno);
    }

    @Override
    public void insertArticle(BoardVO board) {
        boardMapper.insertArticle(board);
    }

    @Override
    public void updateArticle(BoardVO board) {
        boardMapper.updateArticle(board);
    }

    @Override
    public void deleteArticle(int bno) {
        boardMapper.deleteArticle(bno);
    }

    @Override
    public void incrementGoodCnt(int bno) {
        boardMapper.incrementGoodCnt(bno);
    }
    
}
