package com.jang.bbs.service;

import java.util.List;
import com.jang.bbs.model.BoardVO;

public interface BoardService {
    List<BoardVO> getBoardList();
    void insertArticle(BoardVO board);
    BoardVO getArticle(int bno);
    void updateArticle(BoardVO board);
    void deleteArticle(int bno);
    void incrementGoodCnt(int bno); // 추천수 증가 메소드 추가
}
