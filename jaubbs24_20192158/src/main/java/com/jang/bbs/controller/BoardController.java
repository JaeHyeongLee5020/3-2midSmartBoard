package com.jang.bbs.controller;

import com.jang.bbs.model.BoardVO;
import com.jang.bbs.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("boardList", boardService.getBoardList());
		return "board/list";
	}

	@GetMapping("/write")
	public String writeForm() {
		return "board/write";
	}

	@PostMapping("/write")
	public String write(BoardVO board) {
		boardService.insertArticle(board);
		return "redirect:/board/list";
	}

	@GetMapping("/view/{bno}")
	public String view(@PathVariable("bno") int bno, Model model) {
		BoardVO board = boardService.getArticle(bno);
		model.addAttribute("board", board);
		return "board/view";
	}

	@PostMapping("/recommend/{bno}")
	@ResponseBody
	public String recommend(@PathVariable("bno") int bno) {
		boardService.incrementGoodCnt(bno);
		return "success";
	}

	@GetMapping("/delete/{bno}")
	public String delete(@PathVariable("bno") int bno) {
		boardService.deleteArticle(bno);
		return "redirect:/board/list";
	}

	@GetMapping("/edit/{bno}")
	public String editForm(@PathVariable("bno") int bno, Model model) {
		BoardVO board = boardService.getArticle(bno);
		model.addAttribute("board", board);
		return "board/edit";
	}

	@PostMapping("/edit")
	public String edit(BoardVO board) {
		boardService.updateArticle(board);
		return "redirect:/board/view/" + board.getBno();
	}

}
