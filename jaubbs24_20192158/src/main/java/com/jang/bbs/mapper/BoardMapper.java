package com.jang.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jang.bbs.model.AttFileVO;
import com.jang.bbs.model.BoardLikeVO;
import com.jang.bbs.model.BoardVO;
import com.jang.bbs.model.BoardViewVO;
import com.jang.bbs.model.ReplyLikeVO;
import com.jang.bbs.model.ReplyVO;
import com.jang.bbs.model.SearchVO;

@Mapper
public interface BoardMapper {
	// 게시판 목록 조회
	List<BoardVO> getBoardList();

	// 게시판 글 조회
	BoardVO getArticle(int bno);

	// 게시판 글 생성
	void insertArticle(BoardVO board);

	// 게시판 글 수정
	void updateArticle(BoardVO board);

	// 게시판 글 삭제
	void deleteArticle(int bno);
	
	
	

	int getTotalBoardCount(SearchVO serchVO);
	
	
	

	// 조회수 증가
	void incrementViewCnt(int bno);

	// 답글 수 증가
	void incrementReplyCnt(int bno);

	// 추천수 증가
	void incrementGoodCnt(int bno);

	
	
	
	
	// 댓글 목록 조회
	List<ReplyVO> getReplyList(int bno);
	ReplyVO getReply(int rno);

	// 댓글 생성
	void writeReply(ReplyVO reply);

	// 댓글 수정
	void updateReply(ReplyVO reply);

	// 댓글 삭제
	void deleteReply(int rno);

	// 댓글 전체 삭제
	void deleteReplyByBno(int bno);

	// 댓글 추천수 증가
	int incReplyGoodCnt(int rno);

	
	
	
	// 첨부파일 목록 조회
	List<AttFileVO> getFileList(int bno);

	String getFileName(int fno);
	// 첨부파일 등록
	int insertFile(AttFileVO file);

	// 첨부파일 삭제
	void deleteFile(int fno);

	// 첨부파일 전체 삭제
	void deleteFileBybno(int bno);
	
	
	

	int addBoardLike(BoardLikeVO boardLike);
	int getBoardLike(BoardLikeVO boardLike);
	
	int addBoardLike(ReplyLikeVO replyLike);
	int getBoardLike(ReplyLikeVO replyLike);
	
	int addBoardLike(BoardViewVO boardView);
	int getBoardLike(BoardViewVO boardView);
	
}
